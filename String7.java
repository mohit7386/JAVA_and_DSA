public class String7 {
    public static void main(String[] args) {
        String str = "   Hello   ";
        System.out.println(str.trim()); // trim is a method of string which is used to remove the unwanted space in our
                                        // string
        String str1 = "Hello";
        String str2 = "hello";
        System.out.println(str1.equals(str2)); // false because fully content equal nhi hai isme 1st me H capital hai
                                               // aur second me h small hai isiliye false dega
        System.out.println(str1.equalsIgnoreCase(str2)); // True because isme upper case and lower case ko ignore kar
                                                         // deta hai aur true deta hai kyuki kewal content check karega
                                                         // ki same hai ya nhi baaki upper/lower case ko ignore kar dega

        String str3 = "Hello World";
        System.out.println(str3.indexOf("World")); // 6 it gives the index of first character only
        System.out.println(str3.startsWith("Hell")); // true - checks the string is start with the given string or not
        System.out.println(str3.endsWith("World")); // true - checks the string is end with the given string or not
        System.out.println(str3.charAt(5)); // gives the character or space present on the given indexing value

        String str4 = "123456789";
        int result = Integer.parseInt(str4); // ParseInt is a method of string which is used to convert any string into
                                             // integer format aur ye method tabhi kaam karega jab string jo diyaa gaya
                                             // hai wo fully numeric string honi chahiye aur ye static method hai joki
                                             // interger class ka part hai
        System.out.println(result);

        int num = 123345;
        String str5 = String.valueOf(num); // Valueof method is used to convert any primitive data type into string and
                                           // it also a static method joki String class ka part hai...
        System.out.println(str5); // Output: "1234"
        if (str5 instanceof String) { // instanceof method is used to check the string is a string or not
            System.out.println("Yes It is a String!");
        } else {
            System.out.println("It is not a String!");
        }
        System.out.println(str5.getClass().getName()); // Iss method se bhi hum check kar sakte hain ki wo method kis
                                                       // class ka hai yahan ye string show karega kyuki ye String jo
                                                       // hai wo String class
                                                       // ka part kyuki ek string hai str5 hai

        String str6 = "";
        System.out.println(str6.isEmpty()); // This method is use to check the string is empty or not

    }

}
