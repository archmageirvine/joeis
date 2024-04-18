package irvine.math.function;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class CototientTest extends TestCase {

  public void test() {
    final Function1 f = new Cototient();
    assertEquals(0, f.l(1));
    assertEquals(1, f.l(2));
    assertEquals(30, f.l(42));
    assertEquals(Z.TWO, f.z(Z.FOUR));
    assertEquals(Z.ONE, f.z(Z.FIVE));
  }
}
