package irvine.oeis.a400;

import irvine.oeis.FilterSequence;
import irvine.oeis.a002.A002808;

/**
 * A400957 Pillai composite numbers: composite numbers c such that there exists an integer m with m! + 1 == 0 (mod c) and c != 1 (mod m).
 * @author Sean A. Irvine
 */
public class A400957 extends FilterSequence {

  /** Construct the sequence. */
  public A400957() {
    super(1, new A002808(), cc -> {
      final long c = cc.longValueExact();
      long f = 1;
      for (long m = 2; m < c; ++m) {
        f *= m;
        f %= c;
        if (f == c - 1 && c % m != 1) {
          return true;
        }
      }
      return false;
    });
  }
}

