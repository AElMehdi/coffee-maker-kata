

public class DrinkMaker {
    public Drink makeFrom(String order) {
        String[] orderInstructions = order.split(":");

        String drink = orderInstructions[0];

        int amountOfSugar = 0;

        if (orderInstructions.length > 1) {
            amountOfSugar = Integer.parseInt(orderInstructions[1]);
        }

        if (drink.equals("T")) {
            return new Tea(amountOfSugar);
        }
        if (order.equals("H")) {
            return new HotChocolate();
        }
        return new Coffee();
    }
}
