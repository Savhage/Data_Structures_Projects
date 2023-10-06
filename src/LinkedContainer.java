import java.util.Vector;
public class LinkedContainer extends Box{
    private Box head;
    private int size=0;

    public LinkedContainer(){
    }
    public LinkedContainer(String d) {
       head= new Box(d) ;
       size++;
    }
    public void getElements() {
        Box value = head.getNext();
        for (int i =0; i < size; i++) {
            System.out.println(value.getData());
            value=value.getNext();
        }
    }
        public void addElement (String n){
            Box check = head;
            if (check == null) {
                head = new Box(n);
            } else {
                while (check.getNext() != null) {
                    check = check.getNext();
                }
                check.setNext(n);

            }
            size++;
        }
        public void removeAt(int num){
        Box place=new Box();
        place=head.next;
        for (int i=0;i<num-1;i++){
            place=place.next;
        }
        place=place.next.next;
        }
    }

