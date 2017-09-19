import systems.Electronics;
import systems.Sluice;
import systems.Turbine;

import java.util.Arrays;

/**
 * @author Viacheslav Oleshko
 */
public class Main {
    public static void main(String[] args) {
        HydropowerPlantFacade facade = new HydropowerPlantFacade(
                new Electronics(),
                new Turbine(),
                Arrays.asList(new Sluice("№1"), new Sluice("№2"))
        );

        facade.startHydropowerPlant();
    }
}
