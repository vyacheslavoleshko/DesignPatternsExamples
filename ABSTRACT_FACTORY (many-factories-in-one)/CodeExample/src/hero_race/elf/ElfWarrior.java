package hero_race.elf;

import hero_type.Warrior;

/**
 * @author Viacheslav Oleshko
 */
public class ElfWarrior implements Warrior {
    @Override
    public void smash() {
        System.out.println("Attack using Elf Sword");
    }

    @Override
    public String toString() {
        return "I'm ElfWarrior";
    }
}
