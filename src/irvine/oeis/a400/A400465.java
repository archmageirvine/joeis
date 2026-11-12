package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a060.A060687;

/**
 * A400465 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A400465 extends FilterSequence {

  /** Construct the sequence. */
  public A400465() {
    super(1, new A060687(), k -> !k.mod(Functions.LPF.z(k).square()).isZero());
  }
}
