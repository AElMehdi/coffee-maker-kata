package drinks;

import java.util.Objects;

public class Coffee implements Drink {
    private final int amountOfSugar;
    private final boolean stick;

    public Coffee(int amountOfSugar) {
        this(amountOfSugar, false);
    }

    public Coffee(int amountOfSugar, boolean stick) {
        this.amountOfSugar = amountOfSugar;
        this.stick = stick;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return amountOfSugar == coffee.amountOfSugar && stick == coffee.stick;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfSugar, stick);
    }

    @Override
    public String toString() {
        return "C:" + amountOfSugar + ":" + isStickToInt(stick) + ":";
    }

}
