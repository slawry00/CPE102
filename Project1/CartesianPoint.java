/**
 * CartesianPoint class
 *
 * @author Spencer Lawry
 * @version Project 1
 * @version CPE102-01
 */

public class CartesianPoint implements Point
{
   private double xCoord;
   private double yCoord;
   // Constructor

   public CartesianPoint(double xCoord, double yCoord) 
   {
      this.xCoord = xCoord;
      this.yCoord = yCoord;
   }

   // Methods
   public double xCoordinate() {return xCoord;}
   public double yCoordinate() {return yCoord;}

   public double radius() 
   {
      double radius = Math.sqrt(xCoord * xCoord + yCoord * yCoord); 
      return radius;
   }

   public double angle()
   {
      double angle = Math.abs(Math.atan(yCoord/xCoord));
      if (xCoord >= 0 & yCoord >= 0)
         {return angle;}
      else if (xCoord < 0 & yCoord >= 0)
         {return Math.PI - angle;}
      else if (xCoord < 0 & yCoord < 0)
         {return Math.PI + angle;}
      else 
         {return (Math.PI * 2) - angle;}
   }

   public double distanceFrom(Point other)    
   {
      double distanceX = xCoord - other.xCoordinate();
      double distanceY = yCoord - other.yCoordinate();
      double distance = Math.sqrt(distanceX * distanceX + distanceY * distanceY); 
      return distance;
   }
   public Point rotate90() 
   {
      Point newpt = new CartesianPoint(-yCoord, xCoord); 
      return newpt;
   } 
}
