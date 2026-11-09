package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A401361 Numbers v such that the symmetric representation of sigma(v), SRS(v), consists of only unimodal parts.
 * @author Sean A. Irvine
 */
public class A401361 extends ComplementSequence {

  /** Construct the sequence. */
  public A401361() {
    super(1, Z.ONE, new A401362());
  }
}
