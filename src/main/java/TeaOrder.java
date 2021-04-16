import java.util.Objects;

public class TeaOrder implements Order {
    public static final int PRICE = 4;
    private final int amountOfSugar;
    private final int amountOfMoney;

    public TeaOrder(int amountOfSugar, int amountOfMoney) {
        this.amountOfSugar = amountOfSugar;
        this.amountOfMoney = amountOfMoney;
    }

    @Override
    public Drink process() {
        return isEqualToPrice(amountOfMoney, PRICE) ?
                new Tea(amountOfSugar, isStick())
                : null;
    }

    private boolean isStick() {
        return hasSugar(amountOfSugar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeaOrder teaOrder = (TeaOrder) o;
        return amountOfSugar == teaOrder.amountOfSugar && amountOfMoney == teaOrder.amountOfMoney;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfSugar, amountOfMoney);
    }
}
