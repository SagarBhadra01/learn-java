public class EncapsulationOop {
    public static void main(String[] args) {
        // Creating a Person object
        Person person = new Person();
        
        // Setting values using setter methods
        person.setName("John Doe");
        person.setAge(30);
        
        // Getting values using getter methods
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());
    }

    // Person class with encapsulated fields
    static class Person {
        private String name;
        private int age;

        // Getter for name
        public String getName() {
            return name;
        }

        // Setter for name
        public void setName(String name) {
            this.name = name;
        }

        // Getter for age
        public int getAge() {
            return age;
        }

        // Setter for age
        public void setAge(int age) {
            this.age = age;
        }
    }   
}
