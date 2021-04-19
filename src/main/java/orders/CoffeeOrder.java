package orders;

import drinks.Coffee;
import drinks.Drink;

import java.util.Objects;

public class CoffeeOrder implements Order {
    public static final int PRICE = 6;
    private final int amountOfSugar;
    private final int amountOfMoney;
    private final boolean extraHot;

    public CoffeeOrder(int amountOfSugar, int amountOfMoney) {
        this(amountOfSugar, amountOfMoney, false);
    }

    public CoffeeOrder(int amountOfSugar, int amountOfMoney, boolean extraHot) {
        this.amountOfSugar = amountOfSugar;
        this.amountOfMoney = amountOfMoney;
        this.extraHot = extraHot;
    }

    @Override
    public Drink process() {
        return isEqualToPrice(amountOfMoney, PRICE) ?
                new Coffee(amountOfSugar, isStick(), extraHot)
                : new NoDrink(PRICE - amountOfMoney);
    }

    private boolean isStick() {
        return hasSugar(amountOfSugar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CoffeeOrder that = (CoffeeOrder) o;
        return amountOfSugar == that.amountOfSugar && amountOfMoney == that.amountOfMoney;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfSugar, amountOfMoney);
    }
}
