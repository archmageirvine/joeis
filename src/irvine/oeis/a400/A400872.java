package irvine.oeis.a400;

import irvine.oeis.DirectSequence;
import irvine.oeis.MultiplicativeSequence;
import irvine.oeis.a007.A007425;

/**
 * A400872 allocated for Amiram Eldar.
 * @author Sean A. Irvine
 */
public class A400872 extends MultiplicativeSequence {

  private static final DirectSequence A007425 = new A007425();

  /** Construct the sequence. */
  public A400872() {
    super(1, (p, e) -> A007425.a(e));
  }
}

