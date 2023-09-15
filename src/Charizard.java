public class Charizard extends Pokemon {
    private String name="Charizard";
    public Charizard(){
    }
    public Charizard(int h,int na,int sa, int nd, int sd, int s){
        super(h,na,sa,nd,sd,s);
    }
    public String getName(){
        return name;
    }
    public String slash(Pokemon pk){
        String t=   "Charizard uses Slash!\n";

        return t+ super.normalAttack(pk);
    }
    public String flamethrower(Pokemon pk){
        String t=   "Charizard uses Flamethrower!\n";
        return t+ super.specialAttack(pk);
    }
    public String level(){
        return name+super.level();
    }
}
