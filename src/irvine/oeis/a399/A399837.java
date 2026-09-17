package irvine.oeis.a399;

import irvine.oeis.MultiplicativeSequence;

/**
 * A137526.
 * @author Sean A. Irvine
 */
public class A399837 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A399837() {
    super(1, (p, e) -> (e & 3) != 0 ? p.pow(e + 1).subtract(1).divide(p.subtract(1)) : p.pow(e + 1).subtract(1).divide(p.subtract(1)).subtract(p.pow(e / 2)));
  }
}
