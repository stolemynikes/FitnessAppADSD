import java.util.Scanner;

public class registerPage {

    public static void Register() {

        Scanner scan  = new Scanner(System.in);

        System.out.println("Please provide a username and password to register");

        System.out.println("Username:");
        String username = scan.nextLine();

        System.out.println("Password:");
        String password = scan.nextLine();

        String passwordConfirmation;

        while(true) {

            System.out.println("Please confirm your password");
            passwordConfirmation = scan.nextLine();

            if(password.equals(passwordConfirmation)) {
                System.out.println("Registration succesful, welcome: " + username);
                break;
            } else {
                System.out.println("Passwords do not match, please try again:");
            }

        }

        scan.close();

    }


}
