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
        } else {
            return HOT_CHOCOLATE;
        }
    }
}