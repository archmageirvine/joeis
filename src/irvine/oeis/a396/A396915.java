package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.oeis.FilterSequence;
import irvine.oeis.a005.A005117;

/**
 * A396915 Composite squarefree numbers k such that k' + 2*k is a perfect square, where k' is the arithmetic derivative of k (A003415).
 * @author Sean A. Irvine
 */
public class A396915 extends FilterSequence {

  /** Construct the sequence. */
  public A396915() {
    super(1, new A005117(), k -> Predicates.SQUARE.is(Functions.ARD.z(k).add(k.multiply2())));
  }
}
