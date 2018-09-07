/**
 * BasicListIterator Class 
 *
 * @author Spencer Lawry
 * @version Project 5
 * @version CPE102-01
 */
public interface BasicListIterator<E> extends java.util.Iterator<E>
{
   boolean hasPrevious();
   E previous();
}
