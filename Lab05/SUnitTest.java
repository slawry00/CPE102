/**
 * Tests for SUnit, a simple unit testing framework.
 *
 * @author Kurt Mammen
 * @version 04/22/2014 - Added architecture test.
 * @version 03/26/2014 - Added tests for fail().
 *                     - Added tests for null expect in assertEqualsObject().
 *                     - Added tests for value replacement of X, Y, et cetera
 *                       in error messages.
 *                     - No longer redirecting unexpected exception output to
 *                       SUnitTest.err file.
 * @version 01/14/2014 - Initial revision developed for CPE 102 Program 1a
 */
import java.lang.reflect.*;
import java.util.Scanner;
import java.io.*;

public class SUnitTest
{
   private static final String RESULTS_FOR = "Results for Lab 5";

   // Keeps track of any failure during all testing. This is updated
   // by all tests.
   private static boolean allPass = true;

   // Counts used in tests methods - declared here for readability
   // instead of making local. These are updated in updateCounts().
   private static int testsRun;
   private static int testsFailed;

   // Used to verify the number tests run. This is updated in updateCounts();
   private static int expectedTestsRun;
   
   // Used to verify the number of tests that fail AND to calculate the
   // number of lines that should be written to System.err. It is updated
   // in verifyCounts();
   private static int expectedTestsFailed;

   // File to redirect System.printStackTrace() output to for testing.
   private static final String ERR_FILE = "SUnitTest.err";

   public static void main(String[] args) throws Exception
   {
      printHeader(args);

      // Save all System.printStackTrace() output to a file for checking
      PrintStream saveErr = System.err;
      System.setErr(new PrintStream(new File(ERR_FILE)));

      try
      {
         System.out.println("Testing Architecture...");
         testArchitecture();
         System.out.println("Testing assertTrue...");
         testAssertTrue();
         System.out.println("Testing assertFalse...");     
         testAssertFalse();
         System.out.println("Testing assertEquals(long)...");
         testAssertEqualsLong();
         System.out.println("Testing assertEquals(double)...");
         testAssertEqualsDouble();
         System.out.println("Testing assertEquals(Object)...");
         testAssertEqualsObject();
         System.out.println("Testing assertEquals(Object reference)...");
         testAssertEqualsReference();
         System.out.println("Testing assertNull...");
         testAssertNull();
         System.out.println("Testing assertNotNull...");
         testAssertNotNull();
         System.out.println("Testing fail...");
         testFail();

         // Close redirected err and restore original
         System.err.close();
         System.setErr(saveErr);
      }
      catch(Exception e)
      {
         // Close redirected err and restore original
         System.err.close();
         System.setErr(saveErr);

         // Rethrow unexpected exception
         throw e;
      }

      if (!allPass) {
         System.out.println("\nNOTE: When all tests above pass, error message text testing will follow");
      }
      else {
         System.out.println("\nOperational tests passed, testing error messages...");
         testErrOutput();
      }
      
      printResults();

      // Added for robust script checking
      if (!allPass)
      {
         System.exit(-1);
      }
   }

   private static void testArchitecture()
   {
      Class cl = SUnit.class;

      // Check for constructors (none specified - allow private if they want)
      // Compiler generated constructor will show up unless they make private.
      int count = 0;

      for (Constructor c : cl.getDeclaredConstructors())
      {
         if (!Modifier.isPrivate(c.getModifiers()))
         {
            count++;
         }
      }

      test(count < 2, "Expected 0 or 1 declared constructors, found " + count);
     
      // Check for only specfied methods
      int other = 0;
      count = 0;

      for (Method m : cl.getDeclaredMethods())
      {
         int mods = m.getModifiers();

         if (Modifier.isPublic(mods) && Modifier.isStatic(mods))
         {
            count++;
         }
         else
         {
            other++;
         }
      }
      
      test(count == 11, "Expected 11 public static methods, found " + count); 
      test(other == 0, "Expected only public static methods, found " + other + " other(s)"); 

   }

   private static void testAssertTrue()
   {
      updateCounts();
      SUnit.assertTrue(true);
      verifyCounts(testsRun + 1, testsFailed + 0);
      
      updateCounts();
      SUnit.assertTrue(false);
      verifyCounts(testsRun + 1, testsFailed + 1);
   }

   private static void testAssertFalse()
   {
      updateCounts();
      SUnit.assertFalse(false);
      verifyCounts(testsRun + 1, testsFailed + 0);
      
      updateCounts();
      SUnit.assertFalse(true);
      verifyCounts(testsRun + 1, testsFailed + 1);
   }

   private static void testAssertEqualsLong()
   {
      updateCounts();
      SUnit.assertEquals(9876543210L, 9876543210L);
      verifyCounts(testsRun + 1, testsFailed + 0);
      
      updateCounts();
      SUnit.assertEquals(9876543210L, 9876543211L);
      verifyCounts(testsRun + 1, testsFailed + 1);
   }

   private static void testAssertEqualsDouble()
   {
      updateCounts();
      SUnit.assertEquals(0.123456, 0.123456, 0.000001);
      verifyCounts(testsRun + 1, testsFailed + 0);
      
      updateCounts();
      SUnit.assertEquals(0.123456, 0.1234569, 0.000001);
      verifyCounts(testsRun + 1, testsFailed + 0);

      updateCounts();
      SUnit.assertEquals(0.123456, 0.1234571, 0.000001);
      verifyCounts(testsRun + 1, testsFailed + 1);

      updateCounts();
      SUnit.assertEquals(-100.0, -100.0, 10);
      verifyCounts(testsRun + 1, testsFailed + 0);
      
      updateCounts();
      SUnit.assertEquals(-100.0, -110.0, 10);
      verifyCounts(testsRun + 1, testsFailed + 0);

      updateCounts();
      SUnit.assertEquals(-100.0, -110.1, 10);
      verifyCounts(testsRun + 1, testsFailed + 1);
   }
      
