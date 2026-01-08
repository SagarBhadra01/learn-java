public class Operators {
    public static void main(String[] args) {

        // Arithmetic Operators
        int a = 10;
        int b = 5;
        System.out.println("Arithmetic Operators:");
        System.out.println("Addition: " + (a + b));          // 15
        System.out.println("Subtraction: " + (a - b));       // 5
        System.out.println("Multiplication: " + (a * b));    // 50
        System.out.println("Division: " + (a / b));          // 2
        System.out.println("Modulus: " + (a % b));           // 0

        // Relational Operators
        System.out.println("\nRelational Operators:");
        System.out.println("Equal to: " + (a == b));         // false
        System.out.println("Not equal to: " + (a != b));     // true
        System.out.println("Greater than: " + (a > b));      // true
        System.out.println("Less than: " + (a < b));         // false
        System.out.println("Greater than or equal to: " + (a >= b)); // true
        System.out.println("Less than or equal to: " + (a <= b));    // false

        // Logical Operators
        boolean x = true;
        boolean y = false;
        System.out.println("\nLogical Operators:");
        System.out.println("AND: " + (x && y));              // false
        System.out.println("OR: " + (x || y));               // true
        System.out.println("NOT: " + (!x));                  // false

        // Assignment Operators
        int c = 20;
        System.out.println("\nAssignment Operators:");
        c += 5;  // c = c + 5
        System.out.println("c after += 5: " + c);           // 25
        c -= 3;  // c = c - 3
        System.out.println("c after -= 3: " + c);           // 22
        c *= 2;  // c = c * 2
        System.out.println("c after *= 2: " + c);           // 44
        c /= 4;  // c = c / 4
        System.out.println("c after /= 4: " + c);           // 11

        // Increment and Decrement Operators
        System.out.println("\nIncrement and Decrement Operators:");
        int d = 5;
        System.out.println("d before increment: " + d);      // 5
        System.out.println("d after increment: " + (++d));    // 6
        System.out.println("d after decrement: " + (--d));    // 5
        System.out.println("d after post-increment: " + (d++)); // 5
        System.out.println("d after post-decrement: " + (d--)); // 5

        // Ternary Operator
        System.out.println("\nTernary Operator:");
        int age = 18;
        String eligibility = (age >= 18) ? "Eligible to vote" : "Not eligible to vote";
        System.out.println(eligibility);

        //bitwise Operators
        System.out.println("\nBitwise Operators:");
        int e = 5;
        int f = 3;
        System.out.println("AND: " + (e & f));              // 1
        System.out.println("OR: " + (e | f));               // 7
        System.out.println("XOR: " + (e ^ f));              // 6
        System.out.println("NOT: " + (~e));                 // -6
        System.out.println("Left Shift: " + (e << 1));      // 10
        System.out.println("Right Shift: " + (e >> 1));     // 2
        System.out.println("Unsigned Right Shift: " + (e >>> 1)); // 2
    }
}
