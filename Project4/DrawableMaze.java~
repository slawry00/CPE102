/**
 * DrawableMaze Class 
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */

public class DrawableMaze extends Maze implements Drawable
{
   public DrawableMaze(DrawableSquare[][] maze, int rows, int cols)
   {
      super(maze,rows,cols);
   }

   public void draw()
   {
     size(500,500);
     background(20);
     for (int i = 0; i<rows(); i++)
     {
       for (int j = 0; j<cols(); j++)
       {
         Square sqr = getSquare(i,j);
         ((Drawable)sqr).draw();
       }
     }
     for (int i = 0; i<getNumRandOccupants();i++)
     {
       RandomOccupant ro = getRandomOccupant(i);
         ((Drawable)ro).draw();
     }
     
     Explorer exp = getExplorer();
     ((Drawable)exp).draw();
   }
}