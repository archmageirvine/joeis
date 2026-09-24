package irvine.oeis.a399;

import irvine.oeis.Combiner;
import irvine.oeis.a348.A348590;
import irvine.oeis.a350.A350134;

/**
 * A399943 allocated for M\u00e9lika Tebni.
 * @author Sean A. Irvine
 */
public class A399943 extends Combiner {

  /** Construct the sequence. */
  public A399943() {
    super(0, new A350134(), new A348590(), SUBTRACT);
  }
}
