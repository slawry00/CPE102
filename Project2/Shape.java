/**
 * Shape Interface
 *
 * @author Spencer Lawry
 * @version Project 2
 * @version CPE102-01
 */
import java.awt.*;
public interface Shape
{
   double getArea();
   Color getColor();
   void setColor(Color color);
   boolean getFilled();
   void setFilled(boolean filled);
   void move(Point point);
}
