public class loops {
    public static void main(String[] args) {
        // For Loop
        System.out.println("For Loop:");
        for (int i = 1; i <= 5; i++) {
            System.out.println("Iteration: " + i);
        }

        // While Loop
        System.out.println("\nWhile Loop:");
        int count = 1;
        while (count <= 5) {
            System.out.println("Count: " + count);
            count++;
        }

        // Do-While Loop
        System.out.println("\nDo-While Loop:");
        int num = 1;
        do {
            System.out.println("Number: " + num);
            num++;
        } while (num <= 5);

        // Enhanced For Loop (For-Each Loop)
        System.out.println("\nEnhanced For Loop:");
        String[] fruits = {"Apple", "Banana", "Cherry"};
        for (String fruit : fruits) {
            System.out.println("Fruit: " + fruit);
        }

        // Nested Loops
        System.out.println("\nNested Loops:");
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println("i: " + i + ", j: " + j);
            }
        }

        // Break Statement
        System.out.println("\nBreak Statement:");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.println("i: " + i);
        }

        // Continue Statement
        System.out.println("\nContinue Statement:");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd number: " + i);
        }
    }
}
