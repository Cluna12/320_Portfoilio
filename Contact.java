public class Contact {

    // Fields 
    private final String contactId;          // immutable requirement
    private String firstName;
    private String lastName;
    private String phone;
    private String address;

    // Constructor 
    public Contact(String contactId,
                   String firstName,
                   String lastName,
                   String phone,
                   String address) {

        // 1 ID: required, ≤ 10 chars
        if (contactId == null || contactId.length() > 10)
            throw new IllegalArgumentException("Bad id");
        this.contactId = contactId;

        // 2 First / last: required, ≤ 10 chars
        if (firstName == null || firstName.length() > 10)
            throw new IllegalArgumentException("Bad first name");
        if (lastName == null || lastName.length() > 10)
            throw new IllegalArgumentException("Bad last name");
        this.firstName = firstName;
        this.lastName  = lastName;

        // 3 Phone: required, exactly 10 digits
        if (phone == null || !phone.matches("\\d{10}"))
            throw new IllegalArgumentException("Bad phone");
        this.phone = phone;

        // 4 Address: required, ≤ 30 chars
        if (address == null || address.length() > 30)
            throw new IllegalArgumentException("Bad address");
        this.address = address;
    }

    // Getters 
    public String getContactId() { return contactId; }
    public String getFirstName() { return firstName; }
    public String getLastName()  { return lastName;  }
    public String getPhone()     { return phone;     }
    public String getAddress()   { return address;   }

    // Setters 
    public void setFirstName(String firstName) {
        if (firstName == null || firstName.length() > 10)
            throw new IllegalArgumentException("Bad first name");
        this.firstName = firstName;
    }
    public void setLastName(String lastName) {
        if (lastName == null || lastName.length() > 10)
            throw new IllegalArgumentException("Bad last name");
        this.lastName = lastName;
    }
    public void setPhone(String phone) {
        if (phone == null || !phone.matches("\\d{10}"))
            throw new IllegalArgumentException("Bad phone");
        this.phone = phone;
    }
    public void setAddress(String address) {
        if (address == null || address.length() > 30)
            throw new IllegalArgumentException("Bad address");
        this.address = address;
    }
}