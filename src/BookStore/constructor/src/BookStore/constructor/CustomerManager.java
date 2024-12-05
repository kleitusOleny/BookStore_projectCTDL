package BookStore.constructor.src.BookStore.constructor;

import java.util.HashSet;
import java.util.Set;

public class CustomerManager {
    private Set<Customer> listCustomer;
    
    public CustomerManager() {
        this.listCustomer = new HashSet<>();
    }
    
    public boolean addCustomer(Customer cus){
        return listCustomer.add(cus);
    }
    
}
