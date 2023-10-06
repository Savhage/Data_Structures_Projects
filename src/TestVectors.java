import java.util.Vector;
public class TestVectors {
    public static void main(String[] args){
        Vector<String> vTest= new Vector<>();

        vTest.add("Hello");
        vTest.add("Hello World");

        vTest.remove(0);

        //It looks at each element
        //You cannot change values
        //It uses an interator design pattern
        for (String singleElement : vTest){
            System.out.println(singleElement);
        }
    }
}
