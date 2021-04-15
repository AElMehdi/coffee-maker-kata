import static java.lang.Integer.*;

public class OrderTranslator {

    public static final String INSTRUCTIONS_SEPARATOR = ":";

    public static MachineOrder toMachineOrder(String customerOrder) {
        String[] orderInstructions = customerOrder.split(INSTRUCTIONS_SEPARATOR);

        return new MachineOrder(getDrink(orderInstructions), getAmountOfSugar(orderInstructions));
    }

    private static DrinkType getDrink(String[] orderInstructions) {
        String drinkInstruction = orderInstructions[0];
        return DrinkType.from(drinkInstruction);
    }

    public static Order toOrder(String instructions) {
        String[] orderInstructions = instructions.split(INSTRUCTIONS_SEPARATOR);

        if (getDrink(orderInstructions).equals(DrinkType.COFFEE)) {
            return new CoffeeOrder(0);
        }

        return new TeaOrder(getAmountOfSugar(orderInstructions));
    }

    private static int getAmountOfSugar(String[] orderInstructions) {
        return hasSugar(orderInstructions) ? parseInt(orderInstructions[1]) : 0;
    }

    private static boolean hasSugar(String[] orderInstructions) {
        return orderInstructions.length > 1;
    }
}