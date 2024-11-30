package BookStore.constructor;

import java.util.List;

public class Customer {
    private String idCustomer;
    private String name;
    private int phone;
    private List<Order>orderByAcc;
    
    public Customer(String idCustomer, String name, int phone, List<Order> orderByAcc) {
        this.idCustomer = idCustomer;
        this.name = name;
        this.phone = phone;
        this.orderByAcc = orderByAcc;
    }
}
