public interface Order {
    Drink process();

    default boolean hasSugar(int amountOfSugar) {
        return amountOfSugar > 0;
    }
}
