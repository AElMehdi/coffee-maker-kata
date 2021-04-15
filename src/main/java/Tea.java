import java.util.Objects;

public class Tea implements Drink {

    private int amountOfSugar;
    private boolean stick;

    public Tea(int amountOfSugar, boolean stick) {
        this.amountOfSugar = amountOfSugar;
        this.stick = stick;
    }

    public Tea(int amountOfSugar) {
        this(amountOfSugar, false);
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tea tea = (Tea) o;
        return amountOfSugar == tea.amountOfSugar;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfSugar);
    }
}
