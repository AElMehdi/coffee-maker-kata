public class DrinkMaker {
    public Drink makeFrom(String order) {
        if (order.equals("T")) {
            return new Tea();
        }
        return new HotChocolate();
    }
}
