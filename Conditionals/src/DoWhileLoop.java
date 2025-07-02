import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {
        int count = 1;

        System.out.println("Basic do-while loop:");
        do {
            System.out.println("Count = " + count);
            count++;
        } while (count <= 5);

        // User input example
        Scanner scanner = new Scanner(System.in);
        int number;

        System.out.println("\nEnter numbers (0 to quit):");

        do {
            System.out.print("Number: ");
            number = scanner.nextInt();
            if (number != 0) {
                System.out.println("You typed: " + number);
            }
        } while (number != 0);

        System.out.println("Loop ended.");

        scanner.close();
    }
}
