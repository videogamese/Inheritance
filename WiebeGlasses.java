
/**
 * Write a description of class WiebeGlasses here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WiebeGlasses extends HeadArmor
{
    public WiebeGlasses(String name, String rarity, String quality, boolean headPiece, boolean chestPiece, boolean legPiece, boolean bootPiece){
        super(name, rarity, quality, true, false, false, false);
        
    }
    public WiebeGlasses(){
        super();
        name = "A Supreme Being's Glasses";
        rarity = "Divine";
        quality = "Old?";
    }
    public void GainKnowledge(){
        System.out.println("You gain all knowledge of the Hole Wiebel");
    }
}
