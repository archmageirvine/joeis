package irvine.oeis.a211;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A211318Test extends TestCase {

  public void testB() {
    assertEquals(Z.ONE, A211318.b(1, 1, 1, 1));
    assertEquals(Z.ONE, A211318.b(1, 2, 1, 1));
    assertEquals(Z.ZERO, A211318.b(2, 2, 1, 1));
    assertEquals(Z.TWO, A211318.b(3, 2, 1, 1));
    assertEquals(Z.valueOf(16), A211318.b(5, 2, 1, 1));
    assertEquals(Z.valueOf(272), A211318.b(7, 2, 1, 1));
    assertEquals(Z.ONE, A211318.b(1, 2, 1, 2));
    assertEquals(Z.valueOf(7936), A211318.b(9, 2, 1, 2));
    assertEquals(Z.valueOf(7936), A211318.b(9, 2, 2, 1));
    assertEquals(Z.valueOf(15872), A211318.b(9, 2, 2, 2));
    assertEquals(Z.valueOf(150), A211318.b(6, 3, 1, 1));
    assertEquals(Z.valueOf(11463), A211318.b(8, 3, 2, 1));
    assertEquals(Z.valueOf(19888), A211318.b(8, 3, 2, 2));
    assertEquals(Z.valueOf(23122), A211318.b(8, 3, 3, 2));
    assertEquals(Z.valueOf(23122), A211318.b(8, 3, 2, 3));
    assertEquals(Z.valueOf(26986), A211318.b(8, 3, 3, 3));
    assertEquals(Z.valueOf(5405530), A211318.b(12, 2, 2, 2));
    assertEquals(Z.valueOf(224458), A211318.b(9, 3, 3, 3));
    assertEquals(Z.valueOf(4816), A211318.b(7, 4, 4, 4));
    assertEquals(Z.valueOf(40016), A211318.b(8, 5, 5, 5));
  }
}
