
/**
 * Write a description of class PoisonousStuff here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PoisonousStuff extends Food
{
    int poision;
    public PoisonousStuff(String name, String rarity, int charges, boolean hasAOEEffect, boolean hasEffect, int poision){
        super(name, rarity, charges, hasAOEEffect, true);
        this.poision = poision;
    }
    public PoisonousStuff(){
        super();
        poision = 9999999;
    }
}