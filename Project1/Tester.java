
public class Tester
{

   public static void main(String[] args)
   {
   Point pt = new CartesianPoint(0.0, 0.0);
   double radius = pt.radius();
   System.out.println(radius); 

   Point pt0 = new CartesianPoint(1.0, 0.0);
   System.out.println(pt0.angle());

   Point pt1 = new CartesianPoint(1.0, 2.0);
   System.out.println(pt1.angle());

   Point pt2 = new CartesianPoint(0.0, 2.0);
   System.out.println(pt2.angle());

   Point pt3 = new CartesianPoint(-1.0, 2.0);
   System.out.println(pt3.angle());

   Point pt4 = new CartesianPoint(-1.0, 0.0);
   System.out.println(pt4.angle());

   Point pt5 = new CartesianPoint(-1.0, -2.0);
   System.out.println(pt5.angle());

   Point pt6 = new CartesianPoint(0.0, -2.0);
   System.out.println(pt6.angle());

   Point pt7 = new CartesianPoint(1.0, -2.0);
   System.out.println(pt7.angle());

   Point pt8 = new CartesianPoint(1.0, 1.0);
   Point pt9 = new CartesianPoint(2.0, 2.0);
   System.out.println(pt8.distanceFrom(pt9));

   Point rot8 = pt8.rotate90();
   System.out.println(rot8.angle());

   }
}
