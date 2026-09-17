package irvine.oeis.a399;

import irvine.oeis.MultiplicativeSequence;

/**
 * A137526.
 * @author Sean A. Irvine
 */
public class A399834 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A399834() {
    super(1, (p, e) -> e == 2 || (e & 1) == 1 ? p.pow(e + 1).subtract(1).divide(p.subtract(1)) : p.pow(e + 1).subtract(1).divide(p.subtract(1)).subtract(p.pow(e / 2)));
  }
}

