package irvine.oeis.prime;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A sequence of primes p that have Kronecker symbol (p|m) == 1.
 * Adapted from A038873: numbers k that are (not) squares mod p.
 * @author Georg Fischer
 */
public class KroneckerForm implements Sequence {

  private final Fast mFast;
  private long mP; // current prime number
  protected int mModulus; // parameter of the Kronecker symbol
  protected int mPolar; // desired value of the Kronecker symbol

  /**
   * Constructor with parameters.
   * @param modulus parameter of the Kronecker symbol
   * @param polar the desired value of the Kronecker symbol
   */
  public KroneckerForm(final int modulus, final int polar) {
    mP = 1L;
    mModulus = modulus;
    mPolar = polar;
    mFast = new Fast();
  }

  @Override
  public Z next() {
    while (true) {
      mP = mFast.nextPrime(mP);
      if (LongUtils.kronecker(mP, mModulus) == mPolar) {
        return Z.valueOf(mP);
      }
    }
  }
}
