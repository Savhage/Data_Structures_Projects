public class GPS{
    double x,y;
    public GPS(){
        super();
    }
    public GPS(double sx, double sy){
        x=sx;
        y=sy;
    }
    public void increaseX(double ix){
        x+=ix;
    }
    public void increaseY(double iy){
        y+=iy;
    }
    public double getX(){
        return x;
    }
    public double getY(){
        return y;
    }
    public String toString(){
        String location= "X Coordinate: " + x+
                        "\nY Coordinate: " +y;
        return location;
    }
}
