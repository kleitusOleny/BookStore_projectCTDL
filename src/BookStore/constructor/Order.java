package BookStore.constructor;

import java.util.List;

public class Order {
    private int idOrder;
    private List<OrderBook> listOrder;
    
    public Order(int idOrder, List<OrderBook> listOrder) {
        this.idOrder = idOrder;
        this.listOrder = listOrder;
    }
}
