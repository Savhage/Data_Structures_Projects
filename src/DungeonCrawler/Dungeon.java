package DungeonCrawler;
import java.util.Random;
public class Dungeon {
    DungeonRoom left, right;
    private boolean out;
    private String[] mapL=new String[7];
    private String[] mapR=new String[7];
    Random r=new Random();
    public Dungeon(int floor){

        for (int i=0;i<7;i++) {
            DungeonRoom newRoom = new DungeonRoom(floor);

            if (left == null) {
                left = newRoom;
                right = newRoom;
            } else {
                newRoom.left = left;
                newRoom.right = right;
                right.left=newRoom;
                left.right = newRoom;
                left = newRoom;
            }
        }
        DungeonRoom exitRoom=new DungeonRoom();
        exitRoom.left=left;
        exitRoom.right=right;
        right.left=exitRoom;
        left.right=exitRoom;
        left=exitRoom;
        for (int i=0;i<6;i++) {
            DungeonRoom newRoom = new DungeonRoom(floor);

            if (left == null) {
                left = newRoom;
                right = newRoom;
            } else {
                newRoom.left = left;
                newRoom.right = right;
                right.left = newRoom;
                left.right = newRoom;
                left = newRoom;
            }
        }
        DungeonRoom r,l;
        l=left;
        r=right;
        for (int i=0;i<7;i++) {
            mapL[i] = l.getInside().getDescription();
            mapR[i] = r.getInside().getDescription();
            l = l.left;
            r = r.right;
        }
    }
    public void goLeft(Character hero){
        event(hero,left);
        left=left.left;
    }
    public void skipLeft(Character hero){
       int rand=r.nextInt(2);
       if (rand==0){
           System.out.println("You have successfully skipped the room!!\n");
           left=left.left;
       }
       else{
           System.out.println("You have failed to get through the room safely!!\n");
           goLeft(hero);
       }
    }
    public void goRight(Character hero){
        event(hero,right);
        right=right.right;
    }
    public void skipRight(Character hero){
        int rand=r.nextInt(2);
        if (rand==0) {
            System.out.println("You have successfully skipped the room!!\n");
            right = right.right;
        }
        else{
            System.out.println("You have failed to get through the room safely!!\n");
            goRight(hero);
        }
    }
    public String checkLeft(){
        return left.inRoom();
    }
    public String checkRight(){
        return right.inRoom();
    }
    public void event(Character hero,DungeonRoom interior){
        if(interior.getInside() instanceof Character){
            hero.battle(interior.getInside());
        } else if (interior.getInside() instanceof Item) {
            interior.getInside().getItem(hero);
        }
        else if (interior.getInside() instanceof Trap){
            interior.getInside().setTrap(hero);
        }
        else{
            out=false;
        }
    }
    public boolean getOut(){
        return out;
    }
    public void setOut(){
        out=true;
    }
    public String toString(){
        String j=   "   ["+mapL[6]+"]   --  ["+mapR[6]+"]\n"+
                "      |            |   \n" +
                    "   ["+mapL[5]+"]       ["+mapR[5]+"]\n"+
                    "      |            |   \n" +
                    "   ["+mapL[4]+"]       ["+mapR[4]+"]\n"+
                    "      |            |   \n" +
                    "   ["+mapL[4]+"]       ["+mapR[4]+"]\n"+
                    "      |            |   \n" +
                    "   ["+mapL[3]+"]       ["+mapR[3]+"]\n"+
                    "      |            |   \n" +
                    "   ["+mapL[2]+"]       ["+mapR[2]+"]\n"+
                    "      |            |   \n" +
                    "   ["+mapL[1]+"]       ["+mapR[1]+"]\n"+
                    "      |            |   \n" +
                    "   ["+mapL[0]+"]       ["+mapR[0]+"]\n"+
                    "        [Entrance]\n" ;
        return j;
    }
}
