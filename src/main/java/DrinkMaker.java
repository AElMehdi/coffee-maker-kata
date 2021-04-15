public class DrinkMaker {

    public Drink makeFrom(String customerOrder) {
        Order order = OrderTranslator.toOrder(customerOrder);
        return order.process();
    }

}
