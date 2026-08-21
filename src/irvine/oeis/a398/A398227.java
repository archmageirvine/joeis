package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.ComplementSequence;

/**
 * A398227 Nonnegative numbers that are not the sum of two Lucas numbers.
 * @author Sean A. Irvine
 */
public class A398227 extends ComplementSequence {

  /** Construct the sequence. */
  public A398227() {
    super(1, Z.ZERO, new A398228());
  }
}
