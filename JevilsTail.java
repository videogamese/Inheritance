
/**
 * Write a description of class JevilsTail here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class JevilsTail extends DefensiveItem
{
    int defenseIncrease;
    public JevilsTail(String name, String rarity, int durability, boolean onlyOneEquipped, boolean canBlock, int defenseIncrease){
        super(name, rarity, durability, onlyOneEquipped, canBlock);
        this.defenseIncrease = defenseIncrease;
    }
    public JevilsTail(){
        super();
        durability = 99999;
        onlyOneEquipped = true;
        name = "Jevil's Tail";
        rarity = "Chaos Chaos!";
        defenseIncrease = 999;
        canBlock = false;
    }
    public void equipTail(){
        System.out.println("HUE HUE HUEEE!!");
    }
}
