/**
 * Circle Tester class
 *
 * @author Spencer Lawry
 * @version Lab 08
 * @version CPE102-01
 */

public class CircleTest
{
   public static void main(String[] args)
   {
      try
      {
         Circle c1 = new Circle(1);
         System.out.println(c1);
         //Circle c2 = new Circle(0);
         //System.out.println(c2);
         Circle c3 = new Circle(-1);
         System.out.println(c3);
      }
      catch (NegativeRadiusException e)
      {
         System.out.println(e.getMessage() + ": " + e.getRadius());
      }
      catch (ZeroRadiusException e)
      {
         System.out.println(e.getMessage());
      }
      //catch (CircleException e) 
      //{
      //   System.out.println(e.getMessage());
      //}
   }
}
