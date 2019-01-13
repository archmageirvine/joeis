package irvine.math.group;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Janko1Test extends TestCase {

  public void test() {
    final Janko1 j1 = new Janko1();
    assertEquals(Z.valueOf(175560), j1.size());
    assertTrue(j1.isSimple());
    assertFalse(j1.isAbelian());
    assertEquals("J_1", j1.toString());
  }
}
