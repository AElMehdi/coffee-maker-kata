package orders;

public class Coffee implements Order {
    private int sugar;

    public Coffee(int sugar) {
        this.sugar = sugar;
    }

    public Coffee() {
    }

    @Override
    public String print() {
        return "C:" + sugar + ":" + hasSugar(sugar);
    }
}
