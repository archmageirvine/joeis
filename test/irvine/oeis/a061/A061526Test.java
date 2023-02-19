package irvine.oeis.a061;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A061526Test extends TestCase {

  public void testBta() {
    final A061526 seq = new A061526();
    assertEquals(Z.NINE, seq.bta(3, 5, 4, 2));
    assertEquals(Z.valueOf(360), seq.bta(3, 4, 4, 1));
    assertEquals(Z.valueOf(529539120), seq.bta(6, 18, 17, 2));
  }

  public void testBtb() {
    final A061526 seq = new A061526();
    assertEquals(Z.valueOf(144210000), seq.btb(6, 18, 17, 2));
  }

  public void testBtc() {
    final A061526 seq = new A061526();
    assertEquals(Z.valueOf(141960), seq.btc(5, 11, 10, 2));
    assertEquals(Z.valueOf(3230304), seq.btc(6, 18, 17, 2));
  }

  public void testBtd() {
    final A061526 seq = new A061526();
    assertEquals(Z.valueOf(973496160), seq.btd(6, 18, 17, 2));
  }

}
