package packt.contact.util;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import packt.contact.internal.XmlUtil;
import packt.contact.model.Address;
import packt.contact.model.Contact;

public class ContactLoader {

	
	public List<Contact> parseXml(String fileName) throws ContactLoadException {

		List<Contact> contacts = new ArrayList<>();
		XmlUtil xmlUtil = new XmlUtil();
		
		
		Document doc;
		try {
			doc = xmlUtil.loadXmlFile(fileName);
		} catch (ParserConfigurationException | SAXException | IOException e) {
			throw new ContactLoadException("Unable to load Contact file");
		}
		NodeList nList = doc.getElementsByTagName("contact");
		for (int temp = 0; temp < nList.getLength(); temp++) {
			Node contactNode = nList.item(temp);
			if (contactNode.getNodeType() == Node.ELEMENT_NODE) {
				Element eElement = (Element) contactNode;

				Contact contact = new Contact();
				contact.setFirstName(xmlUtil.getElement(contactNode, "firstname"));
				contact.setLastName(xmlUtil.getElement(contactNode, "lastname"));
				contact.setPhone(xmlUtil.getElement(contactNode, "phone"));
				Node addressNode = eElement.getElementsByTagName("address").item(0);

				Address address = new Address();
				address.setStreet(xmlUtil.getElement(addressNode, "street"));
				address.setCity(xmlUtil.getElement(addressNode, "city"));
				address.setState(xmlUtil.getElement(addressNode, "state"));
				address.setCountry(xmlUtil.getElement(addressNode, "country"));
				contact.setAddress(address);

				contacts.add(contact);
			}
		}
		return contacts;
	}

	
}
