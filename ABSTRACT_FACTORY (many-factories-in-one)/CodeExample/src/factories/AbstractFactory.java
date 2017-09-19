package factories;

import hero_type.Archer;
import hero_type.Warrior;
import hero_type.Wizard;

/**
 * @author Viacheslav Oleshko
 */
public abstract class AbstractFactory {
    public abstract Wizard createWizard();
    public abstract Archer createArcher();
    public abstract Warrior createWarrior();
}
