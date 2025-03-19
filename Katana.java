
/**
 * Write a description of class Katana here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Katana extends Sword
{
    public Katana(String name, String rarity, int dmg, String type, boolean canParry, String meleeType, boolean canBeThrown){
        super (name, rarity, dmg, type, true, "Pointed Edge", false);
        
    }
    public Katana(){
        super("Manuel's Creation", "Dev", 99999, "Light Weapon", true, "Sharp Edge", false);
        
    }
}
