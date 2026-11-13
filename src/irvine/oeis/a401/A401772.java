package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.a398.A398731;

/**
 * A401772 Irregular triangle read by rows in which row n gives the congruences (mod 2^floor(1+n*log_2(7))) that have an admissible sequence of order n; related to 7x+1 problem.
 * @author Sean A. Irvine
 */
public class A401772 extends A398731 {

  /** Construct the sequence. */
  public A401772() {
    super(Z.SEVEN);
  }
}
