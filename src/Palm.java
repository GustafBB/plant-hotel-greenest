public class Palm extends Plant{
    public Palm(String name, double height, String plantType) {
        super(name, height, plantType);
    }

    public double calculateLiquidAmount() {
        double liquidAmountPerDay = 0.5 * getHeight();
        return liquidAmountPerDay;
    }

    public LiquidType getLiquidType() {
        return LiquidType.TAP_WATER;
    }
}
