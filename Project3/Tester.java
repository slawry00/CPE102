public class Tester
{
   public static void main(String[] args)
   {
     // String[] strList = {"a","b","c","d","e"};
     // for (String i : strList)
     // {
     //    System.out.println(i);
     // }
   
   Square square = new Square(true, true, true, true, 0, 0);
   Square[][] squares = new Square[1][1];
   squares[0][0] = square;
   Maze maze = new Maze(squares, 1, 1);
   RandomOccupant testRO = new Monster(maze);
   System.out.println(testRO.getClass());
   
   if (testRO.getClass() == Monster.class)
   {
      System.out.println("YES")
   }
}
}


   
