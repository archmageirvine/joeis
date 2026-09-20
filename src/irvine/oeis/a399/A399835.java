package irvine.oeis.a399;

import irvine.oeis.MultiplicativeSequence;

/**
 * A397121.
 * @author Sean A. Irvine
 */
public class A399835 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A399835() {
    super(1, (p, e) -> e == 2
      ? p.square().add(1)
      : p.pow(e + 1).subtract(1).divide(p.subtract(1)));
  }
}
