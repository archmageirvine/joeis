package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A400468 Numbers k such that k+1 divides phi(k)^2, where phi is Euler's totient function (A000010).
 * @author Sean A. Irvine
 */
public class A400468 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400468() {
    super(1, k -> Functions.PHI.z(k).modPow(2, Z.valueOf(k + 1)).isZero());
  }
}

