package irvine.oeis.a401;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A401992 allocated for Yu Chu.
 * @author Sean A. Irvine
 */
public class A401992 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A401992() {
    super(1, 0, k -> Z.valueOf(k).shiftLeft(k).add(7).isProbablePrime());
  }
}
