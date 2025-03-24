
/**
 * Write a description of class ReverseCard here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ReverseCard extends DefensiveItem
{
    boolean triggered;
    public ReverseCard(String name, String rarity, int durability, boolean onlyOneEquipped, boolean canBlock, boolean triggered){
        super(name, rarity, durability, onlyOneEquipped, canBlock);
        this.triggered = triggered;
    }
    public ReverseCard(){
        super();
        durability = 99999;
        onlyOneEquipped = false;
        name = "Uno Reverse Card";
        rarity = "Those who know 💀";
        triggered = false;
        canBlock = true;
    }
    public void useCard(){
        triggered = true;
        System.out.println("No u");
    }
}
