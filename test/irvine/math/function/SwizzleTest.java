package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SwizzleTest extends TestCase {

  public void testZ() {
    final Function1 f = new Swizzle();
    assertEquals(Z.TWO, f.z(Z.ONE));
    assertEquals(Z.FIVE, f.z(Z.THREE));
    assertEquals(Z.SIX, f.z(Z.FIVE));
    assertEquals(Z.valueOf(23), f.z(Z.valueOf(15)));
  }

  public void testL() {
    final Function1 f = new Swizzle();
    assertEquals(2, f.l(1));
    assertEquals(5, f.l(3));
    assertEquals(6, f.l(5));
    assertEquals(23, f.l(15));
  }

  public void testI() {
    final Function1 f = new Swizzle();
    assertEquals(2, f.i(1));
    assertEquals(5, f.i(3));
    assertEquals(6, f.i(5));
    assertEquals(23, f.i(15));
  }
}
