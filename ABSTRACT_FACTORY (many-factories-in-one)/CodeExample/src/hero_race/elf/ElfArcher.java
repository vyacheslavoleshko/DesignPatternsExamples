package hero_race.elf;

import hero_type.Archer;

/**
 * @author Viacheslav Oleshko
 */
public class ElfArcher implements Archer {
    @Override
    public void shoot() {
        System.out.println("Shoot from Elf Bow");
    }
}
