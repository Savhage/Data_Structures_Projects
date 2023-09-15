public class Blastoise extends Pokemon {
    private String name="Blastoise";
    public Blastoise(){
    }
    public Blastoise(int h,int na,int sa, int nd, int sd, int s){
        super(h,na,sa,nd,sd,s);
    }
    public String getName(){
        return name;
    }
    public String tackle(Pokemon pk){
        String t=   "Blastoise uses Tackle!\n";
        return t+super.normalAttack(pk);
    }
    public String hydropump(Pokemon pk){
        String t=   "Blastoise uses Hydropump!\n";
        return t+super.specialAttack(pk);
    }
    public String level(){
        return name+super.level();
    }

}
