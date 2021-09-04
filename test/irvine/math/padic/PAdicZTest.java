package irvine.math.padic;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PAdicZTest extends TestCase {

  public void test() {
    final PAdic p = new PAdicZ(7, Z.valueOf(320));
    assertEquals("5", p.toString(0));
    assertEquals("5,3", p.toString(1));
    assertEquals("5,3,6", p.toString(2));
    assertEquals("5,3,6,0", p.toString(3));
    assertEquals(3, p.get(1));
    assertEquals(7, p.p());
  }
}
