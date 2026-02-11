public class Circle{
    //instance attributes:
    private double radius;
    private double originX;
    private double originY;

    //constructor 1: 3 arguments
    public Circle(double radius, double originX, double originY){
        this.radius = radius;
        this.originX = originX;
        this.originY = originY;
    }

    //constructor 2: 1 argument
    public Circle(double radius){
        this.originX = 0;
        this.originY = 0; 
    }

    //constructor 3: 0 arguments
    public Circle(){
        this.radius = 1;
        this.originX = 0;
        this.originY = 0; 
    }

    //methods:
      //GETTER METHOD (x)
    public double getX(){
        return originX;}

    //SETTER METHOD (x)
    public void setX(double originX){
        this.originX = originX;}

    //GETTER METHOD (y)
    public double getY(){
        return originY;}

    //SETTER METHOD (y)
    public void setY(double originY){
        this.originY = originY;}

    //GETTER METHOD (radius)
    public double getRadius(){
        return radius;}

    //SETTER METHOD (radius)
    public void setRadius(double radius){
        if (radius > -1){ //unsure if this is right but..hey ho
        this.radius = radius;}}

    public double getArea(double radius){ //pi*r^2
        return (Math.PI * Math.pow(radius,2));
    }
    public double getCircumference(double radius){
        return (Math.PI * radius * 2);
    }
    public void move(double x, double y){
        originX += x;
        originY += y;
    }
    //scale
      public void scale(double scaleR){
      radius = radius*scaleR;
      }
    //toString 
        public String toString(){
         return "Circle[x="+originX+",y="+originY+",radius="+radius+"]";
    }
}