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

  /**
   * Enumeration of type of sequences that can be generated here.
   */
  public enum HomePrimeType {
    /** Ordinary home prime sequence where primes are repeated up to multiplicity. */
    HP,
    /** Version where <code>p^e</code> is <code>p</code> if <code>e=1</code> and <code>p, e</code> otherwise. */
    ALONSO,
    /** Version where <code>p^e</code> is <code>p, e</code>. */
    ALONSO_WITH_ONE
  }

  private final int mBase;
  private final boolean mTerminateOnPrime;
  private final HomePrimeType mType;
  private Z mA;
  private boolean mFirst = true;

  /**
   * Construct the home prime sequence for a given value.
   * @param start starting number
   * @param base base to expand in
   * @param terminateOnPrime stop once a prime is reached
   * @param type variant to be produced
   */
  public HomePrimeSequence(final long start, final int base, final boolean terminateOnPrime, final HomePrimeType type) {
    mA = Z.valueOf(start);
    mBase = base;
    mTerminateOnPrime = terminateOnPrime;
    mType = type;
  }

  /**
   * Construct the home prime sequence for a given value.
   * @param start starting number
   * @param base base to expand in
   * @param terminateOnPrime stop once a prime is reached
   */
  public HomePrimeSequence(final long start, final int base, final boolean terminateOnPrime) {
    this(start, base, terminateOnPrime, HomePrimeType.HP);
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
      switch (mType) {
        case HP:
          sb.append(String.valueOf(rep).repeat(e));
          break;
        case ALONSO:
          sb.append(rep);
          if (e > 1) {
            sb.append(Integer.toString(e, mBase));
          }
          break;
        case ALONSO_WITH_ONE:
          sb.append(rep).append(e);
          break;
        default:
          throw new RuntimeException();
      }
    }
    final Z res = new Z(sb, mBase);
    mA = mTerminateOnPrime && res.isProbablePrime() ? null : res;
    return res;
  }
}
