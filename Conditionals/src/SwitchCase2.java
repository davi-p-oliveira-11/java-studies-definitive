import java.util.Scanner;

public class SwitchCase2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a day number (1 to 7): ");
        int day = scanner.nextInt();

        String dayName = switch (day) {
            case 1 -> "Sunday";
            case 2 -> "Monday";
            case 3 -> "Tuesday";
            case 4 -> "Wednesday";
            case 5 -> "Thursday";
            case 6 -> "Friday";
            case 7 -> "Saturday";
            default -> "Invalid day";
        };

        System.out.println("Day: " + dayName);

        scanner.close();
    }
}
