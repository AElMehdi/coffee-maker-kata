package drinks;

import java.util.Objects;

public class Coffee implements Drink {
    private final int amountOfSugar;
    private final boolean stick;
    private final boolean extraHot;

    public Coffee(int amountOfSugar) {
        this(amountOfSugar, false);
    }

    public Coffee(int amountOfSugar, boolean stick) {
        this(amountOfSugar, stick, false);
    }

    public Coffee(int amountOfSugar, boolean stick, boolean extraHot) {
        this.amountOfSugar = amountOfSugar;
        this.stick = stick;
        this.extraHot = extraHot;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Coffee coffee = (Coffee) o;
        return amountOfSugar == coffee.amountOfSugar && stick == coffee.stick && extraHot == coffee.extraHot;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfSugar, stick, extraHot);
    }

    @Override
    public String toString() {
        return "C" + (extraHot ? "h" : "") + ":" + amountOfSugar + ":" + isStickToInt(stick) + ":";
    }

}
