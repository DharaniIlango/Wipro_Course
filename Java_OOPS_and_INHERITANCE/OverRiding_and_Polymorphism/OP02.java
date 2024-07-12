public class OP02 {
    public static void main(String[] args) {
        // Create objects of Circle, Triangle, and Square
        Shape c = new Circle();
        Shape t = new Triangle();
        Shape s = new Square();

        // Call the draw() and erase() methods
        c.draw();
        c.erase();
        System.out.println();

        t.draw();
        t.erase();
        System.out.println();

        s.draw();
        s.erase();
        System.out.println();
    }
}
