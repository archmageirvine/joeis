package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A397148 Numbers k such that k + omega(k) is prime.
 * @author Sean A. Irvine
 */
public class A397148 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397148() {
    super(1, k -> Functions.OMEGA.z(k).add(k).isProbablePrime());
  }
}
