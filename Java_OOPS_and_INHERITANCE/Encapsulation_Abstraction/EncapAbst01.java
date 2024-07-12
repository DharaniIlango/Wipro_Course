public class EncapAbst01 {

    public static void main(String[] args) {
        //create Author
        Author author = new Author("Dharani Ilango", "dharaniilango1209@gmail.com", 'M');
        
        //create  Book
        Book book = new Book("Life of D", author, 1214.03, 10000);

        System.out.println(book);
    }
}

class Author {
    private String name;
    private String email;
    private char gender;

    Author(String name, String email, char gender) {
        this.name = name;
        this.email = email;
        this.gender = gender;
    }
    
    //getter functions 
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public char getGender() {
        return gender;
    }

    //setter functions
    public void setName(String name) {
        this.name = name;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setGender(char gender) {
        this.gender = gender;
    }

    //print the author information in a String Format
    @Override
    public String toString() {
        return "Author Information:\n" +
        "  \t Name: " + name + "\n" +
        "  \t E-Mail: " + email + "\n" +
        "  \t Gender: " + gender;
    }
}

class Book {
    private String name;
    private Author author;
    private double price;
    private int qtyInStock;
    
    //constructor
    Book(String name, Author author, double price, int qtyInStock) {
        this.name = name;
        this.author = author;
        this.price = price;
        this.qtyInStock = qtyInStock;
    }
    
    //getter functions 
    public String getName() {
        return name;
    }
    public Author getAuthor() {
        return author;
    }
    public double getPrice() {
        return price;
    }
    public int getQtyInStock() {
        return qtyInStock;
    }

    //setter functions
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(Author author) {
        this.author = author;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public void setQtyInStock(int qtyInStock) {
        this.qtyInStock = qtyInStock;
    }

    //print the Book information in a String Format
    @Override
    public String toString() {
        return "Book Information:\n" +
        "  Name: " + name + "\n" +
        "  " + author + "\n" +
        "  Price: Rs." + price + "\n" +
        "  Quantity in Stock: " + qtyInStock;
    }
}