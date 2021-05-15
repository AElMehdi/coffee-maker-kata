package drinks;

import orders.OrderPojo;

import java.util.Objects;

public class Tea implements Drink, OrderPojo {

    private int amountOfSugar;
    private boolean stick;

    public Tea(int amountOfSugar, boolean stick) {
        this.amountOfSugar = amountOfSugar;
        this.stick = stick;
    }

    public Tea(int amountOfSugar) {
        this(amountOfSugar, false);
    }

    public Tea() {

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tea tea = (Tea) o;
        return amountOfSugar == tea.amountOfSugar && stick == tea.stick;
    }

    @Override
    public int hashCode() {
        return Objects.hash(amountOfSugar, stick);
    }
}
