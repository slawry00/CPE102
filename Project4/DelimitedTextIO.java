/**
 * DelimitedTextIO Interface
 *
 * @author Spencer Lawry
 * @version Project 4 
 * @version CPE102-01
 * @version 3/6/17
 */
import java.util.Scanner;
public interface DelimitedTextIO
{
   String toText(char delimiter);
   void toObject(Scanner input);
}
