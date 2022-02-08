/* @author : Nayan Tripathi
@Date : 08/02/2022
Workshop Program : AddressBook
 */

package com.addressbookworkshop;

import java.util.ArrayList;

public class AddressBookWorkshop {
    public static void main(String args[]) {
        System.out.println("This is a Address Book! "); //Display Welcome message
    }

    public String CreateContacts(String FirstName2, String LastName2, String Address2, String City2, String Zip2, String Email2){
        Contacts contacts = new Contacts(FirstName2,LastName2,Address2,City2,Zip2,Email2);

        ArrayList<String> contact = new ArrayList<>();
        contact.add(FirstName2);
        contact.add(LastName2);
        contact.add(Address2);
        contact.add(City2);
        contact.add(Zip2);
        contact.add(Email2);
        return "Contact added!!";
    }
}
