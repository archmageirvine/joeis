package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A397686 Multiplicative with a(p^e) = (e+1)*(e+2)*(2*e+1)/2.
 * @author Sean A. Irvine
 */
public class A397686 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A397686() {
    super(1, (p, e) -> Z.valueOf(e + 1).multiply(e + 2).multiply(2L * e + 1).divide2());
  }
}
