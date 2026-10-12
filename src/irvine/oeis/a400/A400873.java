package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.oeis.MultiplicativeSequence;

/**
 * A400873 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A400873 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A400873() {
    super(1, (p, e) -> Integers.SINGLETON.sumdiv(e, d -> Functions.SIGMA0.z(d).multiply(p.pow(e / d))));
  }
}
