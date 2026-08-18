package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A397845 allocated for Mauro Fiorentini.
 * @author Sean A. Irvine
 */
public class A397845 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397845() {
    super(1, k -> Functions.FACTORIAL.z(k).add(Functions.MULTIFACTORIAL.z(k)).subtract(1).isProbablePrime());
  }
}
