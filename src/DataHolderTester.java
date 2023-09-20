public class DataHolderTester {
    public static void main(String[] args){
        AlexisDataHolder holder=new AlexisDataHolder();
        holder.addName("Alexis");
        holder.addName("Jesse");
        holder.addName("Carlos");
        holder.addName("Tyson");
        holder.addName("Mike");
        System.out.println(holder.getNames(5));

    }
}
