/**
 * Student class
 *
 * @author Spencer Lawry
 * @version Lab 06
 * @version CPE102-01
 */

public class Student extends Person 
{
   private double gpa;

   public Student(double gpa, String name, int legs)
   {
      super(name, legs);
      this.gpa = gpa;
   }
  
   public boolean equals(Object other)
   {
      if (!super.equals(other)) {return false;}
      Student otherStu = (Student) other;
      return gpa == otherStu.gpa;
   }
 
   public String toString()
   {
      return super.toString()+" and a Student Object with a "+gpa+" gpa";
   }
}
