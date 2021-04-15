import java.util.Objects;

public class HotChocolateOrder implements Order {
    private final int amountOfSugar;

    public HotChocolateOrder(int amountOfSugar) {
        this.amountOfSugar = amountOfSugar;
    }

    @Override
    public Drink process() {
        return new HotChocolate(amountOfSugar, isStick());
    }

    private boolean isStick() {
        return hasSugar(amountOfSugar);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotChocolateOrder that = (HotChocolateOrder) o;
        return amountOfSugar == that.amountOfSugar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfSugar);
    }
}
