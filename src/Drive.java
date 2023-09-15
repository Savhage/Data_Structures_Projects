public class Drive {
    public static void main(String[] args){
        Car mazda=new Car("Mazda","Miata", 35, 45);
        System.out.println("You are at: "+ mazda.getLocation());
        mazda.drive(15,99);
        System.out.println("You are at: "+mazda.getLocation());
        mazda.drive(12,15);
        System.out.println("You are at: "+mazda.getLocation());
        mazda.drive(99,12);
        System.out.println("You are at: "+mazda.getLocation());
    }
}
