
/**
 * Write a description of class HeadArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class HeadArmor extends Armor
{
    public HeadArmor(String name, String rarity, String quality, boolean headPiece, boolean chestPiece, boolean legPiece, boolean bootPiece){
        super(name, rarity, quality, true, false, false, false);
        
    }
    public HeadArmor(){
        super();
        headPiece = true;
        chestPiece = false;
        legPiece = false;
        bootPiece = false;
    }
}
