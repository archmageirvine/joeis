package irvine.oeis.a399;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a000.A000290;

/**
 * A399603 allocated for Robert Israel.
 * @author Sean A. Irvine
 */
public class A399603 extends FilterSequence {

  /** Construct the sequence. */
  public A399603() {
    super(1, new A000290(), k -> Predicates.SQUARE.is(Functions.DIGIT_PRODUCT.z(k).add(Functions.DIGIT_SUM.l(k)).add(k)));
  }
}
