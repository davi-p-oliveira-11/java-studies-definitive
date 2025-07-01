import java.util.Scanner;

public class Operators {

    public static void main(String[] args) {
        var scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = scanner.nextInt();

        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        // Arithmetic Operators
        System.out.println("== Arithmetic Operators ==");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));

        // Relational Operators
        System.out.println("\n== Relational Operators ==");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));

        // Logical Operators
        System.out.println("\n== Logical Operators ==");
        boolean result = (a > 0 && b > 0);
        System.out.println("Both a and b are positive (a > 0 && b > 0): " + result);

        result = (a > 0 || b > 0);
        System.out.println("At least one is positive (a > 0 || b > 0): " + result);

        result = !(a > 0);
        System.out.println("a is NOT greater than 0 (!(a > 0)): " + result);

        // Assignment Operators
        System.out.println("\n== Assignment Operators ==");
        int x = a;
        System.out.println("x = a: " + x);
        x += b;
        System.out.println("x += b: " + x);
        x -= b;
        System.out.println("x -= b: " + x);
        x *= b;
        System.out.println("x *= b: " + x);
        x /= b;
        System.out.println("x /= b: " + x);
        x %= b;
        System.out.println("x %= b: " + x);

        // Unary Operators
        System.out.println("\n== Unary Operators ==");
        int unary = a;
        System.out.println("Initial unary = " + unary);
        System.out.println("++unary: " + (++unary));
        System.out.println("--unary: " + (--unary));
        System.out.println("-unary: " + (-unary));

        // Ternary Operator
        System.out.println("\n== Ternary Operator ==");
        String message = (a > b) ? "a is greater than b" : "a is not greater than b";
        System.out.println(message);

        scanner.close();
    }
}
