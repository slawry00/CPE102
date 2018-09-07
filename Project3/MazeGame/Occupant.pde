/**
 * Occupant Abstact Class
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */
public abstract class Occupant
{
   private Square square;
   private Maze maze;

   public Occupant(Maze maze)
   {
      this.maze = maze;
   }

   public Occupant(Maze maze, Square start)
   {
      this.maze = maze;
      this.square = start;
   }

   public Square location()
   {
      return square;
   }

   public Maze maze()
   {
      return maze; 
   }
 
   public void moveTo(Square newLoc)
   {
      square = newLoc;
   }
}