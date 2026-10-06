public class Plant {
    private String name;
    private double height;

    public Plant(String name, double height) {
        this.name = name;
        this.height = height;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public void setname(String name) {
        this.name = name;
    }

    public void setheight(double height) {
        this.height = height;
    }
}
