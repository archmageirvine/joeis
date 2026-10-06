package irvine.oeis.a397;

import irvine.oeis.gf.EgfSequence;

/**
 * A397246 Number of partitions of an n-element labeled set into linearly ordered blocks of sizes 1, 3, or 7.
 * @author Sean A. Irvine
 */
public class A397246 extends EgfSequence {

  /** Construct the sequence. */
  public A397246() {
    super(0, "exp(x + x^3 + x^7)");
  }
}
