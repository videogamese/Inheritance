
/**
 * Write a description of class Sheild here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sheild extends DefensiveItem
{
    boolean hasThorns;
    boolean canReflect;
    boolean canAbsorb;
    public Sheild(String name, String rarity, int durability, boolean onlyOneEquipped, boolean canBlock, boolean hasThorns, boolean canReflect, boolean canAbsorb){
        super(name, rarity, durability, onlyOneEquipped, canBlock);
        this.hasThorns = hasThorns;
        this.canReflect = canReflect;
        this.canAbsorb = canAbsorb;
    }
    public Sheild(){
        super();
        hasThorns = true;
        canReflect = true;
        canAbsorb = true;
        canBlock = true;
    }
    public void equipTail(){
        System.out.println("HUE HUE HUEEE!!");
    }
}
