//WAP to remove the even number of elements in the list using linkedlist
import java.util.*;

public class Linkedlist3 {
     public static void main(String[] args){
        //creating a linkedlist 
        List<Integer> list =new LinkedList<>();
        //adding the data into the list 
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        //printing the original list
        System.out.println("Original List: "); 
        System.out.println(list);

        //Safely Remove the even integers from the list so for safely removal we use always Iterator
        Iterator<Integer> it = list.iterator();
        while(it.hasNext()){  //hasnext() is used to check the element is present or not
            int num = it.next(); //next is used to move the next element 
          if(num%2==0){
            it.remove();
          }
        }
        System.out.println("List after removing the even numbers: ");
        System.out.println(list);

     }    
}
