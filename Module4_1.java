import java.util.*;
 class Shape
{
 double area;
 double perimeter;
 void getArea()
 {
  System.out.println("The area is"+area);
 }
 void getPerimeter()
 {
  System.out.format("The perimeter is %.2f",perimeter);
  System.out.println();
 }
}
class circle extends Shape
{
  int radius;
 public circle(int radius)
  {
    this.radius=radius;
  }
  public void area()
  {
    area=Math.PI*radius*radius;
    super.getArea();
  }
  public void perimeter()
{
  perimeter=2*Math.PI*radius;
  super.getPerimeter();
}
}
class square extends Shape
{
  int side;
  public square(int side)
  {
    this.side=side;
  }
  public void area()
  {
    area=side*side;
    super.getArea();
  }
  public void perimeter()
{
  perimeter=4*side;
  super.getPerimeter();
}
}
public class Module4_1
{
public static void main(String args[])
{
  Scanner sc=new Scanner(System.in);
  System.out.println("Enter side of the square:");
  int n=sc.nextInt();
   System.out.println("Enter radius of the circle:");
  int r=sc.nextInt();
 System.out.println("CIRCLE");
  circle c=new circle(r);
  c.area();
  c.perimeter();
System.out.println("SQUARE");
  square s=new square(n);
  s.area();
  s.perimeter();
}
}
  
