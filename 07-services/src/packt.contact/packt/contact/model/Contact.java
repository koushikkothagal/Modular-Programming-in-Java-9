package packt.contact.model;

public class Contact implements Comparable{

    private String id;
    private String firstName;
    private String lastName;
    private String phone;
    private Address address;
    
    public Contact() {}

    public Contact(String id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String toString() {
        return this.firstName + " " + this.lastName;
    }

    public int compareTo(Object other) {
        Contact otherContact = (Contact)other;
        return this.lastName.compareTo(otherContact.lastName);
    }


}