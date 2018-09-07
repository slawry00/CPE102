//import java.util.*;
public class Tester
{
   public static void main(String[] args)
   {
      BasicLinkedList<Integer> myList = new BasicLinkedList<Integer>();
      myList.add(0, 10);
      myList.add(0, 1);
      myList.add(2, 20);
      //myList.add(2, 15);
      Integer getter = myList.get(2);
      //System.out.println(myList.size());
      System.out.println(getter);
      //myList.add(6);
      //myList.add(7);
      //Iterator<Integer> intIter = myList.iterator();
      //while (intIter.hasNext())
      //{
      //   System.out.println(intIter.next());
      //}
   }
}
