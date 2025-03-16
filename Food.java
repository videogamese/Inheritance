
/**
 * Write a description of class Food here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Food extends Consumables implements ItemInterface
{
    boolean hasEffect;
    int recover;
    public Food(String name, String rarity, int charges, boolean hasAOEEffect, boolean hasEffect, int recover){
        super(name, rarity, charges, hasAOEEffect);
        this.hasEffect = hasEffect;
        this.recover = recover;
    }
    public Food(){
        super();
        hasEffect = true;
        recover = 99999;
    }
}