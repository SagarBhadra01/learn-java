public class Constructor {
    public static void main(String[] args) {
        // Creating Student objects
        Student student1 = new Student(1, "Alice");
        Student student2 = new Student(2, "Bob");

        // Displaying student information
        System.out.println("Student 1 ID: " + student1.id + ", Name: " + student1.n);
        System.out.println("Student 2 ID: " + student2.id + ", Name: " + student2.n);
    }
}


class Student {
    int id;
    String n;
   
    // Constructor
    public Student(int id, String n) {
        this.id = id;  //this keyword is used to refer to the current object's attributes
        this.n = n;
    }
}     

// This code demonstrates the use of constructors in Java classes to initialize object attributes.