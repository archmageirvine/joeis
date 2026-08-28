package irvine.oeis.a398;

import irvine.math.z.Binomial;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A398809 allocated for Soslan Daurov.
 * @author Sean A. Irvine
 */
public class A398809 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A398809() {
    super(1, (p, e) -> Integers.SINGLETON.sum(0, Math.min(3, e), j -> Z.NEG_ONE.pow(j).multiply(Binomial.binomial(3, j)).multiply(Binomial.binomial(e - j + 3, 3)).multiply(p.pow(e - j))));
  }
}

