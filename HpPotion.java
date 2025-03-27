
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
    public void Drink(){
        System.out.println("You drink the HP potion and all wounds are healed.");
        System.out.println("How does a potion actually heal your wounds?");
    }
}
