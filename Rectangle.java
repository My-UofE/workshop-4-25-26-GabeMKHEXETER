// A Rectangle class
public class Rectangle {
  
  // 4 instance attributes
  public double width; //changed :o
  public double height;
  public double originX = 0.0;
  public double originY = 0.0;

  // 1 static attributes
  public static final int NUMBER_OF_SIDES = 4;

  // main constructor
  public Rectangle(double width, double height, double originX, double originY) {
    this.width = width;
    this.height = height;
    this.originX = originX;
    this.originY = originY;
  }
  // second constructor: (meant to overload)
  public Rectangle(double width, double height) {
    this(width, height, 0, 0);}

  // third constructor: 
  public Rectangle() {
    width = 1;
    height = 1;
    originX = 0;
    originY = 0;
  }
  //GETTER METHOD
  public double getWidth(){
    return width;
  }

  //SETTER METHOD
  public void setWidth(double width){
    if (width > -1){
    this.width = width;}
  }

  // method: move the rectangle
  public void move(double dx, double dy) {
	   originX += dx;
	   originY += dy;
  }

  // method: compute the area of the rectangle
  public double getArea() {
    return width * height;
  }
  
  // method: compute the area of the rectangle
  public double getPerimeter() {
    return 2 * (width + height);
  }
  
  //method: scale height and width of rectangles 
  public void scale(double scaleW, double scaleH){
      height = height*scaleH;
      width = width*scaleW;
  }
  //method: check if 2 rectangles are overlapping
  /*public static boolean isOverlappedWith(Rectangle r){
    //width + x and height + y (if they produce a positive number?)
    //this command?
    if(((r.originX + r.width) - (this.originX - this.width) > 0)&&((r.originY + r.height) - (this.originY + this.height))){
      return True;  
    }
    else{
      return False;
    }
  } */

 //method: checks if a rectangle is really a square
  public boolean isSquare(){
    return (width == height);
  }
 //method: calculates the width to height ratio
   public double calcRatio(){
    return (width/height);
 }
 // Return a description of a rectangle in the form of
  // Rectangle[x=*,y=*,w=*,h=*]
  public String toString(){
  return "Rectangle[x="+originX+",y="+originY+",w="+width+",h="+height+"]";
  }
}
