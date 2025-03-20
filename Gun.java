
/**
 * Write a description of class Gun here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Gun extends Weapon
{
    int range;
    String ammoType;
    int fireRate;
    int magSize;
    public Gun(String name, String rarity, int dmg, String type, boolean canParry, int range, String ammoType, int fireRate, int magSize){
        super (name, rarity, dmg, type, false);
        this.range = range;
        this.ammoType = ammoType;
        this.fireRate = fireRate;
        this.magSize = magSize;
    }
    public Gun(){
        super();
        range = 999999;
        ammoType = "Destroyer of Worlds";
        fireRate = 99999;
        magSize = 9999999;
    }
    public void NoScope(){
        System.out.println("Get cliped on bum");
    }
    public void CrazySpin(){
        int chance = (int)(Math.random()*20 + 1);
        if(chance == 20){
            System.out.println("With your skill you could do a quickdraw!");
        } else if(chance > 14){
            System.out.println("Nice trick!");
        } else if(chance > 9){
            System.out.println("You just fidget with the gun.");
        } else if(chance > 1){
            System.out.println("bro you almost dropped it bum");
        } else if(chance == 1){
            System.out.println("You shot yourself...");
            System.out.println("You are dead.");
            System.out.println("Great idea to play with a deadly weapon with no experience no?");
        }
    }
}
