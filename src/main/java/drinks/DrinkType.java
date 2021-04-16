package drinks;

public enum DrinkType {
    HOT_CHOCOLATE,
    TEA,
    COFFEE,
    ORANGE;

    public static DrinkType from(String instruction) {
        switch (instruction) {
            case "T":
                return TEA;
            case "C":
                return COFFEE;
            case "H":
                return HOT_CHOCOLATE;
            case "O":
                return ORANGE;
            default:
                throw new IllegalArgumentException("Sorry! Can't serve your that!");
        }
    }
}