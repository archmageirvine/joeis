package irvine.math.function;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class LeastPrimitiveRootTest extends TestCase {

  public void test() {
    final Function1 f = new LeastPrimitiveRoot();
    assertEquals(1, f.l(2));
    assertEquals(2, f.l(10));
    assertEquals(2, f.l(16));
    assertEquals(3, f.l(123));
  }
}
