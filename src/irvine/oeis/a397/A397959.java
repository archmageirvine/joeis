package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FiniteSequence;

/**
 * A397959 allocated for Paolo Xausa.
 * @author Sean A. Irvine
 */
public class A397959 extends FiniteSequence {

  /** Construct the sequence. */
  public A397959() {
    super(1, FINITE, A397953.polydivisible(9));
    System.out.println(Functions.PREV_PRIME.z(0));
  }
}
