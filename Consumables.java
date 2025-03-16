
/**
 * Write a description of class Consumables here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Consumables extends Item implements ItemInterface
{
    int charges;
    boolean hasAOEEffect;
    public Consumables(String name, String rarity, int charges, boolean hasAOEEffect){
        super (name, rarity);
        this.charges = charges;
        this.hasAOEEffect = hasAOEEffect;
    }
    public Consumables(){
        super();
        charges = 999;
        hasAOEEffect = true;
    }
}