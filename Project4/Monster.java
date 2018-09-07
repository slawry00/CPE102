/**
 * Monster Class 
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */

public class Monster extends RandomOccupant
{
   public Monster(Maze maze)
   {
      super(maze);
   }
   public Monster(Maze maze, long seed)
   {
      super(maze, seed);
   }
   public Monster(Maze maze, Square location)
   {
      super(maze,location);
   }
}
