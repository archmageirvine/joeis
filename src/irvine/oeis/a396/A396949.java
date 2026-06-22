package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A396949 Integers k such that omega(k) + Omega(k) = sopf(k), where omega is the number of distinct prime factors (A001221), Omega is the number of prime factors with multiplicity (A001222), and sopf is the sum of the distinct prime factors (A008472).
 * @author Sean A. Irvine
 */
public class A396949 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A396949() {
    super(1, k -> Functions.OMEGA.l(k) + Functions.BIG_OMEGA.l(k) == Functions.SOPF.l(k));
  }
}
