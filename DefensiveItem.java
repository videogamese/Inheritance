
/**
 * Write a description of class DefensiveItem here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class DefensiveItem extends Item implements DefenseCommands
{
    int durability;
    boolean onlyOneEquipped;
    boolean canBlock;
    public DefensiveItem(String name, String rarity, int durability, boolean onlyOneEquipped, boolean canBlock){
        super (name, rarity);
        this.durability = durability;
        this.onlyOneEquipped = onlyOneEquipped;
        this.canBlock = canBlock;
    }
    public DefensiveItem(){
        super();
        durability = 99999;
        onlyOneEquipped = false;
        canBlock = true;
    }
    public boolean blocked(){
        if(canBlock){
            return true;
        } else {
            return false;
        }
    }
}
