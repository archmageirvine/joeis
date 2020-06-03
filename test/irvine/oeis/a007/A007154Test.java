package irvine.oeis.a007;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A007154Test extends TestCase {

  public void testComplement() {
    assertEquals(0b110100, A007154.complement(0b000111, 3));
    assertEquals(0b111111010101000000111111010101000000111111010101000000L, A007154.complement(0b000000010101111111000000010101111111000000010101111111L, 27));
  }
}
