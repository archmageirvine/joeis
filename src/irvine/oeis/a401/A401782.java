package irvine.oeis.a401;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A401782 allocated for Vaibhav Kodag.
 * @author Sean A. Irvine
 */
public class A401782 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A401782() {
    super(1, k -> Functions.SOPFR.z(k).equals(Functions.SOPFR.z(3 * k + 1)));
  }
}

