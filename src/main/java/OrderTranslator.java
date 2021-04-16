import orders.CoffeeOrder;
import orders.HotChocolateOrder;
import orders.Order;
import orders.TeaOrder;
import drinks.DrinkType;

import static java.lang.Integer.parseInt;

public class OrderTranslator {

    public static final String INSTRUCTIONS_SEPARATOR = ":";

    public static Order toOrder(String instructions) {
        String[] orderInstructions = instructions.split(INSTRUCTIONS_SEPARATOR);

        switch (getDrink(orderInstructions)) {
            case COFFEE:
                return new CoffeeOrder(getAmountOfSugar(orderInstructions), getAmountOfMoney(orderInstructions));
            case TEA:
                return new TeaOrder(getAmountOfSugar(orderInstructions), getAmountOfMoney(orderInstructions));
            case HOT_CHOCOLATE:
                return new HotChocolateOrder(getAmountOfSugar(orderInstructions), getAmountOfMoney(orderInstructions));
            default:
                throw new IllegalArgumentException("Oopsy! Looks like something went wrong with your order.");
        }

    }

    private static int getAmountOfMoney(String[] orderInstructions) {
        String amountOfMoney = parseNumericInstruction(orderInstructions, 3);
        return Integer.parseInt(amountOfMoney);
    }

    private static DrinkType getDrink(String[] orderInstructions) {
        String drinkInstruction = orderInstructions[0];
        return DrinkType.from(drinkInstruction);
    }

    private static int getAmountOfSugar(String[] orderInstructions) {
        String amountOfSugar = parseNumericInstruction(orderInstructions, 1);
        return parseInt(amountOfSugar);
    }

    private static String parseNumericInstruction(String[] orderInstructions, int index) {
        String numericAsString = orderInstructions.length > index ? orderInstructions[index] : "";
        return toZeroIfEmpty(numericAsString);
    }

    private static String toZeroIfEmpty(String amountOfSugar) {
        return amountOfSugar.isEmpty() ? "0" : amountOfSugar;
    }

}