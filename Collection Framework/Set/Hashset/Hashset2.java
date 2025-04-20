
//WAP in hashset and create a contacts app
import java.util.*;

public class Hashset2 {
    public static void main(String[] args) {
        // creating hashset
        HashSet<String> Contacts = new HashSet<>();
        // Hashset Internally Hashmap ka use karta hai and jab hum add kar rhe hote hain
        // koi bhi element isme to wo hashcode me store hota hai..
        // adding the data into the hashset
        Contacts.add("Aman");
        Contacts.add("Lucky");
        Contacts.add("Krish");
        Contacts.add("Sejal");
        Contacts.add("Krish"); // Duplicate so it will remove automatically by Hashset
        System.out.println("Contacts: " + Contacts); // Order random rahega kuch bhi ho sakta hai because insertion
                                                     // order maintain nahi hota isme but duplicates allowed nahi honge

        // search if a contacts exists
        if (Contacts.contains("Krish")) {
            System.out.println("Krish is in your contacts!");
        }

        // Remove the contact
        System.out.println(Contacts.remove("Sejal"));
        System.out.println("Updated Contacts: " + Contacts);

    }

}
