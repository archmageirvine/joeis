package irvine.math.group;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Janko2Test extends TestCase {

  public void test() {
    final Janko2 j2 = new Janko2();
    assertEquals(Z.valueOf(604800), j2.size());
    assertTrue(j2.isSimple());
    assertFalse(j2.isAbelian());
    assertEquals("J_2", j2.toString());
  }
}
