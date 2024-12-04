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
    
    
    //GET & SET method
    public String getIdBook() {
        return idBook;
    }
    
    public void setIdBook(String idBook) {
        this.idBook = idBook;
    }
    
    public String getTitle() {
        return title;
    }
    
    public void setTitle(String title) {
        this.title = title;
    }
    
    public double getPrice() {
        return price;
    }
    
    public void setPrice(double price) {
        this.price = price;
    }
    
    public String getAuthor() {
        return author;
    }
    
    public void setAuthor(String author) {
        this.author = author;
    }
    
    public String getPulish() {
        return pulish;
    }
    
    public void setPulish(String pulish) {
        this.pulish = pulish;
    }
    
    public String getSize() {
        return size;
    }
    
    public void setSize(String size) {
        this.size = size;
    }
    
    public int getNumPage() {
        return numPage;
    }
    
    public void setNumPage(int numPage) {
        this.numPage = numPage;
    }
    
    public int getYearRelease() {
        return yearRelease;
    }
    
    public void setYearRelease(int yearRelease) {
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
    
    @Override
    public boolean equals(Object obj) {
        if (null == obj || !(this instanceof Book)){
            return false;
        }else {
            Book that = (Book) obj;
            return this.idBook.equals(that.idBook) &&
                    this.title.equals(that.title) &&
                    this.price == that.price &&
                    this.author.equals(that.author) &&
                    this.pulish.equals(that.pulish) &&
                    this.size.equals(that.size) &&
                    this.numPage == that.numPage &&
                    this.yearRelease == that.yearRelease;
        }
    }
}
