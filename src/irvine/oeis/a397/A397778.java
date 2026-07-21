package irvine.oeis.a397;

import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a056.A056137;

/**
 * A397778 allocated for Richard R. Forberg.
 * @author Sean A. Irvine
 */
public class A397778 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A397778() {
    super(1, 1, new A056137());
    skip();
  }
}
