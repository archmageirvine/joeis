package irvine.oeis.a400;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A400399 Value of k that maximizes P(X &lt; Y), where X and Y are independent binomial random variables with k trials and success probabilities 1/n and 1/(2*n), respectively. In case of ties, choose the largest k.
 * @author Sean A. Irvine
 */
public class A400399 extends Sequence2 {

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long result;
    final Z a = Z.valueOf(2 * mN - 1);
    final Z b = Z.valueOf(mN - 1);
    final Z c = Z.valueOf(2 * mN * mN - 3 * mN + 2);

    // w[j + k] is the integer weight for X - Y = j after k trials. The common denominator is (2*n*n)^k
    Z[] w = {Z.ONE};
    long k = 0;

    while (true) {
      final Z w0 = w[(int) k];
      final Z wm1 = k == 0 ? Z.ZERO : w[(int) k - 1];

      // Sign of P(X < Y) at k+1 minus P(X < Y) at k
      final Z delta = b.multiply(w0).subtract(a.multiply(wm1));

      // A negative difference means k is the maximizer, provided the objective is unimodal
      if (delta.signum() < 0) {
        result = k;
        break;
      }

      // Extend the distribution from k trials to k+1 trials
      final Z[] v = new Z[w.length + 2];
      for (int i = 0; i < v.length; ++i) {
        Z s = Z.ZERO;
        if (i >= 2) {
          s = s.add(a.multiply(w[i - 2]));
        }
        if (i >= 1 && i - 1 < w.length) {
          s = s.add(c.multiply(w[i - 1]));
        }
        if (i < w.length) {
          s = s.add(b.multiply(w[i]));
        }
        v[i] = s;
      }
      w = v;
      ++k;
    }
    return Z.valueOf(result);
  }
}
