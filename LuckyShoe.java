
/**
 * Write a description of class LuckyShoe here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LuckyShoe extends BootArmor
{
    public LuckyShoe(){
        super();
        name = "Leprechaun's shoes";
        canBeUpgraded = true;
        rarity = "Magical";
        quality = "Great";
    }
    public void inspect(){
        System.out.println("They're magically delicious");
    }
}
