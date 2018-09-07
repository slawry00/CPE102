/**
 * Bear TotemPole class
 *
 * @author Spencer Lawry
 * @version Lab 10
 * @version CPE102-01
 */

public class Bear implements TotemPole
{
   private int bearCount = 1;
   private int bearPower = 5;
   private TotemPole rest;
   private int power;
   private int height;

   public Bear(TotemPole rest)
   {
      this.rest = rest;
      this.height = rest.height() + 1;
      this.power = rest.power() + bearPower;
      this.bearCount = this.bearCount + rest.bearCount();
   }
   public int power()
   {
      return this.power;
   }
   public int height()
   {
      return this.height; 
   }
   public boolean chiefPole(int bearCount)
   {
      if (rest.chiefPole(rest.bearCount()))
      {
         {return true;}
      }
      return bearCount >= 3;
   }
      // return rest.chiefPole(bearCount +1);
   public int bearCount()
   {
      return bearCount;
   }
}
