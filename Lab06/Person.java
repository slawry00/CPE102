/**
 * Person class
 *
 * @author Spencer Lawry
 * @version Lab 06
 * @version CPE102-01
 */
public class Person extends Animal
{
   private String name;

   public Person(String name, int legs)
   {
      super(legs);
      this.name = name;
   }

   public boolean equals(Object other)
   {
      if (!super.equals(other)) {return false;}
      Person otherPers = (Person) other;
      return name == otherPers.name;
   }

   public String toString()
   {
      return super.toString() + " and a Person object whose name is "+name;
   }
}

