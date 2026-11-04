package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A401360 allocated for Rok Cestnik.
 * @author Sean A. Irvine
 */
public class A401360 extends ComplementSequence {

  /** Construct the sequence. */
  public A401360() {
    super(1, Z.ONE, new A401362());
  }
}
