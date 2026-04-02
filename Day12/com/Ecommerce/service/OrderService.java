package Day12.com.Ecommerce.service;
import Day12.com.Ecommerce.model.Order;
public class OrderService {
    public void placeOrder(Order order){
        System.out.println("User Name:"+order.user.name);
        System.out.println("Address:"+order.user.address);
        System.out.println("Product Name:"+order.product.name);
        System.out.println("Quantity:"+order.quantity);
        double total=order.product.price*order.quantity;
        System.out.println("Total Price:"+total);
    }
}
