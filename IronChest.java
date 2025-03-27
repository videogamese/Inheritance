
/**
 * Write a description of class IronChest here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class IronChest extends ChestArmor
{
    public IronChest(String name, String rarity, String quality, boolean headPiece, boolean chestPiece, boolean legPiece, boolean bootPiece){
        super(name, rarity, quality, false, true, false, false);
        
    }
    public IronChest(){
        super();
        name = "Iron Chest";
        rarity = "Common";
        quality = "Good";
    }
    public void ReadDescription(){
        System.out.println("An oldie but a goodie trusty armor.");
    }
}
