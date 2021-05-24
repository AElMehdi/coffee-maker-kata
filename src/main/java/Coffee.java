import orders.Order;

public class Coffee implements Order {
    private int sugar;

    public Coffee(int sugar) {
        this.sugar = sugar;
    }

    public Coffee() {
    }

    @Override
    public String toString() {
        return "C:" + sugar + ":" + hasSugar();
    }

    private String hasSugar() {
        return sugar > 0 ? "0" : "1";
    }
}
