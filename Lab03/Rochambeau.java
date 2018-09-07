/**
 * Rochambeau class
 *
 * @author Spencer Lawry
 * @version Lab 03
 * @version CPE102-01
 */

public class Rochambeau
{
   public static final int ROCK  = 0; 
   public static final int PAPER = 1; 
   public static final int SCISSORS = 2; 

   public Rochambeau() {}

   public static int getWinner(int throw1, int throw2)
   {
      if ((throw1 == 0 || throw1 == 1 || throw1 == 2) && 
          (throw2 == 0 || throw2 == 1 || throw2 == 2))
      {
         if (throw1 == throw2)
         {
            {return 0;}
         }
         else if (throw1 == 0 && throw2 == 2 || throw1 == 1 && throw2 == 0 || 
            throw1 == 2 && throw2 == 1)
         {
            {return 1;}
         }
         else 
         {
            {return -1;}
         }  
      }
      else {return 0;}
   }
}
