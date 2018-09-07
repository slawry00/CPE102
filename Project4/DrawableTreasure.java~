/**
 * DrawableTreasure Class 
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */
   
public class DrawableTreasure extends Treasure implements Drawable
{

   public DrawableTreasure(Maze maze)
   {
      super(maze);
   }
   public DrawableTreasure(Maze maze, long seed)
   {
      super(maze,seed);
   }
   public DrawableTreasure(Maze maze, Square location)
   {
      super(maze,location);
   }

   public void draw()
   { 
     if (location().seen())
     {
       pushMatrix();
        if (!found())
        {
        pushMatrix();
        fill(230,200,20);
        translate(location().x(),location().y());
        ellipse(25,25,40,40); // face
        fill(20);
        strokeWeight(2);
        line(20,15,20,20); //eye 1
        line(30,15,30,20); // eye 2
        ellipse(25,33,14,10); // mouth
        strokeWeight(1);
        popMatrix();
        }
        popMatrix();
     }
   }
}