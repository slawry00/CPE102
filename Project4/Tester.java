import java.util.*;
import java.io.*;
public class Tester {
   public static void main(String[] args) throws Exception
   {
     // String[] strList = {"a","b","c","d","e"};
     // for (String i : strList)
     // {
     //    System.out.println(i);
     // }
   
   /*Square square = new Square(true, true, true, true, 0, 0);
   Square[][] squares = new Square[1][1];
   squares[0][0] = square;
   Maze maze = new Maze(squares, 1, 1);
   RandomOccupant testRO = new Monster(maze);
   System.out.println(testRO.getClass());
   
   if (testRO.getClass() == Monster.class)
   {
      System.out.println("YES");
   }
   Scanner str1 = new Scanner(square.toText(','));
   str1.useDelimiter(",");
   while (str1.hasNext())
   {
   System.out.println(str1.next());
   }
   */
   //Scanner str2 = new Scanner("cat,dog,turtle");
   //testToObject(str2);
   //str2.useDelimiter(",");
   //str2.next();
   //System.out.println(str2.toString());
   //System.out.println(str2.hasNext("cat"));
   //System.out.println(str2.hasNext("dog"));
   File inFile = new File("mazeGood.txt"); 
   Scanner fileScanner = new Scanner(inFile);
   String line = fileScanner.nextLine();
   Scanner lineScanner = new Scanner(line).useDelimiter(",");
   //System.out.println(lineScanner.nextInt());
   //lineScanner.next();
   //System.out.println(lineScanner.nextInt());
   line = fileScanner.nextLine();
   lineScanner = new Scanner(line).useDelimiter(",");
   System.out.println(lineScanner.hasNext("Square"));
   

   }
  // public static void testToObject(Scanner scan)
  // {
  //    scan.useDelimiter(",");
  //    int row = scan.nextInt();
  //    int col = scan.nextInt();
  // }
}


   
