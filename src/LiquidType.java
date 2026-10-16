public enum LiquidType {
    TAP_WATER("kranvatten"),
    PROTEIN_DRINK("proteindryck"),
    MINERAL_WATER("mineralvatten");

    private final String liquidName;

    LiquidType(String liquidName) {
        this.liquidName = liquidName;
    }

    public String getLiquidName() {
        return liquidName;
    }
}
