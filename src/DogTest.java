public class DogTest {
    public static void main(String[] args) {
        Dog d = new Dog("German Breed", 5);
        System.out.println("Current Age: " + d.getAge());
        d.setAge(6);
        System.out.println(d);
    }

}
