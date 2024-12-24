
//WAP to check the benjamin Bulbs toggling 
import java.util.*;

public class BenjaminBulbs {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Limit for Bulbs Toggling!");
    int n = sc.nextInt();
    for (int i = 1; i * i <= n; i++) {
      System.out.println(i * i);
    }
    sc.close();
  }
}