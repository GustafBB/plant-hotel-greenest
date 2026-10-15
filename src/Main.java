import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Cactus igge = new Cactus("Igge", 0.2);
        Palm laura = new Palm("Laura", 5);
        CarnivorousPlant meatloaf = new CarnivorousPlant("Meatloaf", 0.7);
        Palm olof = new Palm("Olof", 1);

        List<Plant> plants = new ArrayList<>();
        plants.add(igge);
        plants.add(laura);
        plants.add(meatloaf);
        plants.add(olof);

        Dialog dialog = new Dialog(plants);
        dialog.showInterface();
    }
}
