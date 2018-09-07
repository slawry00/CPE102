/**
 * Drawable Monster Class
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */

public class DrawableMonster extends Monster implements Drawable
{
   public DrawableMonster(Maze maze)
   {
      super(maze);
   }
   public DrawableMonster(Maze maze, long seed)
   {
      super(maze, seed);
   }
   public DrawableMonster(Maze maze, Square location)
   {
      super(maze,location);
   }
   public void draw()
   {   
      if (location().inView())
      {
        pushMatrix();
        translate(location().x()+25,location().y()+25);
        
        // HEAD
        fill(200,10,10);
        ellipse(0, 0, 35, 35);
        
        // SUNGLASSES
        fill(0);
        triangle(-15,-10,-3,-10,-9,-4); //left shade
        triangle(15,-10,3,-10,9,-4); //right shade
        stroke(0);
        strokeWeight(1.5);
        line(-10,-8,10,-8); //middle sunglass line
        line(10,-5,16,-12); // slanted sunglass lines
        line(-10,-5,-16,-12);
         
        // HAT
        fill(50);
        rect(-22,-19,45,6); //bottom of hat
        rect(-15,-25,30,6); //top of hat
         
         
        //MOUTH
        fill(100);
        ellipse(0,6,15,8);
         
        // CIGARETTE
        fill(200);
        rotate(8.2*PI/4);
        rect(0,7,18,3);
        popMatrix();
      }
       
   }
}