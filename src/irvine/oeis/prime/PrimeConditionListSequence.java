package irvine.oeis.prime;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * This class implements sequences that are defined like
 * "Numbers k such that c1*k+b1, c2*k+b2 and cm*k+bm are primes".
 * @author Georg Fischer
 */
public class PrimeConditionListSequence extends AbstractSequence {

  private static final int DEFOFF = 1;

  protected long[] mList;
  protected Z mN; // current index

  /**
   * Creates a sequence of number that fulfill the all prime conditions of the list.
   * @param start first number k to be considered (default 1).
   * @param list list of pairs (c1, b1), (c2, b2) and so on.
   */
  public PrimeConditionListSequence(final int start, final long... list) {
    super(DEFOFF);
    mList = list;
    mN = Z.valueOf(start - 1);
  }

  @Override
  public Z next() {
    while (true) {
      mN = mN.add(1);
      boolean busy = true;
      final int imax = mList.length;
      int i = -1;
      while (busy && ++i < imax) {
        if (!mN.multiply(mList[i]).add(mList[i + 1]).isProbablePrime()) {
          busy = false;
        }
        ++i;
      }
      if (busy) {
        return mN;
      }
    }
  }
}
