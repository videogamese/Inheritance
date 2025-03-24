
/**
 * Write a description of class Armor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public abstract class Armor extends Item
{
    String quality;
    boolean canBeUpgraded;
    boolean headPiece;
    boolean chestPiece;
    boolean legPiece;
    boolean bootPiece;
    public Armor(String name, String rarity, String quality, boolean headPiece, boolean chestPiece, boolean legPiece, boolean bootPiece){
        super (name, rarity);
        this.quality = quality;
        this.headPiece = headPiece;
        this.chestPiece = chestPiece;
        this.legPiece = legPiece;
        this.bootPiece = bootPiece;
    }
    public Armor(){
        super();
        quality = "Cell";
        canBeUpgraded = false;
        headPiece = true;
        chestPiece = true;
        legPiece = true;
        bootPiece = true;
    }
}