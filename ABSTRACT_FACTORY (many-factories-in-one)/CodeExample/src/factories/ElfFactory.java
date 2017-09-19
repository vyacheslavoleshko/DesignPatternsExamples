package factories;

import hero_race.elf.ElfArcher;
import hero_race.elf.ElfWarrior;
import hero_race.elf.ElfWizard;
import hero_type.Archer;
import hero_type.Warrior;
import hero_type.Wizard;

/**
 * This Factory creates all types of Elfs
 *
 * @author Viacheslav Oleshko
 */
public class ElfFactory extends AbstractFactory {

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
        return new ElfWarrior();
    }
}
