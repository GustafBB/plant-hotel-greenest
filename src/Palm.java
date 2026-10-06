public class Palm extends Plant{
    public Palm(String plantType, String name, double height) {
        super(name, height);
    }

    public double calculateLiquidAmount(height) {
        double liquidAmountPerDay = 0.5 * getHeight();
        return liquidAmountPerDay;
    }
}
