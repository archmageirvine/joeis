package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DigitSortAscendingTest extends TestCase {

  public void test() {
    final Function2D f = new DigitSortAscending();
    assertEquals(0, f.l(0));
    assertEquals(1, f.l(1));
    assertEquals(1, f.l(10));
    assertEquals(1234, f.l(1234));
    assertEquals(1234, f.l(4231));
    assertEquals(11333, f.l(31331));
    assertEquals(3, f.l(2, 10));
  }
}
