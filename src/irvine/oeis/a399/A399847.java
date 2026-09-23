package irvine.oeis.a399;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000043;

/**
 * A399847 allocated for Frank M Jackson.
 * @author Sean A. Irvine
 */
public class A399847 extends FilterSequence {

  /** Construct the sequence. */
  public A399847() {
    super(1, new A000043(), k -> !Predicates.PRACTICAL.is(Z.ONE.shiftLeft(k.longValueExact()).subtract(2)));
  }
}
