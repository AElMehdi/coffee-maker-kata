public enum DrinkType {
    HOT_CHOCOLATE("H"),
    TEA("T"),
    COFFEE("C");

    private String value;

    public static DrinkType fromInstruction(String instruction) {
        return TEA;
    }

    public String getValue() {
        return value;
    }

    DrinkType(String value) {
        this.value = value;
    }
}