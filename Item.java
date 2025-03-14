
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public class Item implements ItemInterface{
    //Implemented in your own way
    int rarity;
    boolean hasDurability;
    public Item(int Rarity, boolean durability){
        rarity = Rarity;
        hasDurability = durability;
    }
}