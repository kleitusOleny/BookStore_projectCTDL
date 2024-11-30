package BookStore.constructor;

import java.util.Map;

public class BookManager {
    private Map<Book,Integer> listBook;
    
    public BookManager(Map<Book, Integer> listBook) {
        this.listBook = listBook;
    }
    
}
