package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A397410 allocated for Michael Shmoish.
 * @author Sean A. Irvine
 */
public class A397410 extends TwoParameterFormSequence {

  /** Construct the sequence. */
  public A397410() {
    super(1, 1, 1, (j, k) -> Functions.PRIME.z(j).square().add(Functions.PRIME.z(k).multiply2()));
  }

  @Override
  protected boolean accept(final long x, final long y, final Z n, final Z prev) {
    return super.accept(x, y, n, prev) && n.isProbablePrime();
  }
}
