package orders;

import drinks.Drink;
import drinks.HotChocolate;

import java.util.Objects;

public class HotChocolateOrder implements Order {
    public static final int PRICE = 5;
    private final int amountOfSugar;
    private final int amountOfMoney;

    public HotChocolateOrder(int amountOfSugar, int amountOfMoney) {
        this.amountOfSugar = amountOfSugar;
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public Drink process() {
        return isEqualToPrice(amountOfMoney, PRICE) ?
                new HotChocolate(amountOfSugar, isStick())
                : new NoDrink(PRICE - amountOfMoney);
    }

    private boolean isStick() {
        return hasSugar(amountOfSugar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotChocolateOrder that = (HotChocolateOrder) o;
        return amountOfSugar == that.amountOfSugar && amountOfMoney == that.amountOfMoney;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfSugar, amountOfMoney);
    }
}
