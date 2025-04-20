public class String0 {
    public static void main(String[] args) {
        // Literal Method
        // here we are creating the same strings
        String name1 = "Mohit";
        String name2 = "Mohit";

        // new Keyword Method
        String name3 = new String("Mohit");

        System.out.println(name1 == name2); // true (same reference) because of literal method because here new object
                                            // create nhi hoga agar same value ka hum naya string create karte hain to
                                            // aur purane wale se hi refrence diya jaayega jisse ye memory efficient
                                            // hota hai...
        System.out.println(name1 == name3); // false (different reference) Because yahan new keyword ke kaaran naya
                                            // object heap memory me create ho gaya hai jisse ki chahe string pool ke
                                            // andar same string ho tab bhi naya object create hoga aur purane wale se
                                            // ye refrence nahi lga isiliye false return kar raha hai
    }
}
