package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a008.A008846;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A399705 a(n) is 1 if A008846(n) is congruent to 5 modulo 8, and 0 if A008846(n) is congruent to 1 modulo 8.
 * @author Sean A. Irvine
 */
public class A399705 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A399705() {
    super(1, new A008846(), k -> k.subtract(1).testBit(2) ? Z.ONE : Z.ZERO);
  }
}
