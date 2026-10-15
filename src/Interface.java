import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Interface {
    List<Plant> plants;

    public Interface(List<Plant> plants) {
        this.plants = plants;
    }

    public void showInterface(List<Plant> plants) {
        boolean nameExists = false;
        while (!nameExists) {
            String plantName = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

            for (Plant plant : plants) {
                if (plantName.equalsIgnoreCase(plant.getName())) {
                    JOptionPane.showMessageDialog(null, plant.getName() + " ska ha " +
                            plant.calculateLiquidAmount() + " liter " +
                            plant.getLiquidType().toString().replace(
                                    "_", " ").toLowerCase() + " per dag.");
                    nameExists = true;
                    break;
                }
                //else {
                //JOptionPane.showMessageDialog(null, "Det namnet finns inte på växthotellet!");
                //break;
                //}
            }
            if (!nameExists) {
                JOptionPane.showMessageDialog(null, "Det namnet finns inte på växthotellet!");
            }
        }

    }
    /*
    Can use instanceof instead of getPlantType:
    if (plant instanceof Palm) {
        ...
    }
    else if (plant instanceof CarnivorousPlant) {
        ...
    }
    ...

    But it's better to use abstract methods! (I think.) Maybe abstract class for Media as well.
     */

}
