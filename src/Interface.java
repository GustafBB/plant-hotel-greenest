import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Interface {
    List<Plant> plants = new ArrayList<>();

    public Interface(List<Plant> plants) {
        this.plants = plants;
    }

    String plantName = JOptionPane.showInputDialog("Vilken växt ska få vätska?");

    for (Plant plant : plants) {
        if (plantName.equals(plant.getName())) {
            JOptionPane.showMessageDialog(null, plantName + " ska ha " + plant.calculateLiquidAmount + plant.getLiquidType + "liter per dag.");
        }
    }

}
