package orders;

public class Chocolate implements Order {
    private int sugar;

    public Chocolate(int sugar) {
        this.sugar = sugar;
    }

    public Chocolate() {
    }

    @Override
    public String print() {
        return "H:" + sugar + ":" + hasSugar(sugar);
    }

}
