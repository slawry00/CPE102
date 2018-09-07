public class MyTests
{
   public static void main(String[] args)
   {
      //SUnit.assertTrue(4==5);
      //SUnit.assertTrue(5==5);
      //SUnit.assertFalse(4==5);
      //SUnit.assertFalse(5==5);
      //SUnit.assertEquals(5, 5);
      //SUnit.assertEquals(5, 4);
      //SUnit.assertEquals(5.0, 4.0, 1.0);
      //SUnit.assertEquals(5.0, 4.0, 0.5);
      String word = new String("cat");
      String sameword = new String("cat");       
      String diffword = new String("dogs");
      //SUnit.assertEqualsObject(word, sameword);
      //SUnit.assertEqualsObject(word, diffword);
      SUnit.assertEqualsReference(word.length(), sameword.length());
      SUnit.assertEqualsReference(word.length(), diffword.length());
      

      //System.out.println("Testing assertEquals(long, long)...");
      
      //System.out.println("First test, should pass.");
      //SUnit.assertEquals(34, 34);
      //System.out.println("Second test, should fail and print stack trace.");
      //SUnit.assertEquals(34, 35);

      //System.out.println("\nTests run: " + SUnit.testsRun());
      //System.out.println("Tests failed: " + SUnit.testsFailed());
   }
}
