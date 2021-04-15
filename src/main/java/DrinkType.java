public enum DrinkType {
    HOT_CHOCOLATE,
    TEA,
    COFFEE;

    public static DrinkType fromInstruction(String instruction) {
        if (instruction.equals("T")) {
            return TEA;
        } else {
            return COFFEE;
        }
    }
}