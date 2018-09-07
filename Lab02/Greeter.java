/**                                                   
 * Greeter class 
 *                                                                             
 * @author Spencer Lawry                                                        
 * @version Lab 02                                                              
 * @version CPE102-01                                                           
 */

public class Greeter
{
   private String name;

   public Greeter (String name)
   {
   this.name = name;
   }
   public String greet()
   {
   return "Hello " + name;

   }
}
