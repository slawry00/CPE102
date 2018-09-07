import java.awt.*;
public class Tester
{
   public static void main(String[] args)
   {
   //Point point1 = new Point(1,2);
   //Point point4 = new Point(1,2);
   //Circle testCirc1 = new Circle(5.0, point1, Color.red, true);
   //Circle testCirc2 = new Circle(5.0, point4, Color.red, true);
   //Circle testCirc3 = new Circle(5.0, point1, Color.red, false);

   //System.out.println(Color.red.equals(Color.red));
   //System.out.println(testCirc1.equals(testCirc2));
   //System.out.println(testCirc2.equals(testCirc3));

   //Rectangle testRect1 = new Rectangle(5.0, 3.0, point1, Color.red, true);
   //Rectangle testRect2 = new Rectangle(5.0, 3.0, point1, Color.red, true);
   //Rectangle testRect3 = new Rectangle(5.0, 3.0, point1, Color.red, false);

   //System.out.println(testRect1.equals(testRect2));
   //System.out.println(testRect2.equals(testRect3));
   //Point point2 = new Point(0,0);
   //Point point3 = new Point(1,0);
   
   //Triangle testTri1 = new Triangle(point1, point2, point3, Color.red, true);
   //Triangle testTri2 = new Triangle(point1, point2, point3, Color.red, true);
   //Triangle testTri3 = new Triangle(point1, point2, point3, Color.red, false);
   
   //System.out.println(testTri1.getArea());
   //System.out.println(testTri1.equals(testTri2));
   //System.out.println(testTri2.equals(testTri3));
   //System.out.println(testTri1.getClass().equals(Triangle.class));

      Triangle tri;
      Point a = new Point(4, 0);
      Point b = new Point(-2, -1);
      Point c = new Point(1, 4);
      
      tri = new Triangle(a, b, c, Color.cyan, false);
      System.out.println(tri.getArea());
   }
}
