
/**
 * Write a description of class GatoEnBotas here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GatoEnBotas extends BootArmor
{
    public GatoEnBotas(){
        super();
        name = "The Legendary Cat's boots";
        canBeUpgraded = true;
        rarity = "Magical";
        quality = "Amazing";
    }
    public void inspect(){
        System.out.println("Fear me, if you dare!");
    }
}
