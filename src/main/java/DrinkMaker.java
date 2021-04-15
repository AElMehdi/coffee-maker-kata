public class DrinkMaker {


    public Drink makeFrom(String customerOrder) {
        MachineOrder machineOrder = OrderTranslator.toMachineOrder(customerOrder);
        int amountOfSugar = machineOrder.getAmountOfSugar();

        if (machineOrder.getDrinkType().equals(DrinkType.TEA)) {
            return new Tea(amountOfSugar, amountOfSugar > 0);
        }

        if (machineOrder.getDrinkType().equals(DrinkType.HOT_CHOCOLATE)) {
            return new HotChocolate(amountOfSugar);
        }

        return new Coffee(amountOfSugar);
    }

}
