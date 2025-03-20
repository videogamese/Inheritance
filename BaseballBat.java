
/**
 * Write a description of class BaseballBat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BaseballBat extends Melee
{
    public BaseballBat(String name, String rarity, int dmg, String type, boolean canParry, String meleeType, boolean canBeThrown){
        super (name, rarity, dmg, type, true, "Blunt Weapon", false);
        
    }
    public BaseballBat(){
        super("STABBY STAB!", "Dev", 99999, "Light Weapon", true, "Sharp Edge", true);
        
    }
    public void Swing(){
        System.out.println("You swing the bat!");
    }
}