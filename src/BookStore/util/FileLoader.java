package BookStore.util;

import BookStore.constructor.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class FileLoader {
    public Set loadBook() throws IOException{
        Book book = null;
        Set<Book> setBook = new HashSet<>();
        String file = "src/data/listbook.txt";
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String line ="";
        
        while ((line = br.readLine()) != null) {
            String[] str = line.split("\\|");
            book = new Book(str[0].trim(),str[1].trim(),Double.parseDouble(str[2].trim()),str[3].trim(),str[4].trim(),str[5].trim(),Integer.parseInt(str[6].trim()),Integer.parseInt(str[7].trim()));
            setBook.add(book);
        }
        br.close();
        return setBook;
    }
    
    public Set<Customer> loadCustomer() throws IOException{
        Customer customer = null;
        Set<Customer> setCustomer = new HashSet<>();
        String file = "src/data/acc.txt";
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String line ="";
        
        while ((line = br.readLine()) != null) {
            String[] str = line.split("\\|");
            customer = new Customer(str[0].trim(),str[1].trim(),Integer.parseInt(str[2].trim()),new ArrayList<>());
            setCustomer.add(customer);
        }
        br.close();
        return setCustomer;
    }
    public static void main(String[] args) throws IOException {
        FileLoader loader = new FileLoader();
        System.out.println(loader.loadBook());
    }
}
