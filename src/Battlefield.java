public class Battlefield {
    public static void main(String[] args) {
        Charizard ch = new Charizard(78, 84, 109, 78, 85, 100);
        Blastoise b = new Blastoise(79, 83, 85, 100, 105, 78);

        while (ch.getHp() > 0 && b.getHp() > 0) {
            System.out.println(b.tackle(ch));
            if (ch.getHp() <=0 || b.getHp() <=0)
                break;
            System.out.println(ch.slash(b));
            if (ch.getHp() <=0 || b.getHp() <=0)
                break;
            System.out.println(b.hydropump(ch));
            if (ch.getHp() <=0 || b.getHp() <=0)
                break;
            System.out.println(ch.flamethrower(b));
            if (ch.getHp() <=0 || b.getHp() <=0)
                break;
        }
        if (ch.getHp() >0){
            System.out.println(b.getName() + " has fainted!");
            System.out.println(ch.level());
        }
        else{
            System.out.println(ch.getName() + " has fainted!");
            System.out.println(b.level());
        }
    }
}
