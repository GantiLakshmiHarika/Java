package Constructors;
import java.util.*;
public class Circle {

    // instance variable

    String Circlecolor;
    int CircleRadius;
// parameterzied constructor
public Circle(String color,int CircleRadius)
{
    this.Circlecolor=color;
    this. CircleRadius=CircleRadius;
}
public void displayinfo()
{
    System.out.println("CircleRadius : " +CircleRadius);
    System.out.println("Circlecolor :" + Circlecolor);
    double area = Math.PI*CircleRadius*CircleRadius;
    System.out.println("area of circle :" +area);


}
public static void main(String[] args) {
    Scanner sc =new Scanner(System.in);
    System.out.println("enter the Circleradius :");
    int Circleradius = sc.nextInt();
    sc.nextLine();
    System.out.println("enter the color :");
    String color=sc.nextLine();
     
    // object creation
    Circle c1 =new Circle(color,Circleradius);
    c1.displayinfo();
    sc.close();
}
} 