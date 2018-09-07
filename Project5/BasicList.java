/**
 * BasicList Interface 
 *
 * @author Spencer Lawry
 * @version Project 5
 * @version CPE102-01
 */
public interface BasicList<E> extends java.lang.Iterable<E>
{
   void add(E element);
   void add(int index, E element);
   BasicListIterator<E> basicListIterator();
   void clear();
   boolean contains(E element);
   E get(int index);
   int indexOf(E element);
   java.util.Iterator<E> iterator();
   E remove(int index);
   E set(int index, E element);
   int size();
}
