package irvine.oeis.a398;

import irvine.math.function.Functions;
import irvine.oeis.FilterSequence;
import irvine.oeis.a009.A009996;

/**
 * A398453 allocated for Bernard Schott.
 * @author Sean A. Irvine
 */
public class A398453 extends FilterSequence {

  /** Construct the sequence. */
  public A398453() {
    super(1, new A009996(), k -> Functions.DIGIT_SORT_DESCENDING.z(k.square()).equals(k.square()));
  }
}
