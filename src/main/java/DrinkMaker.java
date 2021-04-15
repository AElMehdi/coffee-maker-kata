public class DrinkMaker {
    public Drink makeFrom(String order) {
        if (order.equals("T")) {
            return new Tea();
        }
        if (order.equals("H")) {
            return new HotChocolate();
        }
        return new Coffee();
    }
}
