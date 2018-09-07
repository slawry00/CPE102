/**
 * Descending Comparator class
 *
 * @author Spencer Lawry
 * @version Lab 08
 * @version CPE102-01
 */
import java.util.*;
public class Descending implements Comparator<Integer>
{
   public int compare(Integer a, Integer b)
   {
      return b-a;
   }
}      
