
/**
 * Write a description of class ChestArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class ChestArmor extends Armor
{
    public ChestArmor(String name, String rarity, String quality, boolean headPiece, boolean chestPiece, boolean legPiece, boolean bootPiece){
        super(name, rarity, quality, false, true, false, false);
        
    }
    public ChestArmor(){
        super();
        headPiece = false;
        chestPiece = true;
        legPiece = false;
        bootPiece = false;
    }
}
