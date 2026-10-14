package irvine.oeis.a400;

import irvine.oeis.DirectSequence;
import irvine.oeis.MultiplicativeSequence;
import irvine.oeis.a385.A385429;

/**
 * A400871 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A400871 extends MultiplicativeSequence {

  private static final DirectSequence SEQ = DirectSequence.create(new A385429());

  /** Construct the sequence. */
  public A400871() {
    super(1, (p, e) -> SEQ.a(e));
  }
}

