public class MachineOrder {
    private final DrinkType drinkType;
    private final int amountOfSugar;

    public MachineOrder(DrinkType drinkType, int amountOfSugar) {
        this.drinkType = drinkType;
        this.amountOfSugar = amountOfSugar;
    }

    public DrinkType getDrinkType() {
        return drinkType;
    }

    public int getAmountOfSugar() {
        return amountOfSugar;
    }

    public boolean hasSugar() {
        return this.amountOfSugar > 0;
    }
}
