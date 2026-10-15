import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Interface {
    List<Plant> plants = new ArrayList<>();

    public Interface(List<Plant> plants) {
        this.plants = plants;
    }

    public void showInterface(List<Plant> plants) {
        boolean nameExists = false;
        while (!nameExists) {
            String plantName = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

            for (Plant plant : plants) {
                if (plantName.equalsIgnoreCase(plant.getName())) {
                    if (plant.getPlantType().equals("Palm")) {
                        JOptionPane.showMessageDialog(null, plant.getName() + " ska ha " +
                                ((Palm) plant).calculateLiquidAmount() + " liter " +
                                ((Palm) plant).getLiquidType().toString().replace(
                                        "_", " ").toLowerCase() + " per dag.");
                        nameExists = true;
                        break;
                    }
                    else if (plant.getPlantType().equals("CarnivorousPlant")) {
                        JOptionPane.showMessageDialog(null, plant.getName() + " ska ha " +
                                ((CarnivorousPlant) plant).calculateLiquidAmount() + " liter " +
                                ((CarnivorousPlant) plant).getLiquidType().toString().replace(
                                        "_", " ").toLowerCase() + " per dag.");
                        nameExists = true;
                        break;
                    }
                    else if (plant.getPlantType().equals("Cactus")) {
                        JOptionPane.showMessageDialog(null, plant.getName() + " ska ha " +
                                ((Cactus) plant).calculateLiquidAmount() + " liter " +
                                ((Cactus) plant).getLiquidType().toString().replace(
                                        "_", " ").toLowerCase() + " per dag.");
                        nameExists = true;
                        break;
                    }
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
