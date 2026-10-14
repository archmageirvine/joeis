package irvine.oeis.a400;

import irvine.oeis.DirectSequence;
import irvine.oeis.MultiplicativeSequence;

/**
 * A400870 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A400870 extends MultiplicativeSequence {

  private static final DirectSequence SEQ = DirectSequence.create(new A400869());

  /** Construct the sequence. */
  public A400870() {
    super(1, (p, e) -> SEQ.a(e));
  }
}
