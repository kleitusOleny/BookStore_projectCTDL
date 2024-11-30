package BookStore.constructor;

public class Book {
    private String idBook;
    private String title;
    private double price;
    private String author;
    private String pulish;
    private String size;
    private int numPage;
    private int yearRelease;
    
    public Book(String idBook, String title, double price, String author, String pulish, String size, int numPage, int yearRelease) {
        this.idBook = idBook;
        this.title = title;
        this.price = price;
        this.author = author;
        this.pulish = pulish;
        this.size = size;
        this.numPage = numPage;
        this.yearRelease = yearRelease;
    }
    
    @Override
    public String toString() {
        return "Book{" +
                "idBook='" + idBook + '\'' +
                ", title='" + title + '\'' +
                ", price=" + price +
                ", author='" + author + '\'' +
                ", pulish='" + pulish + '\'' +
                ", size='" + size + '\'' +
                ", numPage=" + numPage +
                ", yearRelease=" + yearRelease +
                '}';
    }
}
