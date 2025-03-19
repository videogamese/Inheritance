
/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Food extends Consumable
{
    boolean hasEffect;
    public Food(String name, String rarity, int charges, boolean hasAOEEffect, boolean hasEffect){
        super(name, rarity, charges, hasAOEEffect);
        this.hasEffect = hasEffect;
    }
    public Food(){
        super();
        hasEffect = true;
    }
}