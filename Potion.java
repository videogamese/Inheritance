
/**
 * Write a description of class Potions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Potion extends Consumable
{
    int tier;
    String effect;
    public Potion(String name, String rarity, int charges, boolean hasAOEEffect, int tier, String effect){
        super(name, rarity, charges, hasAOEEffect);
        this.tier = tier;
        this.effect = effect;
    }
    public Potion(){
        super();
        tier = 9999;
        effect = "God";
    }
}