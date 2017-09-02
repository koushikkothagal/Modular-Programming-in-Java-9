package packt.addressbook.model;

public class Contact implements Comparable{

    private String id;
    private String firstName;
    private String lastName;

    public Contact(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String toString() {
        return this.firstName + " " + this.lastName;
    }

    public int compareTo(Object other) {
        Contact otherContact = (Contact)other;
        return this.lastName.compareTo(otherContact.lastName);
    }


}