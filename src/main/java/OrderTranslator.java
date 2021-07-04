import orders.Order;

public class OrderTranslator {

    public static String translate(Order order) {
        return order.print();
    }
}