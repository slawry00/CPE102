/**
 * Negative Radius Exception class
 *
 * @author Spencer Lawry
 * @version Lab 08
 * @version CPE102-01
 */

public class NegativeRadiusException extends CircleException
{
   private double radius;

   public NegativeRadiusException(double radius)
   {
      super("negative radius");
      this.radius = radius;
   }

   public double getRadius()
   {
      return radius;
   }
}
