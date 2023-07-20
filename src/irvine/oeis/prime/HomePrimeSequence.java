package irvine.oeis.prime;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * Generate home prime sequences.
 * @author Sean A. Irvine
 */
public class HomePrimeSequence extends Sequence1 {

  private final int mBase;
  private final boolean mTerminateOnPrime;
  private Z mA;
  private boolean mFirst = true;

  /**
   * Construct the home prime sequence for a given value.
   * @param start starting number
   * @param base base to expand in
   * @param terminateOnPrime stop once a prime is reached
   */
  public HomePrimeSequence(final long start, final int base, final boolean terminateOnPrime) {
    mA = Z.valueOf(start);
    mBase = base;
    mTerminateOnPrime = terminateOnPrime;
  }

  /**
   * Construct the home prime sequence for a given value.
   * @param start starting number
   */
  public HomePrimeSequence(final long start) {
    this(start, 10, true);
  }

  @Override
  public Z next() {
    if (mA == null) {
      return null;
    }
    if (mFirst) {
      mFirst = false;
      final Z res = mA;
      mA = mTerminateOnPrime && res.isProbablePrime() ? null : res;
      return res;
    }
    final StringBuilder sb = new StringBuilder();
    final FactorSequence fs = Jaguar.factor(mA);
    for (final Z p : fs.toZArray()) {
      final String rep = p.toString(mBase);
      for (int k = 0; k < fs.getExponent(p); ++k) {
        sb.append(rep);
      }
    }
    final Z res = new Z(sb, mBase);
    mA = mTerminateOnPrime && res.isProbablePrime() ? null : res;
    return res;
  }
}
