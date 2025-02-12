import java.util.Scanner;

public class registerPage {

    public static void Register() {

        System.out.println("Please provide a username and password to register");

            Scanner scan = new Scanner(System.in);

        System.out.println("Username:");

            String username = scan.nextLine();

        System.out.println("Password:");

            String password = scan.nextLine();

        System.out.println("Please confirm your password:");

            String passwordConfirmation = scan.nextLine();

        scan.close();

        if(password.equals(passwordConfirmation)) {
            System.out.println("You have succesfully registerd!");
        } else {
            System.out.println("The passwords did not match, please try again.");
            Register();
        }

    }
}
