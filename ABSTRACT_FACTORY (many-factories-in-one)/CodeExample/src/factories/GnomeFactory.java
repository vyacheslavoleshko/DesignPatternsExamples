package factories;

import hero_race.gnome.GnomeArcher;
import hero_race.gnome.GnomeWarrior;
import hero_race.gnome.GnomeWizard;
import hero_type.Archer;
import hero_type.Warrior;
import hero_type.Wizard;

/**
 * This Factory creates all types of Gnomes
 *
 * @author Viacheslav Oleshko
 */
public class GnomeFactory extends AbstractFactory {
    @Override
    public Wizard createWizard() {
        return new GnomeWizard();
    }

    @Override
    public Archer createArcher() {
        return new GnomeArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new GnomeWarrior();
    }
}
