/**
 * Drawable Explorer Class
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */

public class DrawableExplorer extends Explorer implements Drawable
{
   public DrawableExplorer(Square location, Maze maze, String name)
   {
      super(location,maze,name);
   }

   public void draw()
   {
      pushMatrix();
      translate(location().x(),location().y());
      fill(50);
      rotate(1.1*PI/4);
      rect(15,-5,30,6); //Knife Main Rectangle
      rect(20,-7,6,10); // Crossbar
      fill(100,10,10); 
      triangle(45,1,45,-5,60,-2); // Sharp Triangle
      popMatrix();
   }
}