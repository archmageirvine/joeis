package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.FilterSequence;
import irvine.oeis.a001.A001055;
import irvine.oeis.a002.A002808;

/**
 * A398817 allocated for Jishnu Babu Ranitha.
 * @author Sean A. Irvine
 */
public class A398817 extends FilterSequence {

  private static final DirectSequence S = new A001055();

  /** Construct the sequence. */
  public A398817() {
    super(1, new A002808(), k -> {
      final Z t = S.a(k);
      if (t.isOne()) {
        return false;
      }
      final Z u = S.a(t);
      if (u.isOne()) {
        return false;
      }
      return S.a(u).isOne();
    });
  }
}
