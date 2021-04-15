public class DrinkMaker {


    public Drink makeFrom(String customerOrder) {
        MachineOrder machineOrder = OrderTranslator.toMachineOrder(customerOrder);
        int amountOfSugar = machineOrder.getAmountOfSugar();

        if (machineOrder.getDrinkType().equals(DrinkType.TEA)) {
            return new Tea(amountOfSugar, isStick(machineOrder));
        }

        if (machineOrder.getDrinkType().equals(DrinkType.HOT_CHOCOLATE)) {
            return new HotChocolate(amountOfSugar);
        }

        return new Coffee(amountOfSugar);
    }

    private boolean isStick(MachineOrder machineOrder) {
        return machineOrder.hasSugar();
    }
}
