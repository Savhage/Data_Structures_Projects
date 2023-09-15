public class Dog {
    private String breed;
    private int age;

    public Dog(){
    }
    public Dog(String b, int a){
        breed=b;
        age=a;
    }
    public void setAge(int a){
        age=a;
    }
    public void setBreed(String b){
        breed=b;
    }
    public int getAge(){
        return age;
    }
    public String getBreed(){
        return breed;
    }
    public String toString() {
        String s =     "Age: " + age+
                       "\nBreed: " + breed;
        return s;

    }
}
