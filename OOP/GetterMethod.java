public class GetterMethod {
    private String name;
    private int age;

    // Constructor
    public GetterMethod(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter methods
    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    // Main method to test the class
    public static void main(String[] args) {
        GetterMethod person = new GetterMethod("Alice", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }
}
