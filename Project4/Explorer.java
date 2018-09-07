/**
 * Explorer Class
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */
import java.awt.event.KeyEvent;
import java.util.Scanner;
public class Explorer extends Occupant
{
   private String name;
   
   public Explorer(Maze maze)
   {
      super(maze);
   }

   public Explorer(Square location, Maze maze, String name) 
   {
      super(maze, location);
      this.name = name;
      maze.lookAround(location);
   }

   public String name()
   {
      return name;
   }

   public void move(int key)
   {
      int row = location().row();
      int col = location().col();
      
      
      if ((key == KeyEvent.VK_UP)         || 
         (key == KeyEvent.VK_KP_UP))     
      {
         if (row > 0) 
         { 
            row--;
            if (!(location().wall(Square.UP)))
            {  
               moveTo(maze().getSquare(row, col));
            }
         }
      }

      else if ((key == KeyEvent.VK_DOWN)  ||
              (key == KeyEvent.VK_KP_DOWN)) 
      {
         if (row < maze().rows() - 1)
         { 
            row++;
            if (!(location().wall(Square.DOWN)))
            {  
               moveTo(maze().getSquare(row, col));
            }
         }
      }

      else if ((key == KeyEvent.VK_RIGHT) ||
         (key == KeyEvent.VK_KP_RIGHT)) 
      {
         if (col < maze().cols() - 1)
         { 
            col++;
            if (!(location().wall(Square.RIGHT)))
            {  
               moveTo(maze().getSquare(row, col));
            }
         }
      }

      else if ((key == KeyEvent.VK_LEFT)  ||
         (key == KeyEvent.VK_KP_LEFT))  
      {
         if (col > 0) 
         { 
            col--;
            if (!(location().wall(Square.LEFT)))
            {  
               moveTo(maze().getSquare(row, col));
            }
         }
      }
         
      
      
   }

   public void moveTo(Square s)
   {
      super.moveTo(s);
      s.enter();
      this.maze().lookAround(s);
   }
   public String toText(char d)
   {
      return super.toText(d)+d+name;
   }
   public void toObject(Scanner input)
   {
      super.toObject(input);
      this.name = input.next();
   }

}
      
