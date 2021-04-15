import static java.lang.Integer.parseInt;

public class OrderTranslator {

    public static final String INSTRUCTIONS_SEPARATOR = ":";

    public static Order toOrder(String instructions) {
        String[] orderInstructions = instructions.split(INSTRUCTIONS_SEPARATOR);

        switch (getDrink(orderInstructions)) {
            case COFFEE:
                return new CoffeeOrder(getAmountOfSugar(orderInstructions));
            case TEA:
                return new TeaOrder(getAmountOfSugar(orderInstructions));
            case HOT_CHOCOLATE:
                return new HotChocolateOrder(getAmountOfSugar(orderInstructions));
            default:
                throw new IllegalArgumentException("Oopsy! Looks like something went wrong with your order.");
        }

    }

    private static DrinkType getDrink(String[] orderInstructions) {
        String drinkInstruction = orderInstructions[0];
        return DrinkType.from(drinkInstruction);
    }

    private static int getAmountOfSugar(String[] orderInstructions) {
        return hasSugar(orderInstructions) ? parseInt(orderInstructions[1]) : 0;
    }

    private static boolean hasSugar(String[] orderInstructions) {
        return orderInstructions.length > 1;
    }
}