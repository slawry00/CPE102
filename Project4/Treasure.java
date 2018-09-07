/**
 * Treasure Class 
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */
import java.util.Scanner;
public class Treasure extends RandomOccupant
{
   private boolean found;

   public Treasure(Maze maze) 
   {
      super(maze);
      this.found = false;
      if (location() != null)
      {
         location().setTreasure(this);
      }
   }
   
   public Treasure(Maze maze, long seed)
   {
      super(maze, seed);
      this.found = false;
      if (location() != null)
      {
         location().setTreasure(this);
      }
   }

   public Treasure(Maze maze, Square location)
   {
      super(maze, location);
      this.found = false;
      if (location() != null)
      {
         location().setTreasure(this);
      }
   }

   public boolean found()
   {
      return found;
   }

   public void setFound()
   {
      this.found = true;
   }

   public void move()
   {
   }
   
   public void moveTo(Square newLoc)
   {
      if (location() != null)
      {
         location().setTreasure(null);
      }
      super.moveTo(newLoc);
      location().setTreasure(this);

   }

   public String toText(char d)
   {
      return super.toText(d)+d+found;
   }
   public void toObject(Scanner input)
   {
      super.toObject(input);
      this.found = input.nextBoolean();
   }
}
