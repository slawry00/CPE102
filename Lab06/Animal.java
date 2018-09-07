/**
 * Animal class
 *
 * @author Spencer Lawry
 * @version Lab 06
 * @version CPE102-01
 */
//import java.lang.*;

public class Animal
{

   private int legs;

   public Animal(int legs)
   {
      this.legs = legs;
   }  

   public boolean equals(Object other)
   {
      if (other == null) {return false;}
      if (this.getClass() != other.getClass()) {return false;}
      Animal otherAn = (Animal) other;
      return legs == otherAn.legs;
     
   }
 
   public String toString()
   {
      return "I am an Animal object with "+legs+" legs";
   }
}
