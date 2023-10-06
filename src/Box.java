import java.util.Vector;
public class Box{
    String data;
    Box next,previous;

    public Box(){
        data=null;
        next=null;
        previous=null;
    }
    public Box(String s){
        data=s;
        next=null;
        previous=null;
    }
    public Box(String s, Box b){
        data=s;
        next=b;
    }
    public void setNext(String s){
        next=new Box(s);
    }
    public Box getNext(){
        return next;
    }
    public String getData(){
        return data;
    }
    }
