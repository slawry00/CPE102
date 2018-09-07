/**
 * Eagle TotemPole class
 *
 * @author Spencer Lawry
 * @version Lab 10
 * @version CPE102-01
 */

public class Eagle implements TotemPole
{
   private int eaglePower = 2;

   public Eagle()
   {
   }
   public int power()
   {
      return eaglePower;
   }
   public int height()
   {
      return 1;
   }
   public boolean chiefPole(int bearCount)
   {
      return bearCount >= 3;
   }
   public int bearCount()
   {
      return 0;
   }
}
