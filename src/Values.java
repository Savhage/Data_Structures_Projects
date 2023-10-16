public class Values<E> {
    private E[] list;
    int size;
        public Values(){
        }
        public Values(E s){
            list=(E[]) new Object[10];
            list[0]=s;
            size++;
        }
        public void push(E s){
            list[size]=s;
            size++;
        }
        public E pop(){
            E holder=list[size-1];
            list[size-1]=null;
            size--;
            return holder;
        }
        public E peak(){
            return list[size-1];
        }
        public void empty(){
            for (int i=0;i<size;i++){
                list[i]=null;
            }
            size=0;
        }
        public boolean isEmpty(){
            boolean check =false;
            if (size==0){
                check=true;
            }
            return check;
        }
        public int size(){
            return size;
        }
        public int search(String s){
            int index=-1;
            for (int i=0;i<size;i++){
                if (list[i]==s){
                    index=i;
                    break;
                }
            }
            return index;
        }
        public void print() {
            int tracker=size;
            int i=0;
            E[] list2= (E[])new Object[10];
            while (isEmpty()==false) {
                System.out.println("test"+peak());
                list2[size-1]=pop();
                i++;

            }
            list=list2;
            size=tracker;
        }
}
