//WAP and create a list of names using linked list 
import java.util.*;

public class Linkedlist1 {
    public static void main(String[] args){
        //create a list 
        LinkedList<String> list = new LinkedList<>();  //here we are using the linkedlist
        //adding the data into the list 
        list.add("Mohit");
        list.add("Namit");
        list.add("Raman");
        list.add("Krish");
        list.add("Sejal");
        //printing the data of the list 
        System.out.println(list);
        //Now we are using the methods of the linkedlist
        //addFirst() method to add the data at the beginning
        list.addFirst("Aman");
        System.out.println("After Adding name at the beginning: "+list);
        list.addLast("Bosky");
        System.out.println("After adding at the last: "+list);
        //Getting first and last index 
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        //remove First from the list 
        System.out.println("Removing first element: "+list.removeFirst());
        System.out.println(list);
        //Accessing through index 
        System.out.println("Name at the index 2: "+list.get(2));
        //Checking if the name exists or not 
        System.out.println("Name exist: "+list.contains("Sejal"));
        //checking the size
        System.out.println("Size of the list: "+list.size());

    }
    
}
