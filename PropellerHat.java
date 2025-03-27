
/**
 * Write a description of class PropellerHat here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class PropellerHat extends HeadArmor
{
    public PropellerHat(String name, String rarity, String quality, boolean headPiece, boolean chestPiece, boolean legPiece, boolean bootPiece){
        super(name, rarity, quality, true, false, false, false);
        
    }
    public PropellerHat(){
        super();
        name = "1900's ahh hat";
        rarity = "Rare";
        quality = "Great";
    }
    public void Spin(){
        System.out.println("WEEEEEEEEEEEEEEEEEEEEEE!!!");
    }
}
