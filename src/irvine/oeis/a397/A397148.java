package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.FilterNumberSequence;

/**
 * A397148 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A397148 extends FilterNumberSequence {

  /** Construct the sequence. */
  public A397148() {
    super(1, k -> Functions.OMEGA.z(k).add(k).isProbablePrime());
  }
}
