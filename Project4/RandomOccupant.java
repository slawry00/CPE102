/**
 * RandomOccupant Abstract Class
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */
import java.util.*;
public abstract class RandomOccupant extends Occupant
{
   private Random random;

   public RandomOccupant(Maze maze)
   {
      super(maze);
      this.random = new Random();
      this.moveTo(maze().getSquare(random.nextInt(maze.rows()), 
                                   random.nextInt(maze.cols())));
   }

   public RandomOccupant(Maze maze, long seed)
   {
      super(maze);
      this.random = new Random(seed);
      this.moveTo(maze().getSquare(random.nextInt(maze.rows()),
                                   random.nextInt(maze.cols())));
   }

   public RandomOccupant(Maze maze, Square location)
   {
      super(maze, location);
      this.random = new Random();
   }

   public void move()
   {
      int row = location().row();                                                                    
      int col = location().col();  
      int randInt = random.nextInt(Square.LEFT + 1);
      while (location().wall(randInt)) 
      {
         randInt = random.nextInt(Square.LEFT + 1);
      }
      if ((randInt == Square.UP) && row > 0)
      {
         row--;
      }
      if ((randInt == Square.DOWN) && row < maze().rows() - 1)
      {
         row++;
      }
      if ((randInt == Square.RIGHT) && col < maze().cols() - 1)
      {
         col++;
      }
      if ((randInt == Square.LEFT) && col > 0)
      {
         col--;
      }
      moveTo(maze().getSquare(row, col));
   }
}
