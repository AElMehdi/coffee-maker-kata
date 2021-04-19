package drinks;

import java.util.Objects;

public class HotChocolate implements Drink {
    private final int amountOfSugar;
    private final boolean stick;

    public HotChocolate(int amountOfSugar) {
        this(amountOfSugar, false);
    }

    public HotChocolate(int amountOfSugar, boolean stick) {
        this.amountOfSugar = amountOfSugar;
        this.stick = stick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HotChocolate that = (HotChocolate) o;
        return amountOfSugar == that.amountOfSugar && stick == that.stick;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfSugar, stick);
    }
}
