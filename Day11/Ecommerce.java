/*E-commerce order system
 Design system where user places an order,while ordering system must handle failures using exceptional handling
 1.Product out of stock
 2.Payment failed
 3.Order processing failed 
 Classes
 Product(name,stock,price)
 user(name,address)
 order(product,user,quantity)
 orderservices(placeorder(order))*/
package Day11;
class ProductOutOfStockExcep extends Exception{
    ProductOutOfStockExcep(String msg){
        super(msg);
    }
}
class PaymentFailedExcep extends Exception{
    PaymentFailedExcep(String msg){
        super(msg);
    }
}
class ProcessFailedExcep extends Exception{
    ProcessFailedExcep(String msg){
        super(msg);
    }
}
class Product{
    String name;
    int stock;
    double price;
    Product(String name,int stock,double price){
        this.name=name;
        this.stock=stock;
        this.price=price;
    }
}
class User{
    String name;
    String address;
    User(String name,String address){
        this.name=name;
        this.address=address;
    }
}
class Order{
    Product P;
    User U;
    int quantity;
    Order(Product P,User U,int quantity){
        this.P=P;
        this.U=U;
        this.quantity=quantity;
    }

}
class OrderService{
    void placeOrder(Order O) throws ProductOutOfStockExcep,PaymentFailedExcep,ProcessFailedExcep{
        if(O.P.stock<O.quantity){
            throw new ProductOutOfStockExcep("Out of Stock");
        }
        else{
            System.out.println("Product available:"+O.quantity);
            O.P.stock-=O.quantity;
            System.out.println("Remaining stock:"+O.P.stock);
        }
        if(Math.random()<0.4){
            throw new PaymentFailedExcep("Payment Failed");
        }
        else{
            System.out.println("Payment Successful");
        }
        if(Math.random()<0.2){
            throw new ProcessFailedExcep("Order Processing Failed");
        }
        else{
            System.out.println("Order Placed Successfully");
            System.out.println("Name:"+O.U.name);
            System.out.println("Product:"+O.P.name);
            System.out.println("Quantity:"+O.quantity);
        }
    }
}
public class Ecommerce {
    public static void main(String[] args) {
        Product P=new Product("Bat",10,2000);
        User U=new User("Siva","Hostel");
        Order O=new Order(P,U,2);
        OrderService OS=new OrderService();
        try{
            OS.placeOrder(O);
        }
        catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
