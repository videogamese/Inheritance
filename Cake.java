
/**
 * Write a description of class Cake here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Cake extends Food
{
    String flavor;
    String firstTopping;
    String secondTopping;
    public Cake(String name, String rarity, int charges, boolean hasAOEEffect, boolean hasEffect, String flavor, String firstTopping, String secondTopping){
        super(name, rarity, charges, hasAOEEffect, hasEffect);
        this.flavor = flavor;
        this.firstTopping = firstTopping;
        this.secondTopping = secondTopping;
    }
    public Cake(){
        super();
        flavor = "Tres Leches";
        firstTopping = "Fondant Flowers";
        secondTopping = "Chocolate fudge";
    }
    public void Eat(){
        System.out.println("Could I have a slice?");
    }
}
