public class Cactus extends Plant {
    public Cactus(String name, double height) {
        super(name, height);
    }

    public double calculateLiquidAmount() {
        double liquidAmountPerDay = 2 / 100;
        return liquidAmountPerDay;
    }
}
