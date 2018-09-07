import java.util.Random;

public class Circle
{
    private double radius;

    public Circle()
    {
        Random rand = new Random();
        radius = rand.nextDouble()*10;
    }
    public Circle(double radius)
    {
        if (radius == 0)
        {
           throw new ZeroRadiusException();
        }
        if (radius < 0)
        {
           throw new NegativeRadiusException(radius);
        }
        this.radius = radius;
    }

    public double radius()
    {
        return radius;
    }
    
    public double diameter()
    {
        return radius*2;
    }
    
    public double circumference()
    {
        return 2*Math.PI*radius;
    }
    
    public double area()
    {
        return Math.PI*radius*radius;
    }
    
    public String toString()
    {
        return "Radius: " + radius;
    }
}
