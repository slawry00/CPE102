public class Lab00
{
   public static void main(String[] args)
   {
       int x = 5;
       String y = "hello";
       double z = 9.8;
       // print the variables
       System.out.println("x: " + x + " y: " + y + " z: " + z);

       // a list
       int[] myArray = {3,6,-1,2};
       for (int counter = 0; counter < myArray.length; counter++)
       {
          System.out.println(myArray[counter]);
       }
       // Call a function
       int numFound = charCount(y, 'l');
       System.out.println("Found: " + numFound);
       
       for (int counter = 1; counter < 11; counter++)
       {
          System.out.print(counter + " ");
       }
       System.out.println();
   }
      
   public static int charCount(String s, char c)
   {
      int count = 0;
      for (int counter = 0; counter < s.length(); counter++){
         char currentChar = s.charAt(counter);
         if (currentChar == c)
         {
            count += 1;      
         }
      }       
      return count;
   }
}
