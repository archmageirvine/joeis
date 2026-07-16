package irvine.oeis.a397;

import irvine.oeis.DirectSequence;
import irvine.oeis.a003.A003557;
import irvine.oeis.a055.A055932;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A397499 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A397499 extends SimpleTransformSequence {

  private static final DirectSequence A003557 = new A003557();

  /** Construct the sequence. */
  public A397499() {
    super(1, new A055932(), A003557::a);
  }
}
