import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class ContactServiceTest {

    private ContactService svc;
    private Contact c;

    @BeforeEach
    void setUp() {
        svc = new ContactService();
        c   = new Contact("1","Amy","Lee","0123456789","123");
    }

   @Test @DisplayName("addContact_fails_whenDuplicateId")
    void addContact_fails_whenDuplicateId() {
        svc.addContact(c);
        assertThrows(IllegalArgumentException.class, () -> svc.addContact(c));
    }
}