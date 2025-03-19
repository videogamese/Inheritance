
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sword extends Weapon
{
    String meleeType;
    boolean canBeThrown;
    public Sword(String name, String rarity, int dmg, String type, boolean canParry, String meleeType, boolean canBeThrown){
        super (name, rarity, dmg, type, true);
        this.meleeType = meleeType;
        this.canBeThrown = canBeThrown;
    }
    public Sword(){
        super();
        meleeType = "Sharp Edge";
        canBeThrown = false;
    }
}