   private static void testAssertEqualsObject()
   {
      String a1 = new String("apple");
      String a2 = new String("apple");
      String o = new String("orange");

      updateCounts();
      SUnit.assertEqualsObject(a1, a2);
      verifyCounts(testsRun + 1, testsFailed + 0);
      
      updateCounts();
      SUnit.assertEqualsObject(a1, o);
      verifyCounts(testsRun + 1, testsFailed + 1);

      updateCounts();
      SUnit.assertEqualsObject(a1, null);
      verifyCounts(testsRun + 1, testsFailed + 1);

      // NOTE: Don't get (null, a1) because counts may be incremented
      //       before or after the exception that would occur AND because
      //       it is a mis-use of the method according to the specifications.
   }

   private static void testAssertEqualsReference()
   {
      String a1 = new String("apple");
      String a2 = new String("apple");
      String a3 = a2;

      updateCounts();
      SUnit.assertEqualsReference(a2, a3);
      verifyCounts(testsRun + 1, testsFailed + 0);
      
      updateCounts();
      SUnit.assertEqualsReference(a1, a2);
      verifyCounts(testsRun + 1, testsFailed + 1);
   }

   private static void testAssertNull()
   {
      Object o = null;

      updateCounts();
      SUnit.assertNull(o);
      verifyCounts(testsRun + 1, testsFailed + 0);

      o = new Object();

      updateCounts();
      SUnit.assertNull(o);
      verifyCounts(testsRun + 1, testsFailed + 1);
   }

   private static void testAssertNotNull()
   {
      Object o = new Object();

      updateCounts();
      SUnit.assertNotNull(o);
      verifyCounts(testsRun + 1, testsFailed + 0);

      o = null;

      updateCounts();
      SUnit.assertNotNull(o);
      verifyCounts(testsRun + 1, testsFailed + 1);
   }

   private static void testFail()
   {
      updateCounts();
      SUnit.fail();
      verifyCounts(testsRun + 1, testsFailed + 1);
   }

   private static void testErrOutput() throws FileNotFoundException
   {
      int lines = 0;
      Scanner scan = new Scanner(new File(ERR_FILE));

      // Check first line of each error message
      while(scan.hasNextLine())
      {
         String line = scan.nextLine();

         if (lines % 4 == 0)
         {
            if (!expectedMsgs[lines / 4].equals(line))
            {
               allPass = false;
               new Throwable("\nError message did not meet specification - "
                  + "see " + ERR_FILE + " for actual output.\n"
                  + "\tExpected: " + expectedMsgs[lines / 4] + "\n"
                  + "\t   Found: " + line).printStackTrace();
            }
         }
         
         lines++;
      }

      // Verify correct number of error messages
      if (lines != expectedTestsFailed * 4)
      {
         allPass = false;
         new Throwable("Expected " + (expectedTestsFailed * 4)
            + " lines to System.err, found " + lines
            + " (see SUnitTest.err for actual output)").printStackTrace();
      }
   }

   // Testing helper functions...
   private static void updateCounts()
   {
      expectedTestsRun++;
      testsRun = SUnit.testsRun();
      testsFailed = SUnit.testsFailed();
   }

   private static void test(boolean pass, String msg)
   {
      if (!pass)
      {
         allPass = false;
         new Throwable(msg).printStackTrace(System.out);
      }
   }

   private static void verifyCounts(int expectedRun, int expectedFailed)
   {
      int actualRun = SUnit.testsRun();
      int actualFailed = SUnit.testsFailed();

      if (expectedRun != actualRun)
      {
         allPass = false;
         new Throwable("Expected " + expectedRun
                     + " tests run, found " + actualRun).printStackTrace(System.out);
      }

      if (expectedFailed != actualFailed)
      {
         allPass = false;
         new Throwable("Expected " + expectedFailed
                     + " failed tests, found " + actualFailed).printStackTrace(System.out);
      }
      
      // Count expected failures so number of lines printed
      // to System.err can be calculated.
      if (expectedFailed > testsFailed)
      {
         expectedTestsFailed++;
      }
   }

   private static void printHeader(String[] args)
   {
      if (args.length == 1)
      {
         System.out.println(args[0]);
      }
      
      System.out.println(RESULTS_FOR + "\n");
   }

   private static void printResults()
   {
      String msg;
      
      if(allPass)
      {
         msg = "\nCongratulations, you passed all the tests!\n";
      }
      else
      {
         msg = "\nNot done yet - you failed one or more tests!\n";
      }
      
      System.out.print(msg);       
   }

   private static final String[] expectedMsgs = new String[]
   {
      "java.lang.Throwable: Error: Expected true, found false",
      "java.lang.Throwable: Error: Expected false, found true",
      "java.lang.Throwable: Error: Expected 9876543210, found 9876543211",
      "java.lang.Throwable: Error: Expected 0.123456 +/-1.0E-6, found 0.1234571",
      "java.lang.Throwable: Error: Expected -100.0 +/-10.0, found -110.1",
      "java.lang.Throwable: Error: Expected object equality, found inequality",
      "java.lang.Throwable: Error: Expected object equality, found inequality",
      "java.lang.Throwable: Error: Expected reference equality, found inequality",
      "java.lang.Throwable: Error: Expected null, found non-null",
      "java.lang.Throwable: Error: Expected non-null, found null",
      "java.lang.Throwable: Error: Explicit failure"
   };
}
