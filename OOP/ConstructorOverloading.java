public class ConstructorOverloading {
    String name;
    int age;
    String address;

    // Constructor with one parameter
    public ConstructorOverloading(String name) {
        this.name = name;
        this.age = 0; // Default age
        this.address = "Unknown"; // Default address
    }

    // Constructor with two parameters
    public ConstructorOverloading(String name, int age) {
        this.name = name;
        this.age = age;
        this.address = "Unknown"; // Default address
    }

    // Constructor with three parameters
    public ConstructorOverloading(String name, int age, String address) {
        this.name = name;
        this.age = age;
        this.address = address;
    }

    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Address: " + address);
    }

    public static void main(String[] args) {
        ConstructorOverloading person1 = new ConstructorOverloading("Alice");
        ConstructorOverloading person2 = new ConstructorOverloading("Bob", 25);
        ConstructorOverloading person3 = new ConstructorOverloading("Charlie", 30, "123 Main St");

        person1.displayInfo();
        person2.displayInfo();
        person3.displayInfo();
    }
}   