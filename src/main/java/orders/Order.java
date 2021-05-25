package orders;

public interface Order {

    String print();

    default String hasSugar(int sugar) {
        return sugar > 0 ? "0" : "1";
    }
}
