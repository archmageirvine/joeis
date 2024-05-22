package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SumTest extends TestCase {

  public void testSum() {
    assertEquals(42, Functions.SUM.i(42));
    assertEquals(42, Functions.SUM.i(20, 22));
  }
}
