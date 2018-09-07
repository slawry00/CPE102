/**
 * Drawable Monster Class
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */

public class DrawableMonster extends Monster implements Drawable
{
   public DrawableMonster(Maze maze)
   {
      super(maze);
   }
   public DrawableMonster(Maze maze, long seed)
   {
      super(maze, seed);
   }
   public DrawableMonster(Maze maze, Square location)
   {
      super(maze,location);
   }
   public void draw()
   {        
   }
}
