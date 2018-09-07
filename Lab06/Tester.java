public class Tester
{
   public static void main(String[] args)
   {
      Animal cat = new Animal(4);
      System.out.println(cat);
      Animal dog = new Animal(4);
      System.out.println("cat(4 legs) vs dog(4 legs) "+cat.equals(dog));
      
      Person joe = new Person("Joe", 2);
      System.out.println(joe);
      Person joe2 = new Person("Joe", 2);
      System.out.println("Joe vs Joe2(copy) "+joe.equals(joe2));
      
      Student stu = new Student(1.5,"Stu", 2);
      System.out.println(stu);
      Student stu2 = new Student(1.5,"Stu", 2);
      System.out.println("stu vs stu2(copy) "+stu.equals(stu2));
   }
}
