public class OrderTranslator {

    public static MachineOrder toMachineOrder(String customerOrder) {
        String[] orderInstructions = customerOrder.split(":");
        DrinkType drink = DrinkType.valueOf(orderInstructions[0]);

        int amountOfSugar = 0;
        if (orderInstructions.length > 1) {
            amountOfSugar = Integer.parseInt(orderInstructions[1]);
        }

        return new MachineOrder(drink, amountOfSugar);
    }
}