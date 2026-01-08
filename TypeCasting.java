public class TypeCasting {
    /*Type casting means converting one data type into another. For example, turning an int into a double.

In Java, there are two main types of casting:

Widening Casting (automatic) - converting a smaller type to a larger type size
byte -> short -> char -> int -> long -> float -> double

Narrowing Casting (manual) - converting a larger type to a smaller type size
double -> float -> long -> int -> char -> short -> byte*/

    public static void main(String[] args) {
        // Widening Casting (automatically) - converting a smaller type to a larger type size
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double

        System.out.println("Widening Casting:");
        System.out.println("Integer value: " + myInt);      // Outputs 9
        System.out.println("Double value: " + myDouble);    // Outputs 9.0

        // Narrowing Casting (manually) - converting a larger type to a smaller type size
        double myDouble2 = 9.78;
        int myInt2 = (int) myDouble2; // Manual casting: double to int

        System.out.println("\nNarrowing Casting:");
        System.out.println("Double value: " + myDouble2);   // Outputs 9.78
        System.out.println("Integer value: " + myInt2);     // Outputs 9
    }
}
