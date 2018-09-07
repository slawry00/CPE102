/**
 * Rochambeau class
 *
 * @author Spencer Lawry
 * @version Lab 03
 * @version CPE102-01
 */
//import java.lang.*;
public class SUnit extends java.lang.Object
{
   private static int assertsCalled;
   private static int assertsFailed;

   public static int testsRun()
   {
      return assertsCalled;
   }

   public static int testsFailed()
   {
      return assertsFailed;
   }
  
   public static void assertTrue(boolean actual)
   {
      assertsCalled++;
      if (!actual)
      {
         Throwable throwable = new Throwable("Error: Expected true, found false");
         throwable.printStackTrace();
         assertsFailed++;
      }
   }
  
   public static void assertFalse(boolean actual)
   {
      assertsCalled++;
      if (actual)
      {
         Throwable throwable = new Throwable("Error: Expected false, found true");
         throwable.printStackTrace();
         assertsFailed++;
      }
   }
   public static void assertEquals(long expect, long actual)
   {  
      assertsCalled++;
      if (!(expect == actual))
      {
         Throwable throwable = new Throwable("Error: Expected "+expect+
                                             ", found "+ actual);
         throwable.printStackTrace();
         assertsFailed++;
      } 
   } 
   public static void assertEquals(double expect, double actual, double epsilon)
   {  
      assertsCalled++;
      if (!(expect <= actual + epsilon && expect >= actual - epsilon))
      {
         Throwable throwable = new Throwable("Error: Expected "+expect+
                                             " +/-"+epsilon+", found "+ actual);
         throwable.printStackTrace();
         assertsFailed++;
      } 
   } 
   public static void assertEqualsObject(java.lang.Object expect,
                                         java.lang.Object actual)
   {  
      assertsCalled++;
      if (!(expect.equals(actual)))
      {
         Throwable throwable = new Throwable("Error: Expected object equality,"
                                             +" found inequality");
         throwable.printStackTrace();
         assertsFailed++;
      } 
   } 
   public static void assertEqualsReference(java.lang.Object expect,
                                         java.lang.Object actual)
   {  
      assertsCalled++;
      if (!(expect == actual))
      {
         Throwable throwable = new Throwable("Error: Expected reference equality,"
                                             +" found inequality");
         throwable.printStackTrace();
         assertsFailed++;
      } 
   } 
   public static void assertNull(java.lang.Object actual)
   {  
      assertsCalled++;
      if (!(actual == null))
      {
         Throwable throwable = new Throwable("Error: Expected null,"+
                                             " found non-null"); 
         throwable.printStackTrace();
         assertsFailed++;
      } 
   } 
   public static void assertNotNull(java.lang.Object actual)
   {  
      assertsCalled++;
      if ((actual == null))
      {
         Throwable throwable = new Throwable("Error: Expected non-null,"+
                                             " found null"); 
         throwable.printStackTrace();
         assertsFailed++;
      } 
   } 
   public static void fail()
   {  
      assertsCalled++;
      Throwable throwable = new Throwable("Error: Explicit failure");
      throwable.printStackTrace();
      assertsFailed++;
   } 

}        
