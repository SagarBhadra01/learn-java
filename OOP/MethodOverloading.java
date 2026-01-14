public class MethodOverloading {
    public static void main(String[] args) {
        MethodOverloading mo = new MethodOverloading();
        System.out.println(mo.add(2, 3));
        System.out.println(mo.add(2, 3, 4));
        System.out.println(mo.add(2.5, 3.5));
        System.out.println(mo.add(2, 3.5));
    }

    // Method with two integer parameters
    public int add(int a, int b) {
        return a + b;
    }

    // Method with three integer parameters (overloaded)
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Method with two double parameters (overloaded)
    public double add(double a, double b) {
        return a + b;
    }

    // You can add more overloaded methods as needed
    // for example, methods with different parameter types or counts.
    // Method with one integer and one double parameter (overloaded)
    public double add(int a, double b) {
        return a + b;
    }
}


