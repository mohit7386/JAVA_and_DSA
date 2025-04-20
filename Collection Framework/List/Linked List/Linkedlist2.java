//Sort a LinkedList of Custom Class Task by Priority (Ascending)
import java.util.*;
//create the custom class task
class Task{
     int id;
     String title;
     int priority;

     Task(int id , String title , int priority){
        this.id=id;
        this.title=title;
        this.priority=priority;
     }
     //Override toString method()
     @Override
     public String toString(){  /*toString() ek special method hai Java Object class ka —
        iska kaam hota hai:
        Jab bhi kisi object ko print karte ho, uska readable String version dena.
        Without Override and with toString() -> Output will be -> Task@7a81197d   // (ClassName@Hashcode)
 */
        return "Id: "+id+ "     Title: "+title+ "   Priority: "+priority;
     }
}
//main code
public class Linkedlist2 {
    public static void main(String[] args){
        //creating a list
        List<Task> list = new LinkedList<>();
        //adding data to the list 
        list.add(new Task(4050, "Mohit    ", 5)); //ek naya Task object banaya jaa raha hai using constructor
        list.add(new Task(5040, "Aman     ", 1));
        list.add(new Task(6740, "Lucky    ", 3));
        list.add(new Task(5552, "Namit    ", 4));
        list.add(new Task(3223, "Abhishek ", 2));
        //sort the data on the basis of their priorities in ascending order
        Collections.sort(list , new Comparator<Task>() {
            @Override
            public int compare(Task a , Task b){
                return a.priority - b.priority;
            }
        });
        //Printing the sorted data
        for(Task task : list){
            System.out.println(task);
        }

    }
}
