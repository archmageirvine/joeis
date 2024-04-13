package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ReverseTest extends TestCase {

  public void testReverse() {
    final Function2 f = new Reverse();
    assertEquals(Z.ZERO, f.z(Z.ZERO));
    assertEquals(987654321, f.l(new Z("123456789")));
    assertEquals(0, f.l(0));
    assertEquals(1, f.l(1));
    assertEquals(42, f.l(24));
    assertEquals(1, f.l(10));
    assertEquals(123456789, f.l(9876543210L));
  }
}
