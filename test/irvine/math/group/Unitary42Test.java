package irvine.math.group;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class Unitary42Test extends TestCase {

  public void testU42() {
    final Unitary42 u = new Unitary42();
    assertEquals(Z.valueOf(25920), u.size());
    assertFalse(u.isAbelian());
    assertTrue(u.isSimple());
    assertEquals("U_4(2)", u.toString());
  }
}
