/**
 * Treasure Class 
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */

public class Treasure extends RandomOccupant
{
   private boolean found;

   public Treasure(Maze maze) 
   {
      super(maze);
      this.found = false;
      location().setTreasure(this);
   }
   
   public Treasure(Maze maze, long seed)
   {
      super(maze, seed);
      this.found = false;
      location().setTreasure(this);
   }

   public Treasure(Maze maze, Square location)
   {
      super(maze, location);
      this.found = false;
      location().setTreasure(this);
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
}