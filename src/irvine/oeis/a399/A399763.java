package irvine.oeis.a399;

import irvine.oeis.InverseSequence;

/**
 * A399763 a(n) = index of first appearance of a building of height n in the city-building sequence A399633, or -1 if no building has height n.
 * @author Sean A. Irvine
 */
public class A399763 extends InverseSequence {

  /** Construct the sequence. */
  public A399763() {
    super(0, 0, new A399633());
  }
}
