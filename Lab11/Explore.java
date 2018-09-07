/**
 * Explore Main LinkedList Tester 
 *
 * @author Spencer Lawry
 * @version Lab 11
 * @version CPE102-01
 */
import java.util.*;
public class Explore 
{
   public static void main(String[] args)
   {
      // LinkedLists and Iterators

      String[] myStrings = {"cat","dog","Tom","Bob","Joe"};
      Integer[] myInts = {1,3,5,7,9,11,13};
      LinkedList<String> strList = new LinkedList<String>();
      LinkedList<Integer> intList = new LinkedList<Integer>();

      for (String str : myStrings)
      {
        strList.add(str);
      }
      for (Integer i : myInts)
      {
         intList.add(i);
      }

      Iterator<String> strIter = strList.iterator();

      while (strIter.hasNext())
      {
         System.out.println(strIter.next());
      }
      for (Integer i : intList)
      {
         System.out.println(i);
      }
   
   }









}
