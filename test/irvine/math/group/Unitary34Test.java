package irvine.math.group;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Unitary34Test extends TestCase {

  public void testU33() {
    final Unitary34 u = new Unitary34();
    assertEquals(Z.valueOf(62400), u.size());
    assertFalse(u.isAbelian());
    assertTrue(u.isSimple());
    assertEquals("U_3(4)", u.toString());
  }
}
