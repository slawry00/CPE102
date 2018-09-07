public class Monster
{
   private double x;
   private double y;
   private PVector direction;

   public Monster(double x, double y)
   {
      this.x = x;
      this.y = y;
      this.direction = new PVector(0,0);
   }

   public void draw()
   {   
       pushMatrix();
       translate((int)x, (int)y);
        
       
      
       // HEAD
       fill(200,10,10);
       ellipse(0, 0, 35, 35);
       
       // SUNGLASSES
       fill(0);
       triangle(-15,-10,-3,-10,-9,-4); //left shade
       triangle(15,-10,3,-10,9,-4); //right shade
       stroke(0);
       strokeWeight(1.5);
       line(-10,-8,10,-8); //middle sunglass line
       line(10,-5,16,-12); // slanted sunglass lines
       line(-10,-5,-16,-12);
       
       // HAT
       fill(50);
       strokeWeight(1);
       rect(-22,-19,45,6); //bottom of hat
       rect(-15,-25,30,6); //top of hat
       
       
       //MOUTH
       fill(100);
       ellipse(0,6,15,8);
       
       // CIGARETTE
       fill(200);
       rotate(8.2*PI/4);
       rect(0,7,18,3);
       popMatrix();
       
   }

   public double getX()
   {
      return x;
   }

   public double getY()
   {
      return y;
   }

   public void move()
   {
      x = x + direction.x*3;
      y = y + direction.y*3;
   }

   public void setVector(PVector direction)
   {
      this.direction = direction;
   }
      
}
