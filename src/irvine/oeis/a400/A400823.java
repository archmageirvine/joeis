package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.FilterNumberSequence;

/**
 * A400823 Number of Type C megastars of generation 1 (single minor star triples, MC(1)) in the level-n supertile of the Spectre tiling.
 * @author Sean A. Irvine
 */
public class A400823 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A400823() {
    super(1, k -> Z.ONE.shiftLeft(k).subtract(1).shiftLeft(k + 4).add(1).isProbablePrime());
  }
}
