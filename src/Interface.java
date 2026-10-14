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
        for (Plant plant : plants) {
            String plantName = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

            if (plantName.equalsIgnoreCase(plant.getName())) {
                if (plant.getPlantType().equals("Palm")) {
                    JOptionPane.showMessageDialog(null, plant.getName() + " ska ha " +
                            ((Palm) plant).calculateLiquidAmount() + " liter " +
                            ((Palm) plant).getLiquidType().toString().replace(
                                    "_", " ").toLowerCase() + " per dag.");
                }
                else if (plant.getPlantType().equals("CarnivorousPlant")) {
                    JOptionPane.showMessageDialog(null, plant.getName() + " ska ha " +
                            ((CarnivorousPlant) plant).calculateLiquidAmount() + " liter " +
                            ((CarnivorousPlant) plant).getLiquidType().toString().replace(
                                    "_", " ").toLowerCase() + " per dag.");
                }
                else if (plant.getPlantType().equals("Cactus")) {
                    JOptionPane.showMessageDialog(null, plant.getName() + " ska ha " +
                            ((Cactus) plant).calculateLiquidAmount() + " liter " +
                            ((Cactus) plant).getLiquidType().toString().replace(
                                    "_", " ").toLowerCase() + " per dag.");
                }
            }
            else {
                JOptionPane.showMessageDialog(null, "Det namnet finns inte på växthotellet!");
            }
        }

    }

}
