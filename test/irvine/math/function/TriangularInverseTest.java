package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class TriangularInverseTest extends TestCase {

  public void test() {
    final Function1 f = new TriangularInverse();
    assertEquals(0, f.l(0));
    assertEquals(1, f.l(1));
    assertEquals(4, f.l(10));
    assertEquals(53, f.l(1431));
    assertEquals(Z.valueOf(53), f.z(Z.valueOf(1431)));
  }
}
