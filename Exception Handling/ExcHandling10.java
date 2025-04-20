//throw example - Read a file and handle file not found exception using throws

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExcHandling10 {
    public static void checkfile() throws FileNotFoundException {
        FileReader fr = new FileReader("data.txt"); // throws filenotfound exception if file doesn't exist
        System.out.println("File Found Successfully!");
    }

    public static void main(String[] args) {
        try {
            checkfile(); // method that might throw an excepton
        } catch (FileNotFoundException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }

    }

}
