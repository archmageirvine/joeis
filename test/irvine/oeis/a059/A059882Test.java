package irvine.oeis.a059;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequenceTest;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class A059882Test extends AbstractSequenceTest {

  public void testT() {
    final A059882 seq = new A059882();
    assertEquals(Z.ONE, seq.mT.get(1L, 1L));
    assertEquals(Z.TWO, seq.mT.get(10L, 4L));
//
//    long m = 3;
//    for (long k = 1; k < 10; ++k) {
//      System.out.println(k + " " + m + " " + seq.mT.get(k, m));
//    }
  }
}
