package orders;

import drinks.Drink;
import drinks.Orange;

import java.util.Objects;

public class OrangeOrder implements Order {
    public static final int PRICE = 6;
    private final int amountOfSugar;
    private final int amountOfMoney;

    public OrangeOrder(int amountOfSugar, int amountOfMoney) {
        this.amountOfSugar = amountOfSugar;
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public Drink process() {
        return isEqualToPrice(amountOfMoney, PRICE) ?
                new Orange(amountOfSugar, isStick())
                : new NoDrink(PRICE - amountOfMoney);
    }

    private boolean isStick() {
        return hasSugar(amountOfSugar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        OrangeOrder that = (OrangeOrder) o;
        return amountOfSugar == that.amountOfSugar && amountOfMoney == that.amountOfMoney;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfSugar, amountOfMoney);
    }
}
