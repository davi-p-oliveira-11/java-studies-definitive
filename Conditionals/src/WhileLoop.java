import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {
        int counter = 0;

        System.out.println("Basic while loop:");
        while (counter < 5) {
            System.out.println("Counter = " + counter);
            counter++;
        }

        // User input example
        Scanner scanner = new Scanner(System.in);
        System.out.println("\nType numbers (0 to stop):");
        int number = scanner.nextInt();

        while (number != 0) {
            System.out.println("You typed: " + number);
            number = scanner.nextInt();
        }

        System.out.println("Loop ended.");

        scanner.close();
    }
}
