package OOP;

public class ClassObject {
    public static void main(String[] args) {
        // Create objects of the Car class
        Car myCar = new Car();
        Car myCar2 = new Car();

        // Set attributes
        myCar.color = "Red";
        myCar.model = "Toyota";
        myCar2.color = "Blue";
        myCar2.model = "Honda";


        // Call methods
        myCar.startEngine();
        myCar.displayInfo();
        myCar.stopEngine();
        myCar2.displayInfo();
    }
}

class Car {
    // Attributes
    String color;
    String model;

    // Methods
    void startEngine() {
        System.out.println("Engine started.");
    }

    void displayInfo() {
        System.out.println("Car Model: " + model + ", Color: " + color);
    }

    void stopEngine() {
        System.out.println("Engine stopped.");
    }
}

// This code demonstrates the concept of classes and objects in Java.   