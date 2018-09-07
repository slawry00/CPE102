/**                                                   
 * Counter class tester 
 *                                                                             
 * @author Spencer Lawry                                                        
 * @version Lab 01                                                              
 * @version CPE102-01                                                           
 */

public class Driver
{

    public static void main(String[] args)
    {
       // Declare and test a Counter object ...
       Counter ct = new Counter();

       // some sample tests
       System.out.println("Initial count: " + ct.currentCount());
       ct.incrementCount();  
       System.out.println("Incremented once: " + ct.currentCount());
       ct.reset();
       System.out.println("Reset to zero: " + ct.currentCount());

       Counter ctmod = new Counter(3);
       System.out.println("Zero: (mod = 3) "+ ctmod.currentCount());
       ctmod.incrementCount();
       System.out.println("Incremented Once: " + ctmod.currentCount());
       ctmod.incrementCount();
       System.out.println("Incremented Twice: " + ctmod.currentCount());
       ctmod.incrementCount();
       System.out.println("A Third Time: " + ctmod.currentCount());
       ctmod.incrementCount();
       System.out.println("A Fourth Time: " + ctmod.currentCount());
       ctmod.incrementCount();
       System.out.println("A Fifth Time: " + ctmod.currentCount());
       
       ctmod.reset();
       System.out.println("Reset to Zero :" + ctmod.currentCount());
       ctmod.unReset();
       System.out.println("Back to What it was: " + ctmod.currentCount());
   }
}
