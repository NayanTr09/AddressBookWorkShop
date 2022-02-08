import com.addressbookworkshop.AddressBookWorkshop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AddressBookTest { // Test case to validate Contacts entry
    @Test
    public void ValidateContacts() {
        AddressBookWorkshop AddressBook = new AddressBookWorkshop();
        String result = AddressBook.CreateContacts("Nayan", "Tripathi", "WhiteHouse", "Delhi", "110085", "nayantripathi42@gmail.com");
        Assertions.assertEquals("Contact added!!",result);
    }
}
