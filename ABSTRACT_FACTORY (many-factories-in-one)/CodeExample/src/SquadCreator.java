import factories.AbstractFactory;
import hero_type.Archer;
import hero_type.Warrior;
import hero_type.Wizard;

/**
 * @author Viacheslav Oleshko
 */
public class SquadCreator {
    public void createSquad(AbstractFactory factory) {
        Wizard wizard = factory.createWizard();
        Archer archer = factory.createArcher();
        Warrior warrior = factory.createWarrior();
    }
}
