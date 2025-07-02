public class ForLoop {

    public static void main(String[] args) {

        // 1. Basic for loop: counting 0 to 4
        System.out.println("Basic for loop:");
        for (int i = 0; i < 5; i++) {
            System.out.println("i = " + i);
        }

        // 2. Custom step: counting by 2
        System.out.println("\nCounting by 2s:");
        for (int i = 0; i <= 10; i += 2) {
            System.out.println(i);
        }

        // 3. Reverse loop: countdown
        System.out.println("\nCountdown:");
        for (int i = 5; i > 0; i--) {
            System.out.println(i);
        }

        // 4. For loop with condition inside
        System.out.println("\nEven numbers between 1 and 10:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i + " is even");
            }
        }

        // 5. For-each loop with array (enhanced for loop)
        System.out.println("\nLooping through an array:");
        String[] fruits = { "Apple", "Banana", "Orange" };
        for (String fruit : fruits) {
            System.out.println(fruit);
        }
    }
}
