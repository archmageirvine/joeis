package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A400823 allocated for Boris K. Horvat.
 * @author Sean A. Irvine
 */
public class A400823 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400823() {
    super(1, k -> Z.ONE.shiftLeft(k).subtract(1).shiftLeft(k + 4).add(1).isProbablePrime());
  }
}
