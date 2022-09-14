package irvine.oeis.base;

import java.util.TreeSet;

import irvine.math.z.QuadraticCongruence;
import irvine.math.z.Z;
import irvine.oeis.SequenceWithOffset;

/**
 * A sequences that enumerates numbers that are formed by the concatenation of two numbers,
 * and that are the product of two other numbers, with conditions on both pairs.
 * @author Georg Fischer
 */
public class ConcatenatedProductSequence implements SequenceWithOffset {

  private static final boolean VERBOSE = "true".equals(System.getProperty("oeis.verbose"));
  private static final long LIMIT = 100L; // use simple long arithmetic
  private final boolean mReturnConc; // true to yield base of the concatenation, false to yield base of the product
  private final boolean mAdditive; // true for additive, false for multiplicative modification of concatenation parts
  private final int mIncr1; // add/multiply this to the first value of the concatenation.
  private final int mIncr2; // add/multiply this to the second value of the concatenation.
  private final int mDist; // distance of the two factors of the resulting product (0 = square).
  private int mLevel; // 0 for long algorithm, 1 for msolve algorithm
  private long mLP; // unmodified factor of the product
  private long mLC; // unmodified part of the concatenation
  private long mLShift; // power of 10 for the shifting of the left concatenation part
  protected int mOffset; // first index
  private Z mPow10; // determines the width of the left concatenation number k resp. k+mIncr1 resp. k*mIncr1
  private TreeSet<Z> mGood;

  /**
   * Construct the sequence.
   * @param offset first index
   * @param mode a two-letter code for the type of operation:
   * 'c' = the result is the concatenated base number
   * 'p' = the result is the base of the product
   * 'a' = additive modification of concatenation parts
   * 'm' = multiplicative modification of concatenation parts
   * @param conc1 add/multiply this to the first part of the concatenation.
   * @param conc2 add/multiply this to the second part of the concatenation.
   * @param dist distance of the two factors of the resulting product (0 = square).
   */
  public ConcatenatedProductSequence(final int offset, final String mode, final int conc1, final int conc2, final int dist) {
    mOffset = offset;
    mReturnConc = mode.indexOf('c') >= 0;
    mAdditive = mode.indexOf('a') >= 0;
    mIncr1 = conc1;
    mIncr2 = conc2;
    mDist = dist;
    mLP = 1;
    if (mAdditive) {
      mLC = conc2 == 0 ? 1 : (conc2 > 0 ? 0 : - conc2);
    } else {
      mLC = 1;
    }
    mLShift = 10;
    final long right = mAdditive ? mLC + mIncr2 : mLC * mIncr2;
    while (mLShift <= right) {
      mLShift *= 10;
    } // now mLShift > right
    mLevel = 0; // start with simple long algorithm
  }

  @Override
  public int getOffset() {
    return mOffset;
  }

