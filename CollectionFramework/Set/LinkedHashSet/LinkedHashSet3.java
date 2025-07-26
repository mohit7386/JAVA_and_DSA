//Custom Class (Student) Objects inside LinkedHashSet
//To jab bhi haamre paas custom class banane wala jisme humein elements add karne hain object me set me to hum hamesha override karte hain ye do methods ko jisse duplicates handle kiye ja sakein aur ye sabke liye same rahega hashset and linkedhashset and also for hashmap....agar hum inn methods ka use nahi karenge then hum duplicates ko handle nahi kar paayenge aur duplicate wala bhi print ho jaayega joki set ki property ke khilaaf hoga -> which is only storing unique elements

//Waise normal set banayenge to wo directly duplicate ko ignore kar dega but agar hum objects aur custom class bana rahe hain aur object se data store kara rahe hain set ke andar tabhi hum aisa karenge...

import java.util.*;

class Student {
    String name;
    int id;

    Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // equals method override karenge (taaki duplicate identify kar sake)
    /*
     * Java ka HashSet, LinkedHashSet, HashMap jaise data structures unique elements
     * rakhte hain.
     * 
     * Java ko kaise pata chale ki 2 objects same hain ya alag?
     * 
     * ➔ Java by default reference check karta hai (memory address dekhkar) —
     * yani agar new keyword se 2 baar bana diye, to chahe data same ho, Java bolega
     * "Alag object hai".
     * 
     * Isiliye humko custom logic dena padta hai:
     * 
     * Bhai dekh memory se nahi, id aur name se check kar.
     * 
     * Agar id aur name same hai, to same object samajh.
     * 
     * Ye kaam karwane ke liye equals() aur hashCode() override karte hain.
     * Kyuki Hashset and linkedhashset and hashmap ye sab unique elements ko store
     * karte hain to inka logic hai ki agar hum java ko nahi batayenge ye dono built
     * in methods ko override karke to java inko alag alag object maan lega jisse ki
     * dulicate aane par bhi wo usko ek alag element maanega alag object maanega
     * jisse wo usko add kar dega set me....to iss problem ko sort karne ke liye
     * humne ye dono methods ko override kar diya ab wp memory addrress se nahi ab
     * wo check karega ki name and id same hai to object bhi same hai and ignore kar
     * dega same object ko
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Student other = (Student) obj;
        return id == other.id && Objects.equals(name, other.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }
}

public class LinkedHashSet3 {
    public static void main(String[] args) {
        // creating the linkedhashset
        LinkedHashSet<Student> set = new LinkedHashSet<>();
        // adding the data with objects
        set.add(new Student("Aman", 1));
        set.add(new Student("Mohit", 2));
        set.add(new Student("Srishti", 3));
        set.add(new Student("Lucky", 4));
        set.add(new Student("Sejal", 5));
        set.add(new Student("Mohit", 2)); // Duplicate object

        System.out.println("Print the LinkedHashSet: ");
        for (Student s : set) {
            System.out.println(s.id + " " + s.name);
        }

    }

}
