/**
 * Rochambeau class
 *
 * @author Spencer Lawry
 * @version Lab 03
 * @version CPE102-01
 */
import java.util.*;

public class Lab04
{
   public static void main (String[] args)
   {
      Scanner scan = new Scanner(System.in);
      String input = "notquitting";
      ArrayList<String> strList = new ArrayList<String>();
      ArrayList<Integer> intList = new ArrayList<Integer>();
      ArrayList<Double> dubList = new ArrayList<Double>();

      while (!input.equals("quit")) 
      {
         System.out.println("Enter an int, double, any random text, or type" + 
                         " quit to end: ");
         if (scan.hasNextInt())
         {
            int intNum = Integer.parseInt(scan.nextLine());
            intList.add(intNum);
         }
         else if (scan.hasNextDouble())
         {
            double dubNum = Double.parseDouble(scan.nextLine());
            dubList.add(dubNum);
         }
         else 
         {
            input = scan.nextLine();
            strList.add(input);

         }

      } 
      if (intList.size() > 0)
      {
         System.out.println("Integers:");
         for (int counter = 0; counter < intList.size(); counter++)
         {
            System.out.println(intList.get(counter));
         }
      }

      if (dubList.size() > 0)
      {
         System.out.println("Doubles:");
         for (int counter = 0; counter < dubList.size(); counter++)
         {
            System.out.println(dubList.get(counter));
         }
      }

      if (strList.size() > 1)
      {
         System.out.println("Other:");
         for (int counter = 0; counter < strList.size() - 1; counter++)
         {
            System.out.println(strList.get(counter)); 
         }
      }
   }
}
