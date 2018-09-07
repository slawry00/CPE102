/**
 * Drawable Square Class
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */

public class DrawableSquare extends Square implements Drawable
{
   public DrawableSquare(boolean up, boolean right, boolean down, boolean left,
                         int row, int col)
   {
      super(up,right,down,left,row,col);
   }

   public void draw()
   {
      if (seen())
      {
        fill(80);
        
        if (inView())
        {
          fill(150);
        }
        
        rect(x(),y(),SQUARE_SIZE,SQUARE_SIZE);
        fill(200,20,20);
        if (wall(UP))
        {
           rect(x(),y()-2.5,SQUARE_SIZE,SQUARE_SIZE/10);
        }
        if (wall(DOWN))
        {
           rect(x(),y()+SQUARE_SIZE-2.5,SQUARE_SIZE,SQUARE_SIZE/10);
        }
        if (wall(LEFT))
        {
           rect(x()-2.5,y(), SQUARE_SIZE/10, SQUARE_SIZE);
        }
        if (wall(RIGHT))
        {
           rect(x()+SQUARE_SIZE-2.5, y(), SQUARE_SIZE/10, SQUARE_SIZE);
        }
      }
      else
      {
        fill(0);
        rect(x(),y(),SQUARE_SIZE,SQUARE_SIZE);
      }
   }
}