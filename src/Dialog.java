import javax.swing.*;
import java.util.List;

public class Dialog {
    private List<Plant> plants;

    public Dialog(List<Plant> plants) {
        this.plants = plants;
    }

    public void showDialog() {
        boolean nameExists = false;
        while (!nameExists) {
            try {
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
                }
                if (!nameExists) {
                    JOptionPane.showMessageDialog(null, "Det namnet finns inte på växthotellet!");
                }
            }
            catch (NullPointerException e) {
                JOptionPane.showMessageDialog(null, "Hej då!");
                break;
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
