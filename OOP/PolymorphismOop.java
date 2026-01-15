public class PolymorphismOop {
    // Base class
    static class Animal {
        void makeSound() {
            System.out.println("Animal makes a sound");
        }
    }

    // Derived class Dog
    static class Dog extends Animal {
        @Override
        void makeSound() {
            System.out.println("Woof");
        }
    }

    // Derived class Cat
    static class Cat extends Animal {
        @Override
        void makeSound() {
            System.out.println("Meow");
        }
    }

    // Main method to test the classes
    public static void main(String[] args) {
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        myDog.makeSound(); // Outputs: Woof
        myCat.makeSound(); // Outputs: Meow
    }
}
