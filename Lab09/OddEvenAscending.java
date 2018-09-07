/**
 * Odd/Even Ascending Comparator class
 *
 * @author Spencer Lawry
 * @version Lab 08
 * @version CPE102-01
 */
import java.util.*;
public class OddEvenAscending implements Comparator<Integer>
{
   public int compare(Integer a, Integer b)
   {
      if (a%2 == b%2)
      {
         return a-b;
      }
      if (a%2 == 1)
      {
         return -1;
      }
      return 1;
   }
}
