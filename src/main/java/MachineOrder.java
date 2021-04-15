public class MachineOrder {
    private final String drink;
    private final int amountOfSugar;

    public MachineOrder(String drink, int amountOfSugar) {
        this.drink = drink;
        this.amountOfSugar = amountOfSugar;
    }

    public String getDrink() {
        return drink;
    }

    public int getAmountOfSugar() {
        return amountOfSugar;
    }
}
