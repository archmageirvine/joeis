package irvine.oeis.a396;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a031.A031924;

/**
 * A396234 allocated for Harry E. Neel.
 * @author Sean A. Irvine
 */
public class A396234 extends FilterSequence {

  private static boolean is(final Z p) {
    Z k = Functions.DIGIT_SUM_SQUARES.z(p);
    if (!k.isProbablePrime()) {
      return false;
    }
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(k)) {
      if (k.isOne()) {
        return true;
      }
      k = Functions.DIGIT_SUM_SQUARES.z(k);
    }
    return false;
  }

  /** Construct the sequence. */
  public A396234() {
    super(1, new A031924(), p -> is(p) && is(p.add(6)));
  }
}
