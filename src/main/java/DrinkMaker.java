import orders.Order;
import drinks.Drink;

public class DrinkMaker {

    private final Display display;

    public DrinkMaker(Display display) {
        this.display = display;
    }

//    Instructions => Drink Maker => Drink => Instructions (Display)
    public Drink makeFrom(String customerOrder) {
        Order order = OrderTranslator.toOrder(customerOrder);

        Drink drink = order.process();

        display.print(drink.toString());

        return drink;
    }

}
