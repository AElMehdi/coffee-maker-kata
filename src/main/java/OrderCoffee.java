public class OrderCoffee implements Order {
    private final int sugar;

    public OrderCoffee(int sugar) {
        this.sugar = sugar;
    }

    public int getSugar() {
        return sugar;
    }

    @Override
    public String process() {
        return "C:2:0";
    }
}
