package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A401901
 * @author Sean A. Irvine
 */
public class A401996 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A401996() {
    super(1, k -> {
      final Z s = Functions.SIGMA1.z(k);
      return Functions.BIG_OMEGA.l(k) == Functions.BIG_OMEGA.l(s) && Functions.SOPFR.z(k).equals(Functions.SOPFR.z(s));
    });
  }
}
