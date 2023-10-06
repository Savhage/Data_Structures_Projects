import java.util.Random;
public class SlotMachine implements DataTraverser{
    private int coins;
    Random r=new Random();
    public SlotMachine(int n){
        coins=n;
    }
    @Override
    public void next(){
        remove();
        if(pull()){
                coins+=2;
            }
    }
    @Override
    public boolean hasNext(){
        boolean check=true;
        if (coins<1){
            check=false;
        }
        return check;
    }
    @Override
    public void remove(){
        coins--;
    }
    public boolean pull(){
        boolean check=false;
        int odds=r.nextInt(1,101);
        if (odds<=25) {
            check = true;
        }
        return check;
    }
}
