public class Apple extends Fruit {

    // Constructor
    public Apple(String name, String taste, String size) {
        super(name, taste, size);
    }

    // Override the eat() method
    @Override
    public void eat() {
        System.out.println("\n The " + name + " tastes " + taste + " and is usually " + size + ".");
    }
}
