package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A399828 The number of divisors d of n such that gcud(d, n/d) is squarefree, where gcud is the greatest common unitary divisor.
 * @author Sean A. Irvine
 */
public class A399828 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A399828() {
    super(1, (p, e) -> e <= 2 ? Z.valueOf(e + 1) : Z.valueOf(e + (e & 1)));
  }
}

