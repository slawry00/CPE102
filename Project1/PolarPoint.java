/**
 * PolarPoint class
 *
 * @author Spencer Lawry
 * @version Lab 01
 * @version CPE102-01
 */

public class PolarPoint implements Point
{
   private double radius;
   private double angle;

   // Constructor

   public PolarPoint(double radius, double angle) 
   {
      this.radius = radius;
      this.angle = angle;
   }

   // Methods

   public double xCoordinate() {return radius * Math.cos(angle);}
   public double yCoordinate() {return radius * Math.sin(angle);}
   public double radius() {return radius;} 
   public double angle() {return angle;}
   public double distanceFrom(Point other) 
   // going to use d = sqrt(r1^2 + r2^2 - 2r1 * r2 * cos(theta2 - theta1))
   {
      double distance = Math.sqrt(radius * radius + other.radius() *
                        other.radius() + -2 * radius * other.radius() *
                        Math.cos(other.angle() - angle));
      return distance;
   }

   public Point rotate90() 
   {
      double NewAngle = angle + ((Math.PI)/2);
      Point newpt = new PolarPoint(radius, NewAngle);
      return newpt;
   }
}
