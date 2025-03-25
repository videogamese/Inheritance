
/**
 * Write a description of class BootArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class BootArmor extends Armor
{
    public BootArmor(String name, String rarity, String quality, boolean headPiece, boolean chestPiece, boolean legPiece, boolean bootPiece){
        super(name, rarity, quality, false, false, false, true);
        
    }
    public BootArmor(){
        super();
        headPiece = false;
        chestPiece = false;
        legPiece = false;
        bootPiece = true;
    }
}
