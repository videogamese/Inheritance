
/**
 * Write a description of class Item here.
 * 
 * @author Wiebe 
 * @version 1.2
 */
import java.util.ArrayList;
public abstract class Item implements ItemInterface{
    //Implemented in your own way
    String rarity;
    String name;
    public Item(String name, String rarity){
        this.name = name;
        this.rarity = rarity;
    }
    public Item(){
        this("Placeholder", "Dev");
    }
    public String getName(){
        return name;
    }
}