
/**
 * Write a description of interface Point here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

public interface Point
{
    double xCoordinate(); 
    double yCoordinate(); 
    double radius(); 
    double angle(); 
    double distanceFrom(Point other); 
    Point rotate90();
}
