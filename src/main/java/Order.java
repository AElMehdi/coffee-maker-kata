public class Order {
    private final String drinkType;
    private final int sugar;

    public Order(String drinkType, int sugar) {
        this.drinkType = drinkType;
        this.sugar = sugar;
    }

    public String getDrinkType() {
        return drinkType;
    }

    public int getSugar() {
        return sugar;
    }
}
