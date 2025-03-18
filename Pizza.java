
/**
 * Write a description of class Pizza here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Pizza extends Food
{
    String Cheese;
    String firstTopping;
    String secondTopping;
    public Pizza(String name, String rarity, int charges, boolean hasAOEEffect, boolean hasEffect, String Cheese, String firstTopping, String secondTopping){
        super(name, rarity, charges, hasAOEEffect, hasEffect);
        this.Cheese = Cheese;
        this.firstTopping = firstTopping;
        this.secondTopping = secondTopping;
    }
    public Pizza(){
        super();
        Cheese = "mozzarella";
        firstTopping = "PEPPERONNI";
        secondTopping = "Chocolate fudge";
    }
}
