
/**
 * Write a description of class GoldLegging here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GoldLegging extends LegArmor
{
    public GoldLegging(){
        super();
        name = "Gold Leggings";
        canBeUpgraded = false;
        rarity = "Common";
        quality = "Good";
    }
    public void showOff(){
        System.out.println("You look FABUUULOUSSSSSS");
    }
}
