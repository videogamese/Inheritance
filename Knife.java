
/**
 * Write a description of class Knife here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Knife extends Melee
{
    public Knife(String name, String rarity, int dmg, String type, boolean canParry, String meleeType, boolean canBeThrown){
        super (name, rarity, dmg, type, true, "Pointed Edge", true);

    }
    public Knife(){
        super("STABBY STAB!", "Dev", 99999, "Light Weapon", true, "Sharp Edge", true);

    }
    public void MakeNoise(){
        System.out.println("HUEHEHHEHEHEHEHEHEHEH! MONI!");
    }
}
