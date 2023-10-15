package DungeonCrawler;
import java.util.Random;
public class Trap extends Entity{
    Random r=new Random();
    public Trap(){
        super("Trap");
    }
    @Override
    public void setTrap(Character hero){
        int damage;
        int rand=r.nextInt(20);
        if (rand<7){
            System.out.println("As you walk through the room arrows shoot out of the wall!!");
            damage=hero.getMLife()/20;
            hero.takeDamage(damage);
            System.out.println("You take an arrow to the shoulder and take "+ damage+" damage!!!");
            System.out.println("Your attacks has also been reduced by 5!!");
            hero.increaseAttack(-5);
        }
        else if (rand<15) {
            System.out.println("As you walk through the room you see a sword." +
                    "\nWhen you attempt to pick up the sword a hidden switch activates and " +
                    "you plummet through the floor!!");
            damage=hero.getMLife()/10;
            hero.takeDamage(damage);
            hero.increaseSpeed(-5);
            System.out.println("You land hard and take "+damage+" damage!!" +
                    "\nYou wince in pain as you place pressure on your leg!!" +
                    "\nYour speed has been reduced by 5!!");
        }
        else {
            System.out.println("As you walk through the room an arrow shoots out of the wall!!!" +
                    "\nYou manage to dive out of the way, avoiding any damage!!!");
        }
    }
}
