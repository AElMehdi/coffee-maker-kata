import orders.Order;

public class OrderTranslator {

    public static String translate(Order order) {
        if (order instanceof Tea) {
            return order.toString();
        }
        return "C:";

    }
}