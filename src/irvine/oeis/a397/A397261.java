package irvine.oeis.a397;

import irvine.oeis.RecordSequence;
import irvine.oeis.a093.A093811;

/**
 * A397261 Records in A093811.
 * @author Sean A. Irvine
 */
public class A397261 extends RecordSequence {

  /** Construct the sequence. */
  public A397261() {
    super(1, new A093811());
  }
}
