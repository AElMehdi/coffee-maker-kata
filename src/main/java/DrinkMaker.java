public class DrinkMaker {

    public Drink makeFrom(String customerOrder) {
        MachineOrder machineOrder = OrderTranslator.toMachineOrder(customerOrder);

        if (machineOrder.getDrink().equals("T")) {
            return new Tea(machineOrder.getAmountOfSugar());
        }

        if (machineOrder.getDrink().equals("H")) {
            return new HotChocolate(machineOrder.getAmountOfSugar());
        }

        return new Coffee(machineOrder.getAmountOfSugar());
    }

}
