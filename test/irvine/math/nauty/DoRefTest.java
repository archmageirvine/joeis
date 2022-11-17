package irvine.math.nauty;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DoRefTest extends TestCase {

  public void testMash() {
    assertEquals(27468, DoRef.mash(42, 21));
    assertEquals(27489, DoRef.mash(42, 42));
    assertEquals(27421, DoRef.mash(0, 0));
  }

  public void testCleanup() {
    assertEquals(0, DoRef.cleanup(0));
    assertEquals(42, DoRef.cleanup(42));
    assertEquals(1, DoRef.cleanup(Integer.MAX_VALUE));
  }
}
