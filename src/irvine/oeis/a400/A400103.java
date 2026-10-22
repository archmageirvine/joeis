package irvine.oeis.a400;

import irvine.oeis.gf.EgfSequence;

/**
 * A400103 allocated for M\u00e9lika Tebni.
 * @author Sean A. Irvine
 */
public class A400103 extends EgfSequence {

  /** Construct the sequence. */
  public A400103() {
    super(0, "(1-exp(x))*log(1+LambertW(-x))+(1-x)*exp(x)-1");
  }
}
