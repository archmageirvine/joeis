package irvine.math.group;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Unitary33Test extends TestCase {

  public void testU33() {
    final Unitary33 u33 = new Unitary33();
    assertEquals(Z.valueOf(6048), u33.size());
    assertFalse(u33.isAbelian());
    assertTrue(u33.isSimple());
    assertEquals("U_3(3)", u33.toString());
  }
}
