package orders;

public class Tea implements Order {
    private int sugar;

    public Tea(int sugar) {
        this.sugar = sugar;
    }

    public Tea() {
    }

    @Override
    public String print() {
        return "T:" + sugar + ":" + hasSugar(sugar);
    }
}
