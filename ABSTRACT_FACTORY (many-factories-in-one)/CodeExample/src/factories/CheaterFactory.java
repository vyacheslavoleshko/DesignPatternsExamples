package factories;

import hero_race.elf.ElfArcher;
import hero_race.elf.ElfWizard;
import hero_race.gnome.GnomeWarrior;
import hero_type.Archer;
import hero_type.Warrior;
import hero_type.Wizard;

/**
 * @author Viacheslav Oleshko
 */
public class CheaterFactory extends AbstractFactory {
    @Override
    public Wizard createWizard() {
        return new ElfWizard();
    }

    @Override
    public Archer createArcher() {
        return new ElfArcher();
    }

    @Override
    public Warrior createWarrior() {
        return new GnomeWarrior();
    }
}
