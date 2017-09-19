package hero_race.elf;

import hero_type.Wizard;

/**
 * @author Viacheslav Oleshko
 */
public class ElfWizard implements Wizard {
    @Override
    public void cast() {
        System.out.println("Casting using Elf Magic");
    }
}
