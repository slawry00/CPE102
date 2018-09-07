/**
 * WorkSpace ArrayList Stuff 
 *
 * @author Spencer Lawry
 * @version Project 2
 * @version CPE102-01
 */
import java.awt.*;
import java.util.*;
public class WorkSpace
{
   private ArrayList<Shape> shapeList = new ArrayList<Shape>();
   
   public WorkSpace()
   {
   }

   public void add(Shape shape)
   {
      shapeList.add(shape);
   }
   public Shape remove(int index)
   {
      Shape reference = shapeList.get(index);
      if ((index > (shapeList.size() - 1)) || (index < 0))
      {
         return null;
      }
      shapeList.remove(index);
      return reference;
   }

   public Shape get(int index)
   {
      return shapeList.get(index);
   }
   public int size()
   {
      return shapeList.size();
   }
   public ArrayList<Circle> getCircles()
   {
      ArrayList<Circle> circList = new ArrayList<Circle>();
      // scanning shapeList for Circles
      for (int counter = 0; counter < shapeList.size(); counter++)
      {
         if (shapeList.get(counter).getClass().equals(Circle.class))         
         {
            circList.add((Circle) shapeList.get(counter));
         }
      }
      return circList;
   }
   public ArrayList<Rectangle> getRectangles()
   {
      ArrayList<Rectangle> rectList = new ArrayList<Rectangle>();
      // scanning shapeList for Rectangles 
      for (int counter = 0; counter < shapeList.size(); counter++)
      {
         if (shapeList.get(counter).getClass().equals(Rectangle.class))         
         {
            rectList.add((Rectangle) shapeList.get(counter));
         }
      }
      return rectList;
   }
   public ArrayList<Triangle> getTriangles()
   {
      ArrayList<Triangle> triList = new ArrayList<Triangle>();
      // scanning shapeList for Triangles 
      for (int counter = 0; counter < shapeList.size(); counter++)
      {
         if (shapeList.get(counter).getClass().equals(Triangle.class))         
         {
            triList.add((Triangle) shapeList.get(counter));
         }
      }
      return triList;
   }
   public ArrayList<ConvexPolygon> getConvexPolygons()
   {
      ArrayList<ConvexPolygon> conList = new ArrayList<ConvexPolygon>();
      // scanning shapeList for ConvexPolygons 
      for (int counter = 0; counter < shapeList.size(); counter++)
      {
         if (shapeList.get(counter).getClass() == ConvexPolygon.class)         
         {
            conList.add((ConvexPolygon) shapeList.get(counter));
         }
      }
      return conList;
   }
   public ArrayList<Shape> getShapesByColor(Color color)
   {
      ArrayList<Shape> colList = new ArrayList<Shape>();
      // putting matching shapes of input color into one list
      for (int counter = 0; counter < shapeList.size(); counter++)
      {
         if (shapeList.get(counter).getColor().equals(color))         
         {
            colList.add(shapeList.get(counter));
         }
      }
      return colList;
   }
   public double getAreaOfAllShapes()
   {
      double shapeArea = 0;
      double sumUp = 0;
      // Summing up the shapeAreas
      for (int counter = 0; counter < shapeList.size(); counter++)
      {
         shapeArea = shapeList.get(counter).getArea();
         sumUp = sumUp + shapeArea; 
      }
      return sumUp;
   }
}

