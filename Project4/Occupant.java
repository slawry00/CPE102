/**
 * Occupant Abstact Class
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */
import java.util.Scanner;
public abstract class Occupant implements DelimitedTextIO
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
   public String toText(char delimiter)
   {
      char d = delimiter;
      return this.getClass().getName()+d+square.row()+d+square.col();
   }

   public void toObject(Scanner input)
   {
      input.useDelimiter(",");
      int row = input.nextInt();
      int col = input.nextInt();
      moveTo(maze.getSquare(row,col));
      
   }
}
