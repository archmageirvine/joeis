package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.RecordPositionSequence;
import irvine.oeis.a339.A339558;

/**
 * A398377 allocated for Roberto Cicero Kfouri.
 * @author Sean A. Irvine
 */
public class A398377 extends RecordPositionSequence {

  /** Construct the sequence. */
  public A398377() {
    super(1, 1, new A339558());
  }

  @Override
  public Z next() {
    return super.next().multiply2();
  }
}
