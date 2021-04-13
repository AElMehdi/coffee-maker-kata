public class CoffeeMaker {
    public String process(Order order) {
        if (order.getDrinkType().equals("tea")) {
            return "T:1:0";
        }
        return "H::";
    }
}
