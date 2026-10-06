public class Cactus extends Plant {
    public Cactus(String name, double height) {
        super(name, height);
    }

    public double calculateLiquidAmount() {
        double liquidAmountPerDay = 2.0 / 100.0;
        return liquidAmountPerDay;
    }

    public LiquidType getLiquidType() {
        return LiquidType.MINERAL_WATER;
    }
}
