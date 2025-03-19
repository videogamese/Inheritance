
/**
 * Write a description of class Wand here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Wand extends Weapon
{
    int range;
    int manaCapacity;
    public Wand(String name, String rarity, int dmg, String type, boolean canParry, int range, int manaCapacity){
        super (name, rarity, dmg, type, false);
        this.range = range;
        this.manaCapacity = manaCapacity;
    }
    public Wand(){
        super();
        range = 999999;
        manaCapacity = 999999;
    }
}