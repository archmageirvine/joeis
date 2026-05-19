package irvine.oeis.a396;

import irvine.oeis.InverseSequence;
import irvine.oeis.a370.A370470;

/**
 * A396014 Position of the first occurrence of n in A370470.
 * @author Sean A. Irvine
 */
public class A396014 extends InverseSequence {

  /** Construct the sequence. */
  public A396014() {
    super(1, new A370470());
  }
}
