public class TestCartesianPoint
{
   public static void main(String[] args)
   {
      // test methods
      testConstructor();
      
      testRadius();
      
      testDistanceFrom();
 
      testAngle();
 
      testRotate90();

      // results
      System.out.println("\nTests: " + SUnit.testsRun());
      System.out.println("Failures: " + SUnit.testsFailed());

      if (SUnit.testsFailed() == 0)
         System.out.println("\nPASSED ALL TESTS!!!");
   }

   private static void testConstructor()
   {
      int fails = SUnit.testsFailed();

      System.out.println("Testing constructor...");
      CartesianPoint cp = new CartesianPoint(2.1,4.7);
      SUnit.assertEquals(2.1, cp.xCoordinate(), .000001);
      SUnit.assertEquals(4.7, cp.yCoordinate(), .000001);

      if (fails == SUnit.testsFailed())
          System.out.println("     PASS");
   }
   
   private static void testRadius()
   {
      int fails = SUnit.testsFailed();
      System.out.println("Testing radius...");
      CartesianPoint cp = new CartesianPoint(Math.sqrt(2.0),Math.sqrt(2.0));
      SUnit.assertEquals(2.0, cp.radius(), .00001);
      if (fails == SUnit.testsFailed())
          System.out.println("     PASS");
   }
   private static void testDistanceFrom()
   {
      int fails = SUnit.testsFailed();
      System.out.println("Testing distanceFrom...");
      CartesianPoint cp1 = new CartesianPoint(2.0, 5.0);
      CartesianPoint cp2 = new CartesianPoint(2.0, 0.0);
      SUnit.assertEquals(5.0, cp1.distanceFrom(cp2), .0001); 
      if (fails == SUnit.testsFailed())
          System.out.println("     PASS");
   }

   private static void testAngle()
   {
      int fails = SUnit.testsFailed();
      System.out.println("Testing angle...");
      CartesianPoint cp1 = new CartesianPoint(1.0, 0.0); // right x-axis
      CartesianPoint cp2 = new CartesianPoint(1.0, 1.0); // 1st quad
      CartesianPoint cp3 = new CartesianPoint(0.0, 1.0); // upper y-axis
      CartesianPoint cp4 = new CartesianPoint(-1.0, 1.0); // 2nd quad
      CartesianPoint cp5 = new CartesianPoint(-1.0, 0.0); // left x-axis
      CartesianPoint cp6 = new CartesianPoint(-1.0, -1.0); // 3rd quad
      CartesianPoint cp7 = new CartesianPoint(0.0, -1.0); // lower y-axis
      CartesianPoint cp8 = new CartesianPoint(1.0, -1.0); // 4th quad

      SUnit.assertEquals(0.0, cp1.angle(), .0001); 
      SUnit.assertEquals((1*Math.PI/4), (((Math.PI*200)+ cp2.angle())%(2*Math.PI)), .0001); 
      SUnit.assertEquals((2*Math.PI/4), (((Math.PI*200)+ cp3.angle())%(2*Math.PI)), .0001); 
      SUnit.assertEquals((3*Math.PI/4), (((Math.PI*200)+ cp4.angle())%(2*Math.PI)), .0001); 
      SUnit.assertEquals((4*Math.PI/4), (((Math.PI*200)+ cp5.angle())%(2*Math.PI)), .0001); 
      SUnit.assertEquals((5*Math.PI/4), (((Math.PI*200)+ cp6.angle())%(2*Math.PI)), .0001); 
      SUnit.assertEquals((6*Math.PI/4), (((Math.PI*200)+ cp7.angle())%(2*Math.PI)), .0001); 
      SUnit.assertEquals((7*Math.PI/4), (((Math.PI*200)+ cp8.angle())%(2*Math.PI)), .0001); 
      if (fails == SUnit.testsFailed())
          System.out.println("     PASS");
   }
   private static void testRotate90()
   {
      int fails = SUnit.testsFailed();
      System.out.println("Testing rotate90...");
      CartesianPoint cp1 = new CartesianPoint(2.0, 5.0);
      CartesianPoint cp2 = new CartesianPoint(-5.0, 2.0);
      SUnit.assertEquals(cp2.xCoordinate(),
                         cp1.rotate90().xCoordinate(), .0001); 
      SUnit.assertEquals(cp2.yCoordinate(),
                         cp1.rotate90().yCoordinate(), .0001); 
      if (fails == SUnit.testsFailed())
          System.out.println("     PASS");
   }
   
}
