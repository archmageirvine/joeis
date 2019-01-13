package irvine.math;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class WolframAutomataTest extends TestCase {

  public void test() {
    final WolframAutomata wa = new WolframAutomata(30);
    for (int k = 0; k < 100; ++k) {
      wa.next();
    }
    assertEquals("110010001110011110001111010000100010111011110110010010001010000011101000101000101011100101111101010001011111101010110001010000110101000101000110011000011110111100010110111101101101111001010101110010001", wa.toString());
  }
}
