public class ValuesTester {
    public static void main(String[] args){
       Values names=new Values("Alexis");
       System.out.println(names.peak());
       names.push("James");
       names.push("David");
       names.push("Frank");
      /* System.out.println(names.pop());
       System.out.println(names.peak());
       System.out.println(names.size());
       System.out.println(names.search("James"));*/
       names.print();
       System.out.println(names.peak());
    }
}
