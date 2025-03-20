
/**
 * Write a description of class GreatSword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GreatSword extends Melee
{
    public GreatSword(String name, String rarity, int dmg, String type, boolean canParry, String meleeType, boolean canBeThrown){
        super (name, rarity, dmg, type, true, "Sharp Edge", false);

    }
    public GreatSword(){
        super("STABBY STAB!", "Dev", 99999, "Heavy Weapon", true, "Sharp Edge", false);

    }
    public void Unknown(){
        System.out.println("You are too weak to know what this does.");
    }
}
