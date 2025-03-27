
/**
 * Write a description of class SupremeDrip here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SupremeDrip extends ChestArmor
{
    public SupremeDrip(String name, String rarity, String quality, boolean headPiece, boolean chestPiece, boolean legPiece, boolean bootPiece){
        super(name, rarity, quality, false, true, false, false);
        
    }
    public SupremeDrip(){
        super();
        name = "Dripy Shirt";
        rarity = "Goku";
        quality = "Ultra";
    }
    public void HiddenAbility(){
        System.out.println("You unlock the full power of Ultra Dripstinct");
    }
}
