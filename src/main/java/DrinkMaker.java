public class DrinkMaker {


    public Drink makeFrom(String customerOrder) {
        MachineOrder machineOrder = OrderTranslator.toMachineOrder(customerOrder);

        if (machineOrder.getDrinkType().equals(DrinkType.TEA)) {
            return new Tea(machineOrder.getAmountOfSugar());
        }

        if (machineOrder.getDrinkType().equals(DrinkType.HOT_CHOCOLATE)) {
            return new HotChocolate(machineOrder.getAmountOfSugar());
        }

        return new Coffee(machineOrder.getAmountOfSugar());
    }

}
