public class Car {
    private String make, model;
    private GPS location=new GPS();
    public Car(){
    }
    public Car(String ma, String mo, double x, double y){
        make=ma;
        model=mo;
        location.increaseX(x);
        location.increaseY(y);
    }
    public void setMake(String m){
        make=m;
    }
    public void setModel(String m){
        model=m;
    }
    public void drive(double x,double y){
        location.increaseX(x);
        location.increaseY(y);
    }
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getLocation(){
        String j=   "X Coordinate: "+ location.getX()+
                    "\nY Coordinate: "+ location.getY();
        return j;
    }

}
