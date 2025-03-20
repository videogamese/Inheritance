
/**
 * Write a description of class Armor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Armor extends Item
{
    String quality;
    boolean canBeUpgraded;
    public Armor(String name, String rarity, String quality){
        super (name, rarity);
        this.quality = quality;
    }
    public Armor(){
        super();
        quality = "Cell";
        canBeUpgraded = false;
    }
}