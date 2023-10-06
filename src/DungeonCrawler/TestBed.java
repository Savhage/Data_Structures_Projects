package DungeonCrawler;

public class TestBed {
    public static void main(String[] args){
        Character alex=new Character(10,10,5,5,5);
        System.out.println(alex);
        Character monster1=new Character(alex);
        System.out.println(monster1);
      alex.battle(monster1);
      System.out.println(alex.getLife());
      System.out.println(monster1.getLife());
    }
}
