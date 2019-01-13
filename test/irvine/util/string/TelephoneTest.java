package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class TelephoneTest extends TestCase {

  public void testDial() {
    assertEquals(6, Telephone.dial('o'));
    assertEquals(6, Telephone.dial('n'));
    assertEquals(3, Telephone.dial('e'));
    assertEquals(8, Telephone.dial('T'));
    assertEquals(9, Telephone.dial('W'));
    assertEquals(7, Telephone.dial('R'));
    assertEquals(2, Telephone.dial('A'));
    assertEquals(2, Telephone.dial('a'));
    assertEquals(9, Telephone.dial('Z'));
    assertEquals(9, Telephone.dial('z'));
    assertEquals(0, Telephone.dial('0'));
    assertEquals(-1, Telephone.dial(' '));
  }

  public void testDialString() {
    assertEquals("663", Telephone.dial("O-ne"));
    assertEquals("84733", Telephone.dial("  *thrEE\n"));
  }

  public void testDialSum() {
    assertEquals(26, Telephone.dialSum("HOBBIT!"));
  }
}
