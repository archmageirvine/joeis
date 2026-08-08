package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.oeis.a007.A007318;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A397713 allocated for Benjamin N. Noworolski.
 * @author Sean A. Irvine
 */
public class A397713 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A397713() {
    super(0, new A007318(), k -> Functions.DIGIT_LENGTH.z(2, k));
  }
}
