import java.util.Objects;

public class Coffee implements Drink {
    private final int amountOfSugar;

    public Coffee(int amountOfSugar) {
        this.amountOfSugar = amountOfSugar;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return amountOfSugar == coffee.amountOfSugar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfSugar);
    }
}
