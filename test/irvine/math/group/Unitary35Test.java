package irvine.math.group;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Unitary35Test extends TestCase {

  public void testU35() {
    final Unitary35 u = new Unitary35();
    assertEquals(Z.valueOf(126000), u.size());
    assertFalse(u.isAbelian());
    assertTrue(u.isSimple());
    assertEquals("U_3(5)", u.toString());
  }
}
