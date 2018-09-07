/**
 * Snake TotemPole class
 *
 * @author Spencer Lawry
 * @version Lab 10
 * @version CPE102-01
 */

public class Snake implements TotemPole
{
   private int bearCount;
   private int snakePower = 3;
   private TotemPole rest;
   private int height;
   private int power;

   public Snake(TotemPole rest)
   {
      this.rest = rest;
      this.height = rest.height() + 1;
      this.power = rest.power() + snakePower;

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
   public int bearCount()
   {
      return bearCount;
   }
}
