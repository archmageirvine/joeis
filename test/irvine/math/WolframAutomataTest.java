package irvine.math;

import irvine.oeis.WolframAutomata;
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
    assertEquals("100010011101010100111101101101111011010001111011110000110011000101000101011000010100011010101111110100010101111101001110101000101000101110000010100010010011011110111010001000010111100011110011100010011", wa.next().toString(2));
  }

  public void test137() {
    final WolframAutomata wa = new WolframAutomata(137);
    for (int k = 0; k < 10; ++k) {
      System.out.println(wa.next().toString(2));
    }
    assertEquals("1", wa.next().toString(2));
    assertEquals("0", wa.next().toString(2));
    assertEquals("101", wa.next().toString(2));
    assertEquals("11", wa.next().toString(2));
  }
}
