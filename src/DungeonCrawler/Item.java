package DungeonCrawler;
import java.util.Random;
public class Item extends Entity{
    Random r=new Random();

    public Item(){
        super("Item");
        }
        @Override
    public void getItem(Character hero){
            int rand=r.nextInt(100);
            if (rand<40){
                System.out.println("You have found a fountain of healing!!!" +
                        "\nYou have healed "+ hero.getMLife()/2+ " health!!"+
                        "\nYou now have "+hero.getLife()+ " health!!");
                hero.heal(hero.getMLife()/2);
            }
            else if (rand<65) {
                System.out.println("You have found a better sword!!"+
                        "\nYour attack has increase by 4!!");
                hero.increaseAttack(4);
            }
            else if (rand<90) {
                System.out.println("You find boots with a strong aura!! \n" +
                        "You put the boots on and notice that you're movement has become a bit more swift!!");
                hero.increaseSpeed(4);
            }
            else {
                System.out.println("You have found a new sword!!" +
                        "\nIt crumbles to dust when you pick it up!!" +
                        "\nLaughter echoes in the distance!!");
        }
    }
}
