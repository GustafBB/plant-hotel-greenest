public class Plants {
    private String plantType;
    private String name;
    private double height;

    public Plants(String plantType, String name, double height) {
        this.plantType = plantType;
        this.name = name;
        this.height = height;
    }

    public String getPlantType() {
        return plantType;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setPlantType(String plantType) {
        this.plantType = plantType;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setheight(double height) {
        this.height = height;
    }
}
