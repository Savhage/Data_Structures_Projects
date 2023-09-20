public class Pokemon implements LevelUp{
    private int hp, nAttack, sAttack, nDefense, sDefense, speed;
    public Pokemon(){
    }
    public Pokemon(int h,int a,int sA,int d,int sD,int s){
        hp=h;
        nAttack=a;
        sAttack=sA;
        nDefense=d;
        sDefense=sD;
        speed=s;
    }
    public int getHp(){
        return hp;
    }

    public int getNAttack(){
        return nAttack;
    }
    public int getSAttack(){
        return sAttack;
    }
    public int getNDefense(){
        return nDefense;
    }
    public int getSDefense(){
        return sDefense;
    }
    public int getSpeed(){
        return speed;
    }
    public void setHp(int h){
        hp-=h;
    }
    public String normalAttack(Pokemon pk) {
        String k="Your enemy has " + pk.getHp() +" HP!\n";
        String n="Your attack was ineffective and did not do damage!";
        int nD=pk.getNDefense()/2;
        int j = nAttack - nD;
        if (j > 0) {
            pk.setHp(j);
            String m=   "Your attack dealt " + j + " damage.\n" +
                        "Your enemy now has " + pk.getHp() + "HP";
            return k+m;
        }
        else{
            return k+n;
        }
    }
    public String specialAttack(Pokemon pk) {
        String k="Your enemy has " + pk.getHp() +" HP!\n";
        String n="Your attack was ineffective and did not do damage!";
        int sD=pk.getSDefense()/2;
        int j = sAttack - sD;
        if (j > 0) {
            pk.setHp(j);
            String m=   "Your attack dealt " + j + " damage.\n" +
                    "Your enemy now has " + pk.getHp() + "HP";
            return k+m;
        }
        else{
            return k+n;
        }
    }
    @Override
     public String level(){
        int h=hp;
        int nA=nAttack;
        int sA=sAttack;
        int nD=nDefense;
        int sD=sDefense;
        int s=speed;

            hp += rate;
            nAttack += rate;
            sAttack += rate;
            nDefense += rate;
            sDefense += rate;
            speed += rate;
            String j = " has leveled up!!!\n" +
                    "Old Value\tStat\tNew Value\n" +
                    h + "\t     HP      \t" + hp + "\n" +
                    nA + "\tNormal Attack\t" + +nAttack + "\n" +
                    sA + "\tSpecial Attack\t" + +sAttack + "\n" +
                    nD + "\tNormal Defense\t" + nDefense + "\n" +
                    sD + "\tSpecial Defense\t" + sDefense + "\n" +
                    s + "\t    Speed   \t" + speed;
            return j;
    }
}

