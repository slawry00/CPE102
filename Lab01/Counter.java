/**
 * A simple integer counter.
 *
 * @author Spencer Lawry
 * @version Lab 01
 * @version CPE102-01
 */

public class Counter {
  
  private int count; // current count
  private int mod; // reset value 
  private int oldcount;
  // Constructors:
  
  /**
   * Create a new Counter, with the count initialized
   * to 0.
   */
  public Counter()
  {
  count = 0;
  mod = 10;
  }
  
  public Counter (int modulus) {
    count = 0;
    mod = modulus;
  }
  
  // Queries (Accessors):
  
  /**
   * The number of items counted.
   */
  public int currentCount () {
    return count;
  }
  
  // Commands (Mutators):
  
  /**
   * Increment the count by 1.
   */
  public void incrementCount () {
    count = count + 1;
    if (count >= mod)
    {
    count = 0;
    }
  }
  
  /**
   * Reset the count to 0.
   */
  public void reset () {
    oldcount = count;
    count = 0;
  }
  public void unReset ()
  {
  count = oldcount;
  }
 }






