package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class DigitSortDescendingTest extends TestCase {

  public void test() {
    final Function2 f = new DigitSortDescending();
    assertEquals(0, f.l(0));
    assertEquals(1, f.l(1));
    assertEquals(10, f.l(10));
    assertEquals(4321, f.l(1234));
    assertEquals(4321, f.l(4231));
    assertEquals(33311, f.l(31331));
    assertEquals(12, f.l(2, 10));
  }
}
