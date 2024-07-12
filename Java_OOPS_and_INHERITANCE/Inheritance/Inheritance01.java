public class Inheritance01 {
    public static void main(String[] args) {
        //instance for the class Animal
        Animal animal = new Animal();
        animal.eat();
        animal.sleep();

        //instance for the class Bird
        Bird bird = new Bird();
        bird.eat();
        bird.sleep();
        bird.fly();
    }
}

//super class
class Animal {
    void eat() {
        System.out.println("\nThe Animal is Eating...");
    }
    void sleep() {
        System.out.println("\nThe Animal is Sleeping...");
    }
}

//subclass
class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("\nThe Bird is Eating its food.");
    }

    @Override
    void sleep() {
        System.out.println("\nThe Bird is Sleeping in its nest.");
    }

    void fly() {
        System.out.println("\nThe Bird is Flying.");
    }
}