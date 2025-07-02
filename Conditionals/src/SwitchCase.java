import java.util.Scanner;

public class SwitchCase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number (1 to 3): ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.println("You chose option 1.");
                break;
            case 2:
                System.out.println("You chose option 2.");
                break;
            case 3:
                System.out.println("You chose option 3.");
                break;
            default:
                System.out.println("Invalid option.");
                break;
        }

        scanner.close();
    }
}
