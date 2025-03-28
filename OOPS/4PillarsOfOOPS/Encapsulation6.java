//Encapsulation Inventory management example 
import java.util.*;
class InventoryManagement{
    //Data Hiding set as private 
    private String Product_Name;
    private int quantity;
    private double price;

    //creating a constructor
    public InventoryManagement(String Product_Name , int quantity , double price){
        this.Product_Name=Product_Name; //this refers to the current instance of the class which is InventoryManagement class 
        this.quantity=quantity;
        this.price=price;
    }

    //setter method for adding a stock
    public void addStock(int amount){
        if(amount>0){
            quantity = quantity +amount;
            System.out.println(amount+ " Items Added in the Stock!");
        }
        else{
            System.out.println("Invalid Stock Amount!");
        }
    }

    //Sell Product with Validation
    public void sellStock(int amount){
        if(amount>0 && amount <=quantity){
            quantity= quantity - amount;
            System.out.println(amount+" Items Sold!");
        }
        else{
            System.out.println("Invalid Sale! Not Enough Stock.");
        }
    }
    //Display Product details 
    public void displayDetails(){
        System.out.println("--------Product Details--------");
        System.out.println("Product Name: "+Product_Name);
        System.out.println("Quantity: "+quantity);
        System.out.println("Price: " + "$"+price);
    }
}
//Driver Code 
public class Encapsulation6 {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //creating an Object 
        InventoryManagement product = new InventoryManagement("Laptop", 2000, 550);

        while(true){
            System.out.println("\n--- Inventory Menu ---");
            System.out.println("1. Add Stock");
            System.out.println("2. Sell Product");
            System.out.println("3. Show Product Details");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");

            int choice = sc.nextInt();
            if(choice ==4){
                break;
            }
            switch(choice){
                case 1: System.out.println("Enter Stock Quantity you want to add: ");
                int addQty=sc.nextInt();
                product.addStock(addQty);
                break;

                case 2: System.out.println("Enter Qty you want to sell: ");
                int sellQty = sc.nextInt();
                product.sellStock(sellQty);
                break;

                case 3: product.displayDetails();
                break;
                default: System.out.println("Invalid Choice");
            }
        }
        sc.close();
    }   
}
