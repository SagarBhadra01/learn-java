public class StringManipulation {
    public static void main(String[] args) {
        String original = " Hello, World! ";
        
        // Trim whitespace
        String trimmed = original.trim();
        System.out.println("Trimmed: '" + trimmed + "'");
        
        // Convert to uppercase
        String uppercased = trimmed.toUpperCase();
        System.out.println("Uppercased: '" + uppercased + "'");
        
        // Replace characters
        String replaced = uppercased.replace("WORLD", "JAVA");
        System.out.println("Replaced: '" + replaced + "'");
        
        // Substring
        String substring = replaced.substring(7, 11);
        System.out.println("Substring: '" + substring + "'");
        
        // Length of the string
        int length = replaced.length();
        System.out.println("Length: " + length);

        //number string conversion
        String numberString = "12345";
        int number = Integer.parseInt(numberString);
        System.out.println("Number: " + number);

        // Concatenation
        String concatenated = replaced.concat(" - Enjoy coding!");
        System.out.println("Concatenated: '" + concatenated + "'");

        // Check if string contains a substring
        boolean containsJava = concatenated.contains("JAVA");
        System.out.println("Contains 'JAVA': " + containsJava);

        // Split string
        String[] parts = concatenated.split(" ");
        System.out.println("Split into parts:");
        for (String part : parts) {
            System.out.println(part);
        }

        // String to char array
        char[] charArray = concatenated.toCharArray();
        System.out.println("Character array:");
        for (char c : charArray) {
            System.out.print(c + " ");
        }
        System.out.println();

        // Join strings
        String joined = String.join(" | ", parts);
        System.out.println("Joined: '" + joined + "'");

        // String comparison
        String str1 = "Hello";
        String str2 = "World";
        int comparison = str1.compareTo(str2);
        System.out.println("Comparison: " + comparison);

        // Check if string is empty
        boolean isEmpty = "".isEmpty();
        System.out.println("Is empty string: " + isEmpty);

        // Reverse a string
        String toReverse = "ABCDE";
        String reversed = new StringBuilder(toReverse).reverse().toString();
        System.out.println("Reversed: '" + reversed + "'");

    }
}
