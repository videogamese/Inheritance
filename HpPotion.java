
/**
 * Write a description of class HpPotion here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class HpPotion extends Potion
{
    int heal;
    public HpPotion(String name, String rarity, int charges, boolean hasAOEEffect, int tier, String effect, int heal){
        super(name, rarity, charges, hasAOEEffect, tier, "Healing");
        this.heal = heal;
    }
    public HpPotion(){
        super();
        heal = 999999;
    }
}
