import java.util.Objects;

public class TeaOrder implements Order {
    private final int amountOfSugar;

    public TeaOrder(int amountOfSugar) {
        this.amountOfSugar = amountOfSugar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        TeaOrder teaOrder = (TeaOrder) o;
        return amountOfSugar == teaOrder.amountOfSugar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfSugar);
    }
}
