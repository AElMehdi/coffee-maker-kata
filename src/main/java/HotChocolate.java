import java.util.Objects;

public class HotChocolate implements Drink {
    private final int amountOfSugar;

    public HotChocolate(int amountOfSugar) {
        this.amountOfSugar = amountOfSugar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotChocolate that = (HotChocolate) o;
        return amountOfSugar == that.amountOfSugar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfSugar);
    }
}
