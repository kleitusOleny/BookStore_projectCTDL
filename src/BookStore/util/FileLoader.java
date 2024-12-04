package BookStore.util;

import BookStore.constructor.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

public class FileLoader {
    public Set loadBook() throws IOException{
        Book book = null;
        Set<Book> set = new HashSet<>();
        String file = "src/data/listbook.txt";
        BufferedReader br = new BufferedReader(new FileReader(file));
        
        String line ="";
        
        while ((line = br.readLine()) != null) {
            String[] str = line.split("\\|");
            book = new Book(str[0].trim(),str[1].trim(),Double.parseDouble(str[2].trim()),str[3].trim(),str[4].trim(),str[5].trim(),Integer.parseInt(str[6].trim()),Integer.parseInt(str[7].trim()));
            set.add(book);
        }
        br.close();
        return set;
    }
    
    public static void main(String[] args) throws IOException {
        FileLoader loader = new FileLoader();
        System.out.println(loader.loadBook());
    }
}
