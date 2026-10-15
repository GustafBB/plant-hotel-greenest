public abstract class Plant {
    private String name;
    private double height;
    private String plantType;

    public Plant(String name, double height, String plantType) {
        this.name = name;
        this.height = height;
        this.plantType = plantType;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public String getPlantType() {
        return plantType;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setheight(double height) {
        this.height = height;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    public abstract double calculateLiquidAmount();

    public abstract LiquidType getLiquidType();
}
