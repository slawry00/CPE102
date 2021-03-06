/**
 * Square Class
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */
import java.util.Scanner;
public class Square implements DelimitedTextIO
{
   public static final int SQUARE_SIZE = 50; //num of pixels per square
   public static final int UP = 0;
   public static final int RIGHT = 1; 
   public static final int DOWN = 2;
   public static final int LEFT = 3; 

   private boolean[] walls = {false,false,false,false};
   private boolean seen;
   private boolean inView;
   private int row;
   private int col;
   private Treasure treasure;

   public Square(int row, int col)
   {
      this.row = row;
      this.col = col;
   }

   public Square(boolean up, boolean right, boolean down, boolean left,
                 int row, int col)
   {
      walls[UP] = up;
      walls[RIGHT] = right;
      walls[DOWN] = down;
      walls[LEFT] = left;
      this.row = row;
      this.col = col;
   }

   public boolean wall(int direction)
   {
      return walls[direction];
   }

   public boolean seen()
   {
      return seen;
   }

   public boolean inView()
   {
      return inView;
   }

   public int row()
   {
      return row;
   }

   public int col()
   {
      return col;
   }

   public Treasure treasure()
   {
      return treasure;
   }

   public int x()
   {
      return SQUARE_SIZE * col;
   }

   public int y()
   {
      return SQUARE_SIZE * row;
   }
   
   public void setInView(boolean inView)
   {
      this.inView = inView;
      if (seen == false && inView == true) 
      {
         seen = true;
      }
   }

   public void setTreasure(Treasure t)
   {
      treasure = t;
   }
 
   public void enter()
   {
      if (!(treasure == null)) 
      {
         treasure.setFound();
      }
   }
   public String toText(char d)
   {
      return this.getClass().getName()+d+row+d+col+d+walls[UP]+d+walls[RIGHT]+
             d+walls[DOWN]+d+walls[LEFT]+d+seen+d+inView;
   }
   public void toObject(Scanner input)
   {
      input.useDelimiter(",");

      this.walls[UP] = input.nextBoolean();
      this.walls[RIGHT] = input.nextBoolean();
      this.walls[DOWN] = input.nextBoolean();
      this.walls[LEFT] = input.nextBoolean();
      this.seen = input.nextBoolean(); 
      this.inView = input.nextBoolean(); 
   }
}
