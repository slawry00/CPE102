/**
 * IntegerList class
 *
 * @author Spencer Lawry
 * @version Lab 09
 * @version CPE102-01
 */
import java.util.*;
public class IntegerList 
{
   ArrayList<Integer> intList = new ArrayList<Integer>();
   Random rand = new Random();
   
   public IntegerList(int numInts, int maxRand)
   {
      for (int i = 0; i < numInts; i++)
      {
         intList.add(rand.nextInt(maxRand)); 
      }
   }
   
   public void sort()
   {
      Collections.sort(intList);
   }

   public void sort(Comparator<Integer> comp)
   {
      Collections.sort(intList, comp);
   }

   public boolean isSorted()
   {
      ArrayList<Integer> otherList = new ArrayList<Integer>(intList);
      Collections.sort(otherList);
      return intList.equals(otherList); 
   }
   public boolean isSorted(Comparator<Integer> comp)
   {
      ArrayList<Integer> otherList = new ArrayList<Integer>(intList);
      Collections.sort(otherList, comp);
      return intList.equals(otherList); 
   }
   public String toString()
   {
      String fullString = "";
      for (int i : intList)
      {
         fullString = fullString + i + "\n";
      }
      return fullString;
   }
   public void mySLOsort()
   {
      for (int i = 0; i < intList.size(); i++)
      {
         int pos = i;
         int curInt = intList.get(i);
         while (pos > 0 && intList.get(pos-1) > curInt)
         {
            intList.set(pos,intList.get(pos-1));
            pos--;
         }

         intList.set(pos,curInt);
      }
   }
         
   
   public void mySLOsort(Comparator<Integer> comp)
   {
      for (int i = 0; i < intList.size(); i++)
      {
         int pos = i;
         int curInt = intList.get(i);
         while (pos > 0 && comp.compare(intList.get(pos-1), curInt) > 0)
         {
            intList.set(pos,intList.get(pos-1));
            pos--;
         }

         intList.set(pos,curInt);
      }
   }   
   public int binarySearch(int key)
   {
      int current;
      int i = 0;
      while (i < intList.size())
         {
            current = intList.get(i);
            if (current == key) 
               {return i;}
            i++;
         } 
      return -1;
   }
   public int recBinarySearch(int key)
   {
      return recBinarySearch(key, 0, intList.size()-1);
   }
   private int recBinarySearch(int key, int min, int max)
   {
      if (min > max)
         {return -1;}
      int mid = (min+max)/2;

      if (intList.get(mid) < key)
         {return recBinarySearch(key, mid+1, max);}

      if (intList.get(mid) > key)
         {return recBinarySearch(key, min, mid-1);}
      return mid;
   }
}
    





  
