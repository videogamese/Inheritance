
/**
 * Write a description of class e here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class StrengthPotion extends Potion
{
    int atkBuff;
    public StrengthPotion(String name, String rarity, int charges, boolean hasAOEEffect, int tier, String effect, int atkBuff){
        super(name, rarity, charges, hasAOEEffect, tier, "Mana Recovery");
        this.atkBuff = atkBuff;
    }
    public StrengthPotion(){
        super();
        atkBuff = 999999;
    }
}