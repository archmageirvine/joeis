package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A399306 allocated for Geoffrey Caveney.
 * @author Sean A. Irvine
 */
public class A399306 extends ComplementSequence {

  /** Construct the sequence. */
  public A399306() {
    super(1, Z.ONE, new A399305());
  }
}
