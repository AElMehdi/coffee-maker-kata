import java.util.Objects;

public class CoffeeOrder implements Order {
    private final int amountOfSugar;
    private final int amountOfMoney;

    public CoffeeOrder(int amountOfSugar, int amountOfMoney) {
        this.amountOfSugar = amountOfSugar;
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public Drink process() {
        return amountOfMoney >= 6 ? new Coffee(amountOfSugar, isStick()) : null;
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
