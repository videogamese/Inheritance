
/**
 * Write a description of class e here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ManaPotion extends Potion
{
    int manaRecover;
    public ManaPotion(String name, String rarity, int charges, boolean hasAOEEffect, int tier, String effect, int manaRecover){
        super(name, rarity, charges, hasAOEEffect, tier, "Mana Recovery");
        this.manaRecover = manaRecover;
    }
    public ManaPotion(){
        super();
        manaRecover = 999999;
    }
}