  @Override
  public Z next() {
    while (true) {
      switch (mLevel) {
        case 0: // compute initial terms with long arithmetic and an algorithm along the description
          while (mLP <= LIMIT) {
            final long prod = mLP * (mLP + mDist);
            final String s = String.valueOf(prod);
            final int slen = s.length();
            final int h = ((slen & 1) == 0) ? slen / 2 : (mIncr1 < mIncr2 ? slen / 2 : (slen + 1) / 2);
            if (slen > 1) {
              final String his = s.substring(0, h);
              final String los = s.substring(h);
              if (!los.isEmpty() && !his.isEmpty() && los.charAt(0) != '0') {
                long hi = 0;
                long lo = 0;
                try {
                  hi = Long.parseLong(his);
                  lo = Long.parseLong(los);
                  if (VERBOSE) {
                    System.out.println((mAdditive ? "+ " : "* ") + " mLP=" + mLP + ", conc=" + (hi + mIncr1) + "||" + (lo + mIncr2) + ", prod=" + prod + ", mDist=" + mDist + ", mIncr1=" + mIncr1 + ", mIncr2=" + mIncr2);
                  }
                  if (mAdditive ? (hi + mIncr2 == lo + mIncr1) : (hi * mIncr2 == lo * mIncr1)) {
                    final Z result = Z.valueOf(mReturnConc ? (mIncr1 == (mAdditive ? 0 : 1) ? hi : lo) : mLP);
                    ++mLP;
                    return result;
                  }
                } catch (final RuntimeException exc) {
                  System.out.println("exception, s=" + s + ", h=" + h + ", mLP=" + mLP);
                }
              }
            }
            ++mLP;
          }
          mLevel = mAdditive ? 1 : 2;
          mPow10 = Z.valueOf(LIMIT);
          mGood = new TreeSet<>();
          break;
  
        case 1: // additive: continue with an algorithm using Maple.msolve
          /*
            A116170 Numbers k such that k concatenated with k+2 gives the product of two numbers which differ by 1.
            590, 738, 830, 1080, 4508, 20660, 29754, 980300, 6694218, 49826988, 117738578, 131505858, 132231404, 176445054, 177285320, 247979808, 252028388, 335180054, 336337790, 404958680, 406231130, 431477468, 499519478 (list; graph; refs; listen; history; edit; text; internal format)
            As:= {}:
            for m from 2 to 12 do
               acands:= map(t -> rhs(op(t)), [msolve(a*(a+1)=2, 10^m+1)]);
               bcands:= map(t -> t*(t+1) mod 10^m, acands);
               good:= select(t -> bcands[t]>=10^(m-1), [$1..nops(acands)]);
               print(loop, m, acands, bcands, good):
               As:= As union convert(bcands[good], set);
            od: 
            map(t -> t-2, sort(convert(As, list))); # Robert Israel, Aug 20 2019
          */
          while (mGood.size() <= 0) {
            final Z pow10p1 = mPow10.multiply(10);
            final TreeSet<Z> acands = new TreeSet<>(QuadraticCongruence.solve(Z.ONE, Z.valueOf(mDist), Z.valueOf(-mIncr2), pow10p1.add(1))); // for A116170: msolve(a*(a+1)-2,10^m+1)
            for (final Z ta : acands) {
              final Z prod = ta.multiply(ta.add(mDist));
              final Z bcand = prod.mod(pow10p1);
              if (bcand.compareTo(mPow10) >= 0) {
                if (prod.toString().startsWith(bcand.add(-mIncr2).toString())) {
                  mGood.add(mReturnConc ? bcand : ta.add(mIncr2));
                }
              }
              if (VERBOSE) {
                System.out.println("ta=" + ta + ", prod=" + prod + ", bcand=" + bcand);
              }
            }
            mPow10 = pow10p1;
            if (VERBOSE) {
              System.out.println("pow10p1=" + pow10p1 + ", acands=" + acands + ", mGood=" + mGood);
            }
          }
          return mGood.pollFirst().subtract(mIncr2);
  
        case 2: // multiplicative, similar msolve algorithm
          while (mGood.size() <= 0) {
            final Z pow10p1 = mPow10.multiply(10);
            final TreeSet<Z> acands = new TreeSet<Z>(QuadraticCongruence.solve(Z.ONE, Z.ZERO, Z.ZERO, pow10p1.add(mDist))); // for A115553: msolve(a^2,10^m+9)
            for (final Z ta : acands) {
              final Z prod = ta.square();
              final Z bcand = prod.mod(pow10p1);
              if (bcand.compareTo(mPow10) >= 0) {
                if (prod.toString().startsWith(bcand.toString())) {
                  mGood.add(mReturnConc ? bcand : ta);
                }
              }
              if (VERBOSE) {
                System.out.println("ta=" + ta + ", prod=" + prod + ", bcand=" + bcand);
              }
            }
            mPow10 = pow10p1;
            if (VERBOSE) {
              System.out.println("pow10p1=" + pow10p1 + ", acands=" + acands + ", mGood=" + mGood);
            }
          }
          return mGood.pollFirst().subtract(mIncr2);

        default:
          throw new RuntimeException("Unexpected level: " + mLevel);
      }
    }
  }
}
