import java.util.Scanner;

public class startMenu {

    public static void Menu() {

        String loginString = "1. Login";
        String registerString = "2. Register";

        System.out.println(loginString + "\n" + registerString);

        Scanner scan = new Scanner(System.in);

        int menuInput = 0;
        boolean validInput = false;

        while(!validInput) {
            System.out.println("\n" + "Please provide a number from the menu");

            if(scan.hasNextInt()) {
                menuInput = scan.nextInt();
                validInput = true;
            } else {
                System.out.println("Invalid input. Please enter a valid integer.");
                scan.next();
            }
        }

        if (menuInput == 1) {
            loginPage.Login();
        } else if(menuInput == 2) {
            registerPage.Register();
        } else {
            System.out.println("Invalid option. Please choose 1 for Login or 2 for Register. " + "\n");
            Menu();
        }

    }

}
