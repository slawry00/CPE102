/**
 * DrawableTreasure Class 
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */
   
public class DrawableTreasure extends Treasure implements Drawable
{

   public DrawableTreasure(Maze maze)
   {
      super(maze);
   }
   public DrawableTreasure(Maze maze, long seed)
   {
      super(maze,seed);
   }
   public DrawableTreasure(Maze maze, Square location)
   {
      super(maze,location);
   }

   public void draw()
   { 
   }
}
