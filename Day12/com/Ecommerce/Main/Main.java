package Day12.com.Ecommerce.Main;

import Day12.com.Ecommerce.model.*;
import Day12.com.Ecommerce.service.OrderService;

public class Main {
    public static void main(String[] args) {
        User u=new User("Siva", "Thiruvannamalai");
        Product p=new Product("Duke", 200000);
        Order o=new Order(p, u, 2);
        OrderService OS=new OrderService();
        OS.placeOrder(o);
    }
}
