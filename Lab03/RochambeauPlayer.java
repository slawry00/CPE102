/**
 * Rochambeau Player class
 *
 * @author Spencer Lawry
 * @version Lab 03
 * @version CPE102-01
 */
import java.util.Random;
public class RochambeauPlayer
{
   private String name;   
   private int wins;
   private String lastThrow;

   public RochambeauPlayer(String name)
   {
      this.name = name;
   }
   
   public String getName()
   {
      return name;
   }

   public int getWins()
   {
      return wins;
   }

   public String lastThrow()
   {
      return lastThrow;
   }

   public String toString()
   {
      if (wins == 1)
      {
         return name + " has 1 win";   
      }
      else 
      {
         return name + " has " + wins + " wins";
      }
   }

   public void incrementWins()
   {
      wins++;
   }
  
   public int makeThrow()
   {
      Random randomThrow = new Random();
      int currentThrow = randomThrow.nextInt(3);
      if (currentThrow == Rochambeau.ROCK)
         {
            lastThrow = "Rock";
         }
      if (currentThrow == Rochambeau.PAPER)
         {
            lastThrow = "Paper";
         }
      if (currentThrow == Rochambeau.SCISSORS)
         {
            lastThrow = "Scissors";
         }
      return currentThrow;
   }
   public int makeThrow(int throwType)
   {
      int currentThrow = throwType;
      if (currentThrow == Rochambeau.ROCK)
         {
            lastThrow = "Rock";
         }
      if (currentThrow == Rochambeau.PAPER)
         {
            lastThrow = "Paper";
         }
      if (currentThrow == Rochambeau.SCISSORS)
         {
            lastThrow = "Scissors";
         }
      return currentThrow;
   }
}
      








 
