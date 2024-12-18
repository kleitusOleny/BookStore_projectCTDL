package bookStore.util;

import bookStore.model.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class FileLoader {
    public static Map<Book,Integer> loadBook() throws IOException{
        Book book = null;
        Map<Book,Integer> result = new HashMap<>();
        String file = "src/data/listbook.txt";
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String line ="";
        
        while ((line = br.readLine()) != null) {
            String[] str = line.split("\\|");
            String idBook = null;
            book = new Book(str[0].trim(),str[1].trim(),Double.parseDouble(str[2].trim()),str[7].trim(),str[3].trim(),str[4].trim(), Integer.parseInt(str[5].trim()),Integer.parseInt(str[6].trim()));
            result.put(book,Integer.parseInt(str[8].trim()));
        }
        br.close();
        return result;
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
//        System.out.println(loader.loadCustomer());
    }
}
