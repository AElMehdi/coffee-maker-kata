public class OrderChocolate implements Order {
    private final int sugar;

    public OrderChocolate(int sugar) {
        this.sugar = sugar;
    }

    public int getSugar() {
        return sugar;
    }

    @Override
    public String process() {
        return "H::";
    }
}
