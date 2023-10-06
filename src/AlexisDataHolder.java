/*public class AlexisDataHolder implements DataTraverser {
    String[] names;
    int a=3,position =0, size ;
    public AlexisDataHolder(){
        names=new String[a];
        size=0;
    }
    public String getNames(int p){
        int r=p-1;
        return names[r];
    }
    public void addName(String n){
        if (position>=names.length){
            //size=size*2;
            String[] newNames=new String[((names).length*2)];
            for (int i=0;i<names.length;i++){
                newNames[i]=names[i];
            }
            newNames[position]=n;
            position++;
            names=new String[newNames.length];
            for (int i=0;i<newNames.length;i++){
                names[i]=newNames[i];
            }
        }
        else{
            names[position]=n;
            position++;
        }
        size++;
    }
    public void addName(String n, int p){
        for (int i=0;i<p;i++){
            names[names.length-(i+1)]=names[names.length-(i+2)];
        }
        names[p-1]=n;
        size++;
    }
    public void removeName(int p){
        int k=p-1;
        for (int i=k;i<names.length;i++){
            names[i]=names[i+1];
        }
        names[names.length-1]="";
    }
    public void removeName(String n){
        for (int i=0;i<names.length;i++){
            if (names[i]==n){
                for (int j=i;j<names.length-1;j++) {
                    names[j] = names[names.length + 1];
                }
                names[names.length-1]="";
                size--;
            }
        }
    }
    public void removeLast(){
        names[size-1]="";
        size--;
    }
    public int getSize(){
        return size;
    }
    public void clear(){
        for (int i=0;i<names.length;i++){
            names[i]="";
        }
        size=0;
    }
    public String[] clone(){
        String[] clonedNames= new String[names.length];
        for (int i=0;i<names.length;i++){
            names[i]=clonedNames[i];
        }
        return clonedNames;
    }
    public Boolean contains(String n){
        Boolean check=false;
        for (int i=0;i<names.length;i++){
            if (names[i]==n){
                check=true;
                break;
            }
        }
        return check;
    }
    public Boolean isEmpty(){
        Boolean check=true;
        if (size!=0){
            check=false;
        }
        return check;
    }
    public String next(int i){
        return names[i];
    }public Boolean hasNext(int i){
        Boolean check=false;
        if (i<size){
            check=true;
        }
        return check;
    }

}*/
