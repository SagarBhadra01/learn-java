public class Abstraction {
    public static void main(String[] args) {
        // You cannot instantiate an abstract class directly
        // Animal myAnimal = new Animal(); // This would cause a compilation error

        Dog myDog = new Dog();
        myDog.makeSound();
        myDog.sleep();

        Cat myCat = new Cat();
        myCat.makeSound();
        myCat.sleep();
    }
}

// Abstract class
abstract class Animal {
    // Abstract method (does not have a body)
    public abstract void makeSound();

    // Regular method
    public void sleep() {
        System.out.println("Zzz");
    }
}

// Subclass (inherits from Animal)
class Dog extends Animal {
    public void makeSound() {
        System.out.println("Woof woof");
    }
}

// Subclass (inherits from Animal)
class Cat extends Animal {
    public void makeSound() {
        System.out.println("Meow meow");
    }

}
