package cursoJava;

import entities.Order;
import entities.OrderStatus;

public class Enumeracao {
    public static void main(String[] args) {
        
        Order order = new Order(1080, new java.sql.Date(System.currentTimeMillis()), OrderStatus.PENDING_PAYMENT);

        System.out.println(order);

        OrderStatus os1 = OrderStatus.DELIVERED;
        OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
        System.out.println(os1);
        System.out.println(os2);
    }
}
