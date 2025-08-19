import java.util.HashMap;
import java.util.Map;

public class ContactService {

    private final Map<String, Contact> contacts = new HashMap<>();

    public void addContact(Contact contact) {
        if (contacts.containsKey(contact.getContactId()))
            throw new IllegalArgumentException("Duplicate id");
        contacts.put(contact.getContactId(), contact);
    }

    public void deleteContact(String id) {
        if (contacts.remove(id) == null)
            throw new IllegalArgumentException("Id not found");
    }

    public void updateFirstName(String id, String v) { get(id).setFirstName(v); }
    public void updateLastName (String id, String v) { get(id).setLastName(v);  }
    public void updatePhone    (String id, String v) { get(id).setPhone(v);     }
    public void updateAddress  (String id, String v) { get(id).setAddress(v);   }

    private Contact get(String id) {
        Contact c = contacts.get(id);
        if (c == null) throw new IllegalArgumentException("Id not found");
        return c;
    }
}