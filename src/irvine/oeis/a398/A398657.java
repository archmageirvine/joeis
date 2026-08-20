package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.MultiplicativeSequence;

/**
 * A398657 Lower (1, 3/2) midsequence of triangular numbers (A000217) and tetrahedral numbers (A000330); see Comments.
 * @author Sean A. Irvine
 */
public class A398657 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A398657() {
    super(1, (p, e) -> p.equals(Z.TWO) ? Z.TWO.pow(2L * e) : p.pow(2L * e - 2).multiply(p.square().subtract(3)));
  }
}

