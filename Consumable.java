
/**
 * Write a description of class Consumables here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Consumable extends Item
{
    int charges;
    boolean hasAOEEffect;
    public Consumable(String name, String rarity, int charges, boolean hasAOEEffect){
        super (name, rarity);
        this.charges = charges;
        this.hasAOEEffect = hasAOEEffect;
    }
    public Consumable(){
        super();
        charges = 999;
        hasAOEEffect = true;
    }
}