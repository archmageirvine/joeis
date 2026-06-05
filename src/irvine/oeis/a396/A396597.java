package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.ThreeParameterFormSequence;

/**
 * A396597 allocated for Vincenzo Manto.
 * @author Sean A. Irvine
 */
public class A396597 extends ThreeParameterFormSequence {

  // todo sequence defn is wrong?

  /** Construct the sequence. */
  public A396597() {
    super(1, 2, 1, 1, (p, q, e) -> Functions.PRIME.z(p).compareTo(Functions.PRIME.z(q).pow(e)) > 0 ? Functions.PRIME.z(q).pow(e).multiply(Functions.PRIME.z(p)) : null);
  }
}
