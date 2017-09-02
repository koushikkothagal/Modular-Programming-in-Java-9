package packt.addressbook.util;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import packt.addressbook.model.Contact;

public class ContactUtil {

    public List<Contact> getContacts() {
        List<Contact> contacts = Arrays.asList(
                new Contact("Edsger", "Dijkstra", "345-678-9012"),
                new Contact("Alan", "Turing", "456-789-0123"),
                new Contact("Ada", "Lovelace", "234-567-8901"),
                new Contact("Charles", "Babbage", "123-456-7890"),
                new Contact("Tim", "Berners-Lee", "456-789-0123")                
        );
        return contacts;
    }


}
