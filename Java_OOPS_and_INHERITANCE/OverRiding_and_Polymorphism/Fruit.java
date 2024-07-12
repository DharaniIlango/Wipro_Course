public class Fruit {
    protected String name;
    protected String taste;
    protected String size;

    // Constructor
    public Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    // Method to describe the fruit and its taste
    public void eat() {
        System.out.println("\n The " + name + " tastes " + taste + ".");
    }

    // Getters and Setters (optional)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTaste() {
        return taste;
    }

    public void setTaste(String taste) {
        this.taste = taste;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
}
