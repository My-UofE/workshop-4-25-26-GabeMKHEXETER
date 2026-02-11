public class CircleApp{
    public static void main(String[] args){
    System.out.println("Creating Circle");
    Circle circle1 = new Circle(25.0, 3.0, 5.0);
    Circle circle2 = new Circle(81.0); //to test other constructors
    Circle circle3 = new Circle();
    System.out.println("Radius of Circle1: "+circle1.getRadius()); //I'm doing it!! :D
    circle1.move(10.0,8.0);
    System.out.println("New Position of Circle1: "+circle1.getX() + "," + circle1.getY());
    circle2.scale(5);
    System.out.println("New Radius of Circle2: "+circle2.getRadius());
    System.out.println("Circle3: " + circle3.toString());
    }
}