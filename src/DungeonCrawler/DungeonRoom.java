package DungeonCrawler;
import java.util.Random;
public class DungeonRoom{

    private Entity inside;
    DungeonRoom left,right;
    Random r=new Random();

    public DungeonRoom(Character hero){
        int rand=r.nextInt(20);
        if (rand<10){
            inside=new Character(hero);
        } else if (rand<16) {
            inside=new Trap();
        }
        else{
            inside=new Item();
        }
    }
    public String inRoom(){
        return inside.getDescription();
    }
    public Entity getInside(){
        return inside;
    }
    public boolean checkLeft(){
        boolean check=true;
        if (left==null){
            check=false;
        }
        return check;
    }
    public boolean checkRight(){
        boolean check=true;
        if (right==null){
            check=false;
        }
        return check;
    }
}
