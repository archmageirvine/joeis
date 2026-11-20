package irvine.oeis.a402;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A402136 allocated for Reid Beckett.
 * @author Sean A. Irvine
 */
public class A402136 extends FilterNumberSequence {

  private static final Z Z11 = Z.valueOf(11);

  /** Construct the sequence. */
  public A402136() {
    super(1, k -> Z11.pow(k).toString().contains(String.valueOf(11 * k)));
  }
}

