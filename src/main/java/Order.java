public interface Order {
    Drink process();

    default boolean hasSugar(int amountOfSugar) {
        return amountOfSugar > 0;
    }

    default boolean isEqualToPrice(int amountOfMoney, int price) {
        return amountOfMoney >= price;
    }
}
