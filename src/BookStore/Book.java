package BookStore;

public class Book {
    private String title;
    private String author;
    private String type;
    private double price;
    private String description;
    
    public Book(String title, String author, String type, double price, String description) {
        this.title = title;
        this.author = author;
        this.type = type;
        this.price = price;
        this.description = description;
    }
    
    public String getTitle() {
        return title;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public String getType() {
        return type;
    }
    
    public double getPrice() {
        return price;
    }
    
    
}
