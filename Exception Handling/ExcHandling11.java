
//Custom Exception - You can create your own exception class by extending Exception or RuntimeException
import java.util.Scanner;

class UserNotFoundException extends Exception {
    public UserNotFoundException(String message) {
        super(message);
    }
}

class LoginSystem {
    private static String[] users = { "krishna", "radha", "arjun" };

    public static void login(String username) throws UserNotFoundException {
        boolean found = false;

        for (String user : users) {
            if (user.equals(username)) {
                found = true;
                break;
            }
        }

        if (!found) {
            throw new UserNotFoundException("User " + username + " not found!");
        }

        System.out.println("Welcome " + username + "! Login Successful ✅");
    }
}

public class ExcHandling11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter username to login: ");
        String inputUser = sc.nextLine();

        try {
            LoginSystem.login(inputUser);
        } catch (UserNotFoundException e) {
            System.out.println("Exception Caught: " + e.getMessage());
        }
    }
}
