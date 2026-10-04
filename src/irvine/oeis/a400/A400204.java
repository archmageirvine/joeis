package irvine.oeis.a400;

import irvine.oeis.PrependSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A400204 Minimum perimeter of a right-angled triangle with integer sides whose area is divisible by the n-th prime.
 * @author Sean A. Irvine
 */
public class A400204 extends PrependSequence {

  /** Construct the sequence. */
  public A400204() {
    super(1, new SimpleTransformSequence(new A000040().skip(4), k -> k.multiply(12)), 12, 12, 30, 56);
  }
}
