import orders.Order;

public class Tea implements Order {
    private int sugar;

    public Tea(int sugar) {
        this.sugar = sugar;
    }

    public Tea() {
    }
}
