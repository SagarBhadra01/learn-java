package OOP;

public class ToStringMethod {
    String make;
    String model;
    int year;

    public ToStringMethod(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        return "Car [Make=" + make + ", Model=" + model + ", Year=" + year + "]";
    }

    public static void main(String[] args) {
        ToStringMethod car = new ToStringMethod("Toyota", "Camry", 2020);
        System.out.println(car.toString()); // Explicitly call toString()
        System.out.println(car);            // Implicitly calls toString()
    }

}
