import orders.Order;

public class Tea implements Order {
    private int sugar;

    public Tea(int sugar) {
        this.sugar = sugar;
    }

    public Tea() {
    }

    @Override
    public String toString() {
        return "T:" + sugar + ":" + hasSugar();
    }

    private String hasSugar() {
        return sugar > 0 ? "0" : "1";
    }
}
