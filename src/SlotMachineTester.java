public class SlotMachineTester {
    public static void main(String[] args){
        int counter=0;
        SlotMachine slot=new SlotMachine(100);
        while (slot.hasNext()){
            slot.next();
            counter++;
        }
        System.out.println("Your game lasted "+counter+" handle pulls!");
    }
}
