import java.util.Scanner;

public class loginPage {

    public static void Login() {

        String loginString = "Please fill in your username and password" + "\n";

        System.out.println(loginString);

            Scanner scan = new Scanner(System.in);

                System.out.println("Username:");

            String username = scan.nextLine();

                System.out.println("Password:");

            String password = scan.nextLine();

            scan.close();

//            System.out.println(username + " " + password);
            System.out.println("You are now logged in!");

    }
}
