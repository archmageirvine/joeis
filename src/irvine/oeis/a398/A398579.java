package irvine.oeis.a398;
// manually 2026-09-08/rowsum at 2026-09-08 22: 02

import irvine.oeis.PrependSequence;
import irvine.oeis.a399.A399444;
import irvine.oeis.triangle.RowSumSequence;

/**
 * A398579 Number of complete non-ambiguous trees with n leaves whose maximum weight is 0.
 * @author Georg Fischer
 */
public class A398579 extends PrependSequence {

  /** Construct the sequence. */
  public A398579() {
    super(0, new RowSumSequence(0, new A399444()).skip(1), 0, 1);
  }
}
