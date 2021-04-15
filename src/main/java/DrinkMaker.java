

public class DrinkMaker {
    public Drink makeFrom(String order) {
        if (order.equals("T:1")) {
            return new Tea(Integer.parseInt(order.split(":")[1]));
        }
        if (order.equals("H")) {
            return new HotChocolate();
        }
        return new Coffee();
    }
}
