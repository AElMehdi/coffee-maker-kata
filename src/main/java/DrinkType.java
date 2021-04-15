public enum DrinkType {
    HOT_CHOCOLATE,
    TEA,
    COFFEE;

    public static DrinkType fromInstruction(String instruction) {
        if (instruction.equals("T")) {
            return TEA;
        }
        if (instruction.equals("C")) {
            return COFFEE;
        }
        if (instruction.equals("H")) {
            return HOT_CHOCOLATE;
        } else {
            throw new IllegalArgumentException("Sorry! Can't serve your that!");
        }
    }
}