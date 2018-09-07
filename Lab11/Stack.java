/**
 * Stack Class 
 *
 * @author Spencer Lawry
 * @version Lab 11
 * @version CPE102-01
 */
import java.util.LinkedList;
public class Stack<Element>
{
   private LinkedList<Element> link = new LinkedList<Element>();

   public Stack()
   {
   }

   public void push(Element x)
   {
      link.addFirst(x);
   }
   public Element pop()
   {
      Element x = link.getFirst();
      link.removeFirst();
      return x;
   } 
}
