package irvine.oeis.a400;

import irvine.oeis.MultiplicativeSequence;

/**
 * A002862.
 * @author Sean A. Irvine
 */
public class A400144 extends MultiplicativeSequence {

  /** Construct the sequence. */
  public A400144() {
    super(1, (p, e) -> (e & 1) == 1
        ? p.pow(e + 1).subtract(1).divide(p.subtract(1))
        : p.pow(e + 1).subtract(1).divide(p.subtract(1)).subtract(p.pow(e).subtract(1).multiply(p).divide(p.square().subtract(1)))
      );
  }
}

