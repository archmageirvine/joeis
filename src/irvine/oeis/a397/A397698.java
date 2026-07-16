package irvine.oeis.a397;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397698 allocated for Ali Sada.
 * @author Sean A. Irvine
 */
public class A397698 extends Sequence1 {

  // After Michael S. Branicky

  private long mN = 0;

  protected Z select(final long best, final long bestPrime) {
    return Z.valueOf(best);
  }

  @Override
  public Z next() {
    final String s = Long.toString(++mN);
    long best = Long.MAX_VALUE;
    int bestExp = -1;
    long bestPrime = -1;
    for (int pos = 0; pos <= s.length(); ++pos) {
      final char start = pos == 0 ? '1' : '0';
      for (char d = start; d <= '9'; ++d) {
        final String t = s.substring(0, pos) + d + s.substring(pos);
        final long v = Long.parseLong(t);
        final FactorSequence fs = Jaguar.factor(v);
        int exp = -1;
        long prime = -1;
        for (final Z p : fs.toZArray()) {
          final int e = fs.getExponent(p);
          if (e > exp || (e == exp && p.longValue() > prime)) {
            exp = e;
            prime = p.longValue();
          }
        }
        if (exp > bestExp || (exp == bestExp && (prime > bestPrime || (prime == bestPrime && v < best)))) {
          bestExp = exp;
          bestPrime = prime;
          best = v;
        }
      }
    }
    return select(best, bestPrime);
  }
}
