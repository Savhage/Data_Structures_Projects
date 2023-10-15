package DungeonCrawler;

public class Entity {
    String description;
    public Entity(String s){
        description=s;
    }
    public String getDescription(){
        return description;
    }
    public void setTrap(Character hero){}
    public void getItem(Character hero){}
    public int getLife(){
        return -1;
    }
    public int getAttack(){
        return -1;
    }
    public int getSpeed(){
        return -1;
    }
    public int getDefense(){
        return -1;
    }
    public int getExperience(){
        return -1;
    }
    public int getMoney(){
        return -1;
    }
    public boolean checkLife(){
        return false;
    }
    public void takeDamage(int t){}
}
