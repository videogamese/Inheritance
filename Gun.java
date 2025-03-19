
/**
 * Write a description of class Gun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gun extends Weapon
{
    int range;
    String ammoType;
    int fireRate;
    int magSize;
    public Gun(String name, String rarity, int dmg, String type, boolean canParry, int range, String ammoType, int fireRate, int magSize){
        super (name, rarity, dmg, type, false);
        this.range = range;
        this.ammoType = ammoType;
        this.fireRate = fireRate;
        this.magSize = magSize;
    }
    public Gun(){
        super();
        range = 999999;
        ammoType = "Destroyer of Worlds";
        fireRate = 99999;
        magSize = 9999999;
    }
}
