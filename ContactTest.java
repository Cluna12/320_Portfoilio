import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ContactTest {

   @Test @DisplayName("createContact_succeeds_withValidFields")
    void createContact_succeeds_withValidFields() {
        Contact c = new Contact("123","Amy","Lee","0123456789","123 Road");
        assertEquals("Amy", c.getFirstName());
    }

    @Test @DisplayName("createContact_fails_whenIdTooLong")
    void createContact_fails_whenIdTooLong() {
        assertThrows(IllegalArgumentException.class,
                     () -> new Contact("12345678901","Amy","Lee","0123456789","123"));
    }
}