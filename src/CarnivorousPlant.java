public class CarnivorousPlant extends Plant {
    public CarnivorousPlant(String name, double height) {
        super(name, height);
    }

    @Override
    public double calculateLiquidAmount() {
        double liquidAmountPerDay = 0.1 + 0.2 * getHeight();
        return liquidAmountPerDay;
    }

    @Override
    public LiquidType getLiquidType() {
        return LiquidType.PROTEIN_DRINK;
    }
}
