/**
 * MazeReadException Class
 *
 * @author Spencer Lawry
 * @version Project 4 
 * @version CPE102-01
 * @version 3/6/17
 */

public class MazeReadException extends Exception
{
   private int lineNumber;
   private String line;

   public MazeReadException(String message, String line, int lineNumber)
   {
      super(message);
      this.lineNumber = lineNumber;
      this.line = line;
   }

   public String getLine()  
   {
      return line;
   }
   public int getLineNum() 
   {
      return lineNumber;
   }
}
