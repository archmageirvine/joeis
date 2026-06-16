package irvine.oeis.a395;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;

/**
 * A395865 allocated for Zhuorui He.
 * @author Sean A. Irvine
 */
public class A395865 extends FiniteSequence {

  private static long[] build() {
    final String s = Z.ONE.shiftLeft(1024).subtract(Z.ONE.shiftLeft(971)).toString();
    final long[] d = new long[s.length()];
    for (int k = 0; k < s.length(); ++k) {
      d[k] = s.charAt(k) - '0';
    }
    return d;
  }

  /** Construct the sequence. */
  public A395865() {
    super(309, FINITE, build());
  }
}
