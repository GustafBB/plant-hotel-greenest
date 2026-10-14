import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cactus igge = new Cactus("Igge", 0.2, "Cactus");
        Palm laura = new Palm("Laura", 5, "Palm");
        CarnivorousPlant meatloaf = new CarnivorousPlant("Meatloaf", 0.7, "CarnivorousPlant");
        Palm olof = new Palm("Olof", 1, "Palm");

        List<Plant> plants = new ArrayList<>();
        plants.add(igge);
        plants.add(laura);
        plants.add(meatloaf);
        plants.add(olof);

        Interface interface1 = new Interface(plants);
        interface1.showInterface(plants);
    }
}
