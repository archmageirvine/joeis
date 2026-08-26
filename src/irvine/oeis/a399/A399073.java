package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399073 allocated for Firdous Ahmad Mala.
 * @author Sean A. Irvine
 */
public class A399073 extends Sequence1 {

  private int mN = 0;
  private boolean[] mWord;
  private long mCount;

  /**
   * Return true if the word is primitive.
   */
  private boolean primitive() {
    for (int d = 1; d < mN; ++d) {
      if (mN % d == 0) {
        boolean periodic = true;
        for (int k = d; k < mN; ++k) {
          if (mWord[k] != mWord[k % d]) {
            periodic = false;
            break;
          }
        }
        if (periodic) {
          return false;
        }
      }
    }
    return true;
  }

  /**
   * Compare the word with a rotation of itself.
   * @param shift rotation amount
   * @return negative, zero, or positive according as word is less than, equal to, or greater than the rotation
   */
  private int compareRotation(final int shift) {
    for (int k = 0; k < mN; ++k) {
      final boolean a = mWord[k];
      final boolean b = mWord[(shift + k) % mN];
      if (a != b) {
        return a ? 1 : -1;
      }
    }
    return 0;
  }

  /**
   * Compare the word with a rotation of its reversal.
   * The reversed word is: w[n-1], w[n-2], ..., w[0].
   * @param shift rotation amount
   * @return negative, zero, or positive
   */
  private int compareReverseRotation(final int shift) {
    for (int k = 0; k < mN; ++k) {
      final boolean a = mWord[k];
      final boolean b = mWord[mN - 1 - ((shift + k) % mN)];
      if (a != b) {
        return a ? 1 : -1;
      }
    }
    return 0;
  }

  /**
   * True if this word is the lexicographically least element of its dihedral orbit.
   */
  private boolean canonical() {
    for (int shift = 1; shift < mN; ++shift) {
      if (compareRotation(shift) > 0) {
        return false;
      }
    }
    for (int shift = 0; shift < mN; ++shift) {
      if (compareReverseRotation(shift) > 0) {
        return false;
      }
    }
    return true;
  }

  /**
   * Check the two cyclic triples which are not checked during generation.
   */
  private boolean cyclicValid() {
    if (mN < 3) {
      return true;
    }
    return !(mWord[mN - 2] == mWord[mN - 1]
      && mWord[mN - 1] == mWord[0])
      && !(mWord[mN - 1] == mWord[0]
      && mWord[0] == mWord[1]);
  }

  private void search(final int pos) {
    if (pos == mN) {
      if (cyclicValid() && primitive() && canonical()) {
        ++mCount;
      }
      return;
    }
    // Append 0
    if (pos < 2 || mWord[pos - 1] || mWord[pos - 2]) {
      mWord[pos] = false;
      search(pos + 1);
    }

    // Append 1
    if (pos < 2 || !mWord[pos - 1] || !mWord[pos - 2]) {
      mWord[pos] = true;
      search(pos + 1);
    }
  }

  @Override
  public Z next() {
    if (++mN == 1) {
      return Z.ZERO;
    }
    mWord = new boolean[mN];
    mCount = 0;
    search(0);
    return Z.valueOf(mCount);
  }
}
