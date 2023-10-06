package DungeonCrawler;

import java.util.Random;
public class Character {
    private int mLife, life, attack,defense,speed,money,lvl,experience;
    Random r=new Random();
    /*
    Used to create the Hero DungeonCrawler.Character.
     */
    public Character(int l,int a, int d, int s,int m){
        mLife=l;
        life=l;
        attack=a;
        defense=d;
        speed=s;
        money=m;
        lvl=1;
        experience=0;

    }
    /*
    Used when creating monsters to scale them randomly to Hero's level
     */
    public Character(Character hero){
        int l=hero.getLvl();
        lvl=l+r.nextInt(0,3);
        mLife=lvl*r.nextInt(1,21);
        life=mLife;
        attack=lvl*r.nextInt(1,6);
        defense=lvl*r.nextInt(1,5);
        speed=lvl*r.nextInt(3,12);
        money=lvl*r.nextInt(0,21);
        experience=lvl*r.nextInt(1,4);
    }
    public int getLife() {
        return life;
    }
    public void takeDamage(int damage) {
        life-=damage;
    }
    public void heal(int h){
        if (life+h>mLife){
            life=mLife;
        }
        else{
            life+=h;
        }
    }
    public int getAttack() {
        return attack;
    }
    public int getDefense() {
        return defense;
    }
    public int getSpeed() {
        return speed;
    }
    public int getMoney() {
        return money;
    }
    public int getLvl() {
        return lvl;
    }
    public int getExperience(){
        return experience;
    }
    public void battle(Character enemy){
        if(compareSpeed(enemy)) {
            attack(enemy);

        }
        else{
            defend(enemy);
        }
    }
    private boolean compareSpeed(Character enemy) {
        boolean check= false;
        if (speed > enemy.getSpeed()){
            check=true;
        }
        return check;
    }
    private void attack(Character enemy){
        System.out.println("You are faster than the SLIME!");
        while (checkLife() && enemy.checkLife()) {
            System.out.println("You attack the slime!!");
            int damage = attack - (enemy.getDefense() / 2);
            System.out.println("The SLIME takes " + damage + " damage!!");
            enemy.takeDamage(damage);
            if (enemy.getLife()<=0){
                System.out.println("You have slain the SLIME!!");
                gainExperience(enemy);
            }
            else{
                System.out.println("The SLIME now has " + enemy.getLife() + " health!!\n");
                System.out.println("The SlIME attacks!!");
                int harm=enemy.getAttack()-(defense/2);
                System.out.println("You took "+ harm+ " damage!!");
                takeDamage(harm);
                if(life<=0){
                    System.out.println("You have taken lethal damage!!! The pearly gate await!!!");
                }
                else{
                    System.out.println("You now have"+life+" health!!\n");
                }
            }
        }
    }
    private void defend(Character enemy){
        System.out.println("The SLIME is quicker than you!!");
        while (checkLife() && enemy.checkLife()) {
            System.out.println("The SlIME attacks!!");
            int harm=enemy.getAttack()-(defense/2);
            System.out.println("You took "+ harm+ " damage!!");
            takeDamage(harm);
            if (life<=0){
                System.out.println("You have taken lethal damage!!! The pearly gate await!!!");
            }
            else {
                System.out.println("You now have "+life+" health!!\n");
                System.out.println("You attack the slime!!");
                int damage = attack - (enemy.getDefense() / 2);
                System.out.println("The SLIME takes " + damage + " damage!!");
                enemy.takeDamage(damage);
                if (enemy.getLife()<=0){
                    System.out.println("You have slain the SLIME!!");
                    gainExperience(enemy);
                }
                else{
                    System.out.println("The SLIME now has " + enemy.getLife() + " health!!\n");
                }
            }
        }
    }
    public boolean checkLife(){
       boolean check=true;
        if (life<1){
            check=false;
        }
        return check;
    }
    public void gainExperience(Character enemy){
        experience+=enemy.getExperience();
        System.out.println("You have gained "+ enemy.getExperience()+" experience!!");
        checkLevelUp();
    }
    /*
    Check if DungeonCrawler.Character has reached threshold to LevelUp and call
    levelUp method if it is
    */
    public void checkLevelUp(){
        int check=lvl*3*2;
        if (experience>=check){
            levelUp();
        }
    }
    /*
    Method to level up that cannot be called outside of class (Anti-Cheat lol)
     */
    private void levelUp() {
        lvl+=1;
        mLife+=lvl+r.nextInt(1,21);
        life+=mLife;
        attack+=lvl+r.nextInt(1,6);
        defense+=lvl+r.nextInt(1,11);
        speed+=lvl+r.nextInt(3,12);
        System.out.println("You have leveled up!!");
        System.out.println(this.toString());
    }
    public int nextLevel(){
        return lvl*3*2-experience;
    }
    public String toString(){
        String s=   "~~~Character Sheet~~~"+
                    "\n~~~~~~~~~~~~~~~~~~~~~"+
                    "\nMaximum HP......"+ mLife+
                    "\nCurrent HP......"+ life+
                    "\nAttack.........."+ attack+
                    "\nDefense........."+ defense+
                    "\nSpeed..........."+ speed+
                    "\nLevel..........."+lvl+
                    "\nExperience......"+ experience+
                    "\nTo next level..."+ nextLevel();
        return s;
    }
}

