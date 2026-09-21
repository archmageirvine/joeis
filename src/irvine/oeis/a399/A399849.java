package irvine.oeis.a399;

import irvine.oeis.gf.EgfSequence;

/**
 * A399849 Expansion of e.g.f. log((1 - log(1+x))/(1 - 2*log(1+x)))/(1 - log(1+x)).
 * @author Sean A. Irvine
 */
public class A399849 extends EgfSequence {

  /** Construct the sequence. */
  public A399849() {
    super(0, "log((1 - log(1+x))/(1 - 2*log(1+x)))/(1 - log(1+x))");
  }
}

