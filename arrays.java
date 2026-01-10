public class arrays {
    public static void main(String[] args) {
        // Declare and initialize an array
        int[] numbers = {10, 20, 30, 40, 50};

        // Accessing array elements
        System.out.println("First element: " + numbers[0]);
        System.out.println("Third element: " + numbers[2]);

        // Modifying array elements
        numbers[1] = 25;
        System.out.println("Modified second element: " + numbers[1]);

        // Array length
        System.out.println("Array length: " + numbers.length);

        // Looping through an array
        System.out.println("Array elements:");
        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }

        // Enhanced for loop
        System.out.println("Array elements using enhanced for loop:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Multi-dimensional array
        int[][] matrix = {
            {1, 2, 3},
            {4, 5, 6},
            {7, 8, 9}
        };

        // Accessing multi-dimensional array elements
        System.out.println("Element at (1,2): " + matrix[1][2]);

        // Looping through a multi-dimensional array
        System.out.println("Multi-dimensional array elements:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Array of strings
        String[] fruits = {"Apple", "Banana", "Cherry"};

        // Looping through an array of strings
        System.out.println("Array of strings:");
        for (String fruit : fruits) {
            System.out.println(fruit);
        }

        // Jagged array
        int[][] jaggedArray = {
            {1, 2},
            {3, 4, 5},
            {6}
        };

        // Looping through a jagged array
        System.out.println("Jagged array elements:");
        for (int i = 0; i < jaggedArray.length; i++) {
            for (int j = 0; j < jaggedArray[i].length; j++) {
                System.out.print(jaggedArray[i][j] + " ");
            }
            System.out.println();
        }   

        // Array copying
        int[] copiedArray = new int[numbers.length];
        System.arraycopy(numbers, 0, copiedArray, 0, numbers.length);
        System.out.println("Copied array elements:");
        for (int num : copiedArray) {
            System.out.println(num);
        }

        // Sorting an array
        java.util.Arrays.sort(numbers);
        System.out.println("Sorted array elements:");
        for (int num : numbers) {
            System.out.println(num);
        }

        // Searching in an array
        int searchValue = 30;
        int searchIndex = java.util.Arrays.binarySearch(numbers, searchValue);  
        System.out.println("Index of " + searchValue + ": " + searchIndex);

        // Filling an array
        int[] filledArray = new int[5];
        java.util.Arrays.fill(filledArray, 10);
        System.out.println("Filled array elements:");
        for (int num : filledArray) {
            System.out.println(num);
        }

        // Converting array to string
        String arrayString = java.util.Arrays.toString(numbers);
        System.out.println("Array as string: " + arrayString);

        // Converting string to array
        String str = "A,B,C,D,E";
        String[] strArray = str.split(",");
        System.out.println("String to array:");
        for (String s : strArray) {
            System.out.println(s);
        }   

        // Multi-dimensional array copying
        int[][] copiedMatrix = new int[matrix.length][];    
        for (int i = 0; i < matrix.length; i++) {
            copiedMatrix[i] = new int[matrix[i].length];
            System.arraycopy(matrix[i], 0, copiedMatrix[i], 0, matrix[i].length);
        }
        System.out.println("Copied multi-dimensional array elements:");
        for (int i = 0; i < copiedMatrix.length; i++) {     
            for (int j = 0; j < copiedMatrix[i].length; j++) {
                System.out.print(copiedMatrix[i][j] + " ");
            }
            System.out.println();
        }   

        // Finding maximum and minimum in an array
        int max = java.util.Arrays.stream(numbers).max().getAsInt();
        int min = java.util.Arrays.stream(numbers).min().getAsInt();
        System.out.println("Maximum value: " + max);
        System.out.println("Minimum value: " + min);    

        // Summing elements of an array
        int sum = java.util.Arrays.stream(numbers).sum();
        System.out.println("Sum of array elements: " + sum);

        // Average of array elements
        double average = java.util.Arrays.stream(numbers).average().getAsDouble();
        System.out.println("Average of array elements: " + average);

    }
}
