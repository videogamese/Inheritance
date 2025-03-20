
/**
 * Write a description of class DefensiveItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class DefensiveItem extends Item
{
    int durability;
    boolean onlyOneEquipped;
    public DefensiveItem(String name, String rarity){
        super (name, rarity);
        this.durability = durability;
        this.onlyOneEquipped = onlyOneEquipped;
    }
    public DefensiveItem(){
        super();
        durability = 99999;
        onlyOneEquipped = false;
    }
}
