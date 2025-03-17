
/**
 * Write a description of class Weapon here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Weapon extends Item implements WeaponInterface
{
    int dmg;
    String type;
    boolean canParry;
    public Weapon(String name, String rarity, int dmg, String type, boolean canParry){
        super (name, rarity);
        this.dmg = dmg;
        this.type = type;
        this.canParry = canParry;
    }
    public Weapon(){
        super();
        dmg = 999999;
        type = "The Ultimate thing!";
        canParry = true;
    }
    public int attack(){
        System.out.println(name + " deals " + dmg + " dmg");
        return dmg;
    }
    public boolean parry(){
        if(canParry){
            return true;
        } else {
            return false;
        }
    }

}
