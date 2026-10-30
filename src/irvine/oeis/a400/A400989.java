package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.bumper.Bumper;
import irvine.util.bumper.BumperFactory;

/**
 * A400989 Numbers that can be written from base 2 to base 17 using only the digits 0 to 9.
 * @author Sean A. Irvine
 */
public class A400989 extends Sequence1 {

  private final int mMaxBase;
  private final int mMaxDigit;
  private final long mSyndomeMask;
  private final Bumper mBumper;
  private int[] mA = {0};
  private Z mPrev = Z.NEG_ONE;

  protected A400989(final int maxBase, final int maxDigit) {
    mMaxBase = maxBase;
    mMaxDigit = maxDigit;
    mSyndomeMask = (1L << (maxDigit + 1)) - 1;
    mBumper = BumperFactory.range(0, maxDigit);
  }

  /** Construct the sequence. */
  public A400989() {
    this(17, 9);
  }

  private boolean is(final Z v) {
    // All bases <= mMaxDigit cannot contain a digit >= mMaxDigit
    // Check remaining bases
    for (int b = mMaxDigit + 1; b < mMaxBase; ++b) {
      final long syn = Functions.SYNDROME.l(b, v);
      if ((syn & mSyndomeMask) != syn) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      do {
        // Compute value of mA in mMaxBase (by construction all digits <= mMaxDigit
        Z v = Z.ZERO;
        for (final int t : mA) {
          v = v.multiply(mMaxBase).add(t);
        }
        // Test base constraints
        // mPrev is used to ensure we step correctly after reporting a value
        if (!v.equals(mPrev) && is(v)) {
          mPrev = v;
          return v;
        }
      } while (mBumper.bump(mA));
      // Need to make mA longer
      mA = new int[mA.length + 1];
      mA[0] = 1; // numbers starting 1000...
    }
  }
}
