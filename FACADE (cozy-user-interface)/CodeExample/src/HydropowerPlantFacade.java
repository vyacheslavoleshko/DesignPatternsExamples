import systems.Electronics;
import systems.Sluice;
import systems.Turbine;

import java.util.List;

/**
 * @author Viacheslav Oleshko
 */
public class HydropowerPlantFacade {
    private Electronics electronics;
    private Turbine turbine;
    private List<Sluice> sluices;

    public HydropowerPlantFacade(Electronics electronics, Turbine turbine, List<Sluice> sluices) {
        this.electronics = electronics;
        this.turbine = turbine;
        this.sluices = sluices;
    }

    public void startHydropowerPlant() {
        electronics.launch();
        turbine.startTurbine();
        sluices.forEach(Sluice::openSluice);
    }
}
