import orders.Order;

public class HotChocolate implements Order {
    private int sugar;

    public HotChocolate(int sugar) {
        this.sugar = sugar;
    }

    public HotChocolate() {
    }

    @Override
    public String toString() {
        return "H:" + sugar + ":" + hasSugar();
    }

    private String hasSugar() {
        return sugar > 0 ? "0" : "1";
    }
}
