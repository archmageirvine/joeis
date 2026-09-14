package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.a008.A008846;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A399705 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A399705 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A399705() {
    super(1, new A008846(), k -> k.subtract(1).testBit(2) ? Z.ONE : Z.ZERO);
  }
}
