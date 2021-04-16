package drinks;

import java.util.Objects;

public class Orange implements Drink {

    private final int amountOfSugar;
    private final boolean stick;

    public Orange(int amountOfSugar, boolean stick) {
        this.amountOfSugar = amountOfSugar;
        this.stick = stick;
    }

    public Orange(int amountOfSugar) {
        this(amountOfSugar, false);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Orange orange = (Orange) o;
        return amountOfSugar == orange.amountOfSugar && stick == orange.stick;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfSugar, stick);
    }
}
