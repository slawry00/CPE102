/**
 * Stack Tester 
 *
 * @author Spencer Lawry
 * @version Lab 11
 * @version CPE102-01
 */
public class Tester 
{
   public static void main(String[] args)
   {
      Stack<String> stack = new Stack<String>();
      stack.push("A");
      stack.push("B");
      stack.push("C");
      System.out.println(stack.pop());
      stack.push("D");
      System.out.println(stack.pop());
      System.out.println(stack.pop());
      System.out.println(stack.pop());
   }
}
