package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a033.A033950;

/**
 * A400850 allocated for Maxwell C. P. Brown.
 * @author Sean A. Irvine
 */
public class A400850 extends FilterSequence {

  /** Construct the sequence. */
  public A400850() {
    super(1, new A033950(), k -> {
      final Z dk = Functions.SIGMA0.z(k);
      return Functions.SIGMA0.z(k.divide(dk)).equals(Functions.SIGMA0.z(dk));
    });
  }
}
