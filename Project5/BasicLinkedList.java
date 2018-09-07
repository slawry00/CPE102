/**
 * BasicLinkedList Class 
 *
 * @author Spencer Lawry
 * @version Project 5
 * @version CPE102-01
 */
import java.util.*;
public class BasicLinkedList<E> implements BasicList<E>
{
   private int size;
   private Node first;
   private Node last;
   

   public BasicLinkedList()
   {
      size = 0;
      first = null;
      last = null;
   }

   public void add(E element)
   {
      if (first == null)
      {
         Node newNode = new Node(element, null, null);       
         first = newNode;   
         last = first;
      }
      else
      {
         Node newNode = new Node(element, null, last);       
         last.next = newNode;
         last = newNode;
      }
      size++;
      
   }

   public void add(int index, E element)
   {
      if (index > size || index < 0)
      {
         throw new IndexOutOfBoundsException();
      }
      if (index == 0)
      {
         Node newNode = new Node(element, first, null);       
         if (first != null)
         {
            first.prev = newNode;
         }
         first = newNode;
         if (last == null)
         {
            last = first;
         } 
      }
      else if (index == size)
      {
         Node newNode = new Node(element, null, last);       
         if (last != null)
         {
            last.next = newNode; 
         }
         last = newNode;
      }
      else 
      {
         Node p = getNode(index-1);
         Node newNode = new Node(element, p.next, p);       
         if (p.next != null)
         {
            p.next.prev = newNode;
         }
         p.next = newNode;
             
      }
      size++;
   }

   public BasicListIterator<E> basicListIterator()
   {
      return new InternalIterator();
   }

   public void clear()
   {
      this.first = null;
      this.last = null;    
      size = 0;
   }

   public boolean contains(E element)
   {
      Node current = first;
      while (current != null)      
      {
         if (current.element.equals(element))
         {
            return true;
         }
         current = current.next;
      }
      return false;
   }

   public E get(int index)
   {
      if (index > size-1 || index < 0)
      {
         throw new IndexOutOfBoundsException();
      }
      Node goGetter = getNode(index);
      if (goGetter != null)
      {
         return goGetter.element; 
      }
      else
      {
         return null; 
      }
   }
  
   public int indexOf(E element)
   {
      Node current = first;
      int index = 0;
      while (current != null)      
      {
         if (current.element.equals(element))
         {
            return index;
         }
         current = current.next;
         index++;
      }
      throw new NoSuchElementException();
   }

   public Iterator<E> iterator()
   {
      return new InternalIterator();
   } 

   public E remove(int index)
   {
      if (index > size-1 || index < 0)
      {
         throw new IndexOutOfBoundsException();
      }
      Node deleted;
      if (index == 0)
      {
         deleted = first;
         first = first.next;
         if (first != null)
         {   
            first.prev = null;
         }
      }
      else if (index == size-1)
      {
         deleted = last;
         last = last.prev;
         last.next = null;
      }
      else  
      {
         Node p = getNode(index-1);
         deleted = p.next;
         p.next = p.next.next;
         if (p.next != null)
         {
            p.next.prev = p;
         }
         
      }       
      
      if (deleted != null)
      {
         size--;
         return deleted.element;
      }
      else
         return null;
   }
      

   public E set(int index, E element)
   {
      if (index > size-1 || index < 0)
      {
         throw new IndexOutOfBoundsException();
      }
      E deleted;
      if (index == 0)
      {
         deleted = first.element;
         first.element = element;
      }
      else if (index == size-1)
      {
         deleted = last.element;
         last.element = element;
      }
      else 
      {
         Node p = getNode(index);
         deleted = p.element;
         p.element = element;    
      }
      return deleted;
   }

   public int size()
   {
      return size;
   }

   private Node getNode(int i)
   {
      Node p = first;
      int pos = 0;
      while (pos!= i)
      {
         p = p.next;
         pos++;
      }
      return p;
 
   }
   private class Node
   {
      public E element;
      public Node next;
      public Node prev;
 
      public Node(E element, Node next, Node prev)
      {
         this.element = element;
         this.next = next;
         this.prev = prev;
      }
   }
   private class InternalIterator implements BasicListIterator<E>
   {
      //private Node node = null;

      public boolean hasNext()
      {
      return false;
      }
      public E next()
      {
      return null;
      }
      public boolean hasPrevious()
      {
      return false;
      }
      public E previous()
      {
      return null;
      }
      public void remove()
      {
      throw new UnsupportedOperationException();
      }
   }
}
