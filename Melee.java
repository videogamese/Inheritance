
/**
 * Write a description of class Sword here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Melee extends Weapon
{
    String meleeType;
    boolean canBeThrown;
    public Melee(String name, String rarity, int dmg, String type, boolean canParry, String meleeType, boolean canBeThrown){
        super (name, rarity, dmg, type, true);
        this.meleeType = meleeType;
        this.canBeThrown = canBeThrown;
    }
    public Melee(){
        super();
        meleeType = "Sharp Edge";
        canBeThrown = false;
    }
}
