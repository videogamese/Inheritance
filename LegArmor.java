
/**
 * Write a description of class LegArmor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class LegArmor extends Armor
{
    public LegArmor(String name, String rarity, String quality, boolean headPiece, boolean chestPiece, boolean legPiece, boolean bootPiece){
        super(name, rarity, quality, false, false, true, false);
        
    }
    public LegArmor(){
        super();
        headPiece = false;
        chestPiece = false;
        legPiece = true;
        bootPiece = false;
    }
}
