package irvine.oeis.a400;

import irvine.oeis.Combiner;
import irvine.oeis.a018.A018804;
import irvine.oeis.a384.A384628;

/**
 * A400361 allocated for Ctibor O. Zizka.
 * @author Sean A. Irvine
 */
public class A400361 extends Combiner {

  /** Construct the sequence. */
  public A400361() {
    super(1, new A018804(), new A384628(), SUBTRACT);
  }
}
