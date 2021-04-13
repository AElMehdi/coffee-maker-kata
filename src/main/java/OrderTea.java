public class OrderTea implements Order {
    private final int sugar;

    public OrderTea(int sugar) {
        this.sugar = sugar;
    }

    public int getSugar() {
        return sugar;
    }

    @Override
    public String process() {
        return "T:" + this.sugar + ":0";
    }
}
