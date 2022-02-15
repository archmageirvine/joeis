package irvine.oeis.prime;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Superclass for sequences that require a condition on a limited number of consecutive primes.
 * The primes are stored in a ring buffer of size 16.
 * The class maintains the set of consecutive primes, their differences, and the index (prime#) of the first prime in the set.
 * @author Georg Fischer
 */
public class ConsecutiveSequence implements Sequence {

  protected final Fast mFastPrime = new Fast();
  protected Z mP; // current prime
  protected Z mP1; // prime after mP
  protected Z[] mTerms; // circular buffer for primes
  protected long[] mDiffs; // circular buffer for differences: mDiffs[n] = mTerms[n] - mTerms[n-1]
  protected int mTermIx; // take this term as result: 0 for first, 1 for second term in the set etc.
  protected int mPix; // index in mTerms, rotates between 0 and mMask: store next prime here
  protected int mCix; // index in mTerms, rotates between 0 and mMask: start comparisions here
  protected int mMask; // for circular stepping in mTerms and mDiffs
  protected int mPrimeNo; // number of the prime mTerms[mCix];

  /** 
   * Construct the sequence, take the first term as result.
   */
  public ConsecutiveSequence() {
    this(1);
  }

  /**
   * Construct with a specified term number and default circular buffer size.
   * @param termNo take this term as result: 1 for first, 2 for second
   */
  public ConsecutiveSequence(final int termNo) {
    this(termNo, 16);
  }
  
  /**
   * Construct with specified term number and size.
   * @param termNo take this term as result: 1 for first, 2 for second
   * @param cLen size of the circular buffers
   */
  public ConsecutiveSequence(final int termNo, final int cLen) {
    mTermIx = termNo - 1;
    mTerms = new Z[cLen];
    mDiffs = new long[mTerms.length];
    mMask = cLen - 1;
    mPix = 0; 
    mP = Z.ONE;
    mCix = 0;
    while (mPix < mMask - 1) { // prefill the buffers, except for the last element
      advance();
    }
    mCix = -1;
    mPrimeNo = 0;
  }

  /**
   * Fill the next prime into the ring buffers and increment the indexes.
   */
  protected void advance() {
    mCix = ++mCix & mMask;
    mP1 = mFastPrime.nextPrime(mP);
    ++mPrimeNo;
    mTerms[mPix] = mP1;
    mDiffs[mPix] = mP1.subtract(mP).longValue();
    mPix = ++mPix & mMask;
    mP = mP1;
  }

  @Override
  public Z next() {
    advance();
    while (! condition()) {
      advance();
    }
    return mTerms[(mCix + mTermIx) & mMask];
  }

  /**
   * Evaluate the condition.
   * The set of consecutive primes starts at index {@link #mCix}.
   * Buffer element indexes must always be taken modulo <code>cLen</code>.
   * @return true if the condition is fulfilled (default implementation).
   */
  protected boolean condition() {
    return true;
  } 
}
