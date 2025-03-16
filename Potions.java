
/**
 * Write a description of class Potions here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Potions extends Consumables implements ItemInterface
{
    int tier;
    String effect;
    public Potions(String name, String rarity, int charges, boolean hasAOEEffect, int tier, String effect){
        super(name, rarity, charges, hasAOEEffect);
        this.tier = tier;
        this.effect = effect;
    }
    public Potions(){
        super();
        tier = 9999;
        effect = "God";
    }
}