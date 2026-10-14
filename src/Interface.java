import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Interface {
    List<Plant> plants = new ArrayList<>();

    public Interface(List<Plant> plants) {
        this.plants = plants;
    }

    public void showInterface(List<Plant> plants) {
        String plantName = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

        for (Plant plant : plants) {
            if (plantName.equals(plant.getName())) {
                if (plant.getPlantType().equals("Palm")) {
                    JOptionPane.showMessageDialog(null, plantName + " ska ha " + ((Palm) plant).calculateLiquidAmount() + ((Palm) plant).getLiquidType() + "liter per dag.");
                }
                else if (plant.getPlantType().equals("CarnivorousPlant")) {
                    JOptionPane.showMessageDialog(null, plantName + " ska ha " + ((CarnivorousPlant) plant).calculateLiquidAmount() + ((CarnivorousPlant) plant).getLiquidType() + "liter per dag.");
                }
                else if (plant.getPlantType().equals("Cactus")) {
                    JOptionPane.showMessageDialog(null, plantName + " ska ha " + ((Cactus) plant).calculateLiquidAmount() + ((Cactus) plant).getLiquidType() + "liter per dag.");
                }
            }
        }

    }

}
