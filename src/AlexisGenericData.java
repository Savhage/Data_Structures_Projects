public class AlexisGenericData <E> {
    private E[] obj;
    private int initial=5, position=0, size = 0;

    public AlexisGenericData(){
        obj= (E[]) new Object[initial];
    }
    /*public E setObj(E n){
        if (position>=obj.length){
            //size=size*2;
            E[] newObj=(E[]) new Object[(obj.length*2)];
            for (int i=0;i<obj.length;i++){
                newObj[i]=obj[i];
            }
            newObj[position]=n;
            position++;
            obj= (E[]) new Object[newObj.length];
            for (int i=0;i<newOBj.length;i++){
                obj[i]=newObj[i];
            }
        }
        else{
            obj[position]=n;
            position++;
        }
        size++;

    }*/
}
