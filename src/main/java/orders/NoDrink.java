package orders;

import drinks.Drink;

public class NoDrink implements Drink {

    private final int amountOfMoneyNeeded;

    public NoDrink(int amountOfMoneyNeeded) {
        this.amountOfMoneyNeeded = amountOfMoneyNeeded;
    }

    @Override
    public String toString() {
        return "Amount needed " + amountOfMoneyNeeded;
    }
}
