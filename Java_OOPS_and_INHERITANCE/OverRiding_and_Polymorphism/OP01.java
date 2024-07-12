public class OP01 {
    public static void main(String[] args) {
        // Create instances of Apple and Orange
        Fruit apple = new Apple("Apple", "sweet", "medium");
        Fruit orange = new Orange("Orange", "citrusy", "medium");

        // Call the eat() method for each fruit
        apple.eat();
        orange.eat();
    }
}
