import java.util.*;
/**
 * Class that contains all the logic to model a Maze with Treasures, Monsters, and an Explorer.
 *
 * @author Spencer Lawry
 * @version Project 3
 * @version CPE102-01
 * @version 2/21/17
 */
public class Maze
{
   // named constants
   public static final int ACTIVE = 0;
   public static final int EXPLORER_WIN = 1;
   public static final int MONSTER_WIN = 2;
    
    // instance variables
   private Square[][] squares;
   private ArrayList<RandomOccupant> randOccupants;
   private Explorer explorer;
   private int rows;
   private int cols;

   /**
    * Constructor for objects of class Maze
    */
   public Maze(Square[][] squares, int rows, int cols)
   {
      this.squares = squares;
      this.rows = rows;
      this.cols = cols;
      this.randOccupants = new ArrayList<RandomOccupant>();
   }
	
   // QUERIES
   public Square getSquare(int row, int col) {return squares[row][col];}
   //public Square[][] squares() {return squares;} I liked this but it makes
   // me fail your Test Driver Unfortunately
   public int rows() {return rows;}
   public int cols() {return cols;}
   public String explorerName() {return explorer.name();}
   public Explorer getExplorer() {return explorer;}
    
   public RandomOccupant getRandomOccupant(int index) 
   {
      return randOccupants.get(index);
   }
   public int getNumRandOccupants() 
   {
      return randOccupants.size();
   }
	
   // COMMANDS
   public void addRandomOccupant(RandomOccupant ro)   
   {
      randOccupants.add(ro);
   }
	
   public void setExplorer(Explorer e) {explorer = e;}
	
   public void explorerMove(int key)
   {
      explorer.move(key);
   }
	
   public void randMove()
   {
      for (RandomOccupant ro : randOccupants)
      {
         ro.move();
      }
   }
	
   /**
    * Returns the status of the game.
    *
    * If all treasures have been found, return EXPLORER_WIN.
    * If not, check each maze occupant, if it is a Monster and
    *    it is in the same location as the Explorer, return
    *    MONSTER_WIN.  Note that you can use == to check locations, do you know why?
    * Otherwise, return ACTIVE.
    */
   public int gameStatus()
   {
      if (foundAllTreasures())
      {
         return EXPLORER_WIN;  
      }
      else 
      {
         for (RandomOccupant ro : randOccupants)     
         {
            if (ro instanceof Monster)
            {
               if (ro.location() == explorer.location())
               {
                  return MONSTER_WIN;
               }
            }
         }
      }
      return ACTIVE;
   }
	
   private boolean foundAllTreasures()
   {
      for (RandomOccupant ro : randOccupants)     
      {
         if (ro instanceof Treasure)
         {
            if (!(((Treasure)ro).found()))
            {
               return false;
            }
         }
      }
      return true;
   }
    
   public void lookAround(Square s)
   {
      int row = s.row();
      int col = s.col();
        
      // Clear what was previously in view
      resetInView();
        
      // Set the current square so that we are viewing it (obviously)
      s.setInView(true);
      if (!squares[row][col].wall(Square.UP)) //ADJACENT SQUARES
      {
         if (row-1 >= 0)
            {squares[row-1][col].setInView(true);}
      }       
      if (!squares[row][col].wall(Square.DOWN))
      {
         if (row+1 <= rows -1)
            {squares[row+1][col].setInView(true);}
      }       
      if (!squares[row][col].wall(Square.RIGHT))
      {
         if (col+1 <= cols - 1)
            {squares[row][col+1].setInView(true);}
      }       
      if (!squares[row][col].wall(Square.LEFT))
      {
         if (col-1 >= 0)
            {squares[row][col-1].setInView(true);}
      }       

     if ((row+1 <= rows - 1) && (col-1 >= 0)) 
      {
         if (!squares[row][col].wall(Square.LEFT) &&
             !squares[row][col-1].wall(Square.DOWN)) 
         { 
            squares[row+1][col-1].setInView(true);
         }
         if (!squares[row][col].wall(Square.DOWN) &&
             !squares[row+1][col].wall(Square.LEFT)) 
         {
               squares[row+1][col-1].setInView(true); 
         }
      }
     if ((row-1 >= 0) && (col-1 >= 0)) 
      {
         if (!squares[row][col].wall(Square.LEFT) &&
             !squares[row][col-1].wall(Square.UP)) 
         { 
            squares[row-1][col-1].setInView(true);
         }
         if (!squares[row][col].wall(Square.UP) &&
             !squares[row-1][col].wall(Square.LEFT)) 
         {
               squares[row-1][col-1].setInView(true); 
         }
      }
     if ((row-1 >= 0) && (col+1 <= cols - 1)) 
      {
         if (!squares[row][col].wall(Square.RIGHT) &&
             !squares[row][col+1].wall(Square.UP)) 
         { 
            squares[row-1][col+1].setInView(true);
         }
         if (!squares[row][col].wall(Square.UP) &&
             !squares[row-1][col].wall(Square.RIGHT)) 
         {
               squares[row-1][col+1].setInView(true); 
         }
      }
     if ((row+1 <= rows - 1) && (col+1 <= cols - 1)) 
      {
         if (!squares[row][col].wall(Square.RIGHT) &&
             !squares[row][col+1].wall(Square.DOWN)) 
         { 
            squares[row+1][col+1].setInView(true);
         }
         if (!squares[row][col].wall(Square.DOWN) &&
             !squares[row+1][col].wall(Square.RIGHT)) 
         {
               squares[row+1][col+1].setInView(true); 
         }
      }
   }
    
   private void resetInView()
   {
      for (int i = 0; i<rows; i++) {
         for (int j = 0; j<cols; j++) {
            squares[i][j].setInView(false);
         }
      }
   }
}
