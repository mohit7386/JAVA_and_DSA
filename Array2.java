public class Array2 {
    public static void main(String[] args) {
        // here we are creating the array with enhanced for loop
        int[] numbers = { 1, 2, 3, 4, 5 };
        // creating the enhanced for loop for traversing the each element of the array
        System.out.println("Enhanced For loop:-");
        for (int num : numbers) { // Enhanced for loop me kuch nahi hota hai bas jaise normal loop me hum ek naya
                                  // variable use karte hain na 'i' jiski help se array ke elements ko traverse
                                  // karte hain same aise hi isme enhanced for loop me hum karengenum reperesrnt
                                  // kar raha hai jisse ye array ke elements ko traverse karega
            System.out.println(num);
        }
    }

}
