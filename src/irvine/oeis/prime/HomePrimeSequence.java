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
  private final boolean mAlonso;
  private Z mA;
  private boolean mFirst = true;

  /**
   * Construct the home prime sequence for a given value.
   * @param start starting number
   * @param base base to expand in
   * @param terminateOnPrime stop once a prime is reached
   * @param alonso perform the Alonso del Arte variant
   */
  public HomePrimeSequence(final long start, final int base, final boolean terminateOnPrime, final boolean alonso) {
    mA = Z.valueOf(start);
    mBase = base;
    mTerminateOnPrime = terminateOnPrime;
    mAlonso = alonso;
  }

  /**
   * Construct the home prime sequence for a given value.
   * @param start starting number
   * @param base base to expand in
   * @param terminateOnPrime stop once a prime is reached
   */
  public HomePrimeSequence(final long start, final int base, final boolean terminateOnPrime) {
    this(start, base, terminateOnPrime, false);
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
      final int e = fs.getExponent(p);
      final String rep = p.toString(mBase);
      if (mAlonso) {
        sb.append(rep);
        if (e > 1) {
          sb.append(Integer.toString(e, mBase));
        }
      } else {
        sb.append(String.valueOf(rep).repeat(e));
      }
    }
    final Z res = new Z(sb, mBase);
    mA = mTerminateOnPrime && res.isProbablePrime() ? null : res;
    return res;
  }
}
