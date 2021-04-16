import orders.Order;
import drinks.Drink;

public class DrinkMaker {

    private final Display display;

    public DrinkMaker(Display display) {
        this.display = display;
    }

    public Drink makeFrom(String customerOrder) {
        Order order = OrderTranslator.toOrder(customerOrder);
        Drink processedOrder = order.process();
        display.print(processedOrder.toString());
        return processedOrder;
    }

}
