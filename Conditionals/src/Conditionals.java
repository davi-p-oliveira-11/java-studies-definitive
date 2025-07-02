import java.util.Scanner;

public class Conditionals {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Using if / else if / else
        if (age < 13) {
            System.out.println("You are a child.");
        } else if (age >= 13 && age < 18) {
            System.out.println("You are a teenager.");
        } else if (age >= 18 && age < 60) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a senior.");
        }

        // Using the ternary operator
        String votingStatus = (age >= 18) ? "You can vote." : "You are too young to vote.";
        System.out.println(votingStatus);

        scanner.close();
    }
}
