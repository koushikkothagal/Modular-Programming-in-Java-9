package packt.addressbook;

import java.util.List;

import packt.addressbook.util.ContactUtil;
import packt.util.SortUtil;
import packt.addressbook.model.Contact;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello! Testing");
        ContactUtil contactUtil = new ContactUtil();
        SortUtil sortUtil = new SortUtil();
        List<Contact> contacts = contactUtil.getContacts();
        sortUtil.sortList(contacts);
        System.out.println(contacts);
    }
}