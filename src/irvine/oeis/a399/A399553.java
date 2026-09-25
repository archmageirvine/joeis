package irvine.oeis.a399;

import irvine.oeis.a059.A059009;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A399553 a(n) is the least odd k such that neither k nor the odd part of k + 1 is yet in the sequence.
 * @author Sean A. Irvine
 */
public class A399553 extends SimpleTransformSequence {

  /** Construct the sequence. */
  public A399553() {
    super(1, new A059009(), k -> k.multiply2().add(1));
  }
}
