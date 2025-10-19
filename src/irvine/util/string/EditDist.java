package irvine.util.string;

import java.util.Locale;

/**
 * This class computes the edit distance measure between two strings. The
 * operations are: change, insert and delete.
 * @author Stuart Inglis
 * @author Sean A. Irvine
 */
public class EditDist {

  /**
   * Computes the edit distance between two strings using O(max(m,n)) memory.
   * @param s the first string.
   * @param t the second string.
   * @return the edit distance.
   */
  public static int editDistance(final String s, final String t) {
    if (s == null || t == null) {
      throw new IllegalArgumentException("Strings must not be null");
    }

    final int n = s.length();
    final int m = t.length();

    if (n == 0) {
      return m;
    } else if (m == 0) {
      return n;
    }

    int[] p = new int[n + 1]; // 'previous' cost array, horizontally
    int[] d = new int[n + 1]; // cost array, horizontally
    int[] tmp; // placeholder to assist in swapping p and d

    for (int i = 0; i <= n; ++i) {
      p[i] = i;
    }

    for (int j = 1; j <= m; ++j) {
      final char tmpJ = t.charAt(j - 1);
      d[0] = j;

      for (int i = 1; i <= n; ++i) {
        final int cost = s.charAt(i - 1) == tmpJ ? 0 : 1;
        // minimum of cell to the left+1, to the top+1, diagonally left and up
        // +cost
        d[i] = Math.min(Math.min(d[i - 1] + 1, p[i] + 1), p[i - 1] + cost);
      }

      // copy current distance counts to 'previous row' distance counts
      tmp = p;
      p = d;
      d = tmp;
    }

    // our last action in the above loop was to switch d and p, so p now
    // actually has the most recent cost counts
    return p[n];
  }


  private String mStringA; // the original strings
  private String mStringB;
  private int[][] mArr; // the distance array
  private byte[][] mArrOp; // the operation array
  private char[][] mArrCh; // the operation array
  private int mDist = 0; // edit distance between the strings
  private final EditTransforms mTransforms;
  private final boolean mAllowTranspose;

  EditDist(final String a, final String b, final boolean allowTranspose) {
    mAllowTranspose = allowTranspose;
    mTransforms = new EditTransforms();
    calcEditDist(a, b);
  }

  EditDist(final String a, final String b) {
    this(a, b, true);
  }

  private void calcEditDist(final String a, final String b) {
    final int mLena;
    final int mLenb;

    mStringA = a.toLowerCase(Locale.getDefault());
    mStringB = b.toLowerCase(Locale.getDefault());
    mLena = mStringA.length();
    mLenb = mStringB.length();

    mArr = new int[mLena + 1][mLenb + 1];
    mArrOp = new byte[mLena + 1][mLenb + 1];
    mArrCh = new char[mLena + 1][mLenb + 1];
    for (int j = 0; j <= mLenb; ++j) {
      mArr[0][j] = j;
      mArrOp[0][j] = 'I';
      if (j > 0) {
        mArrCh[0][j] = mStringB.charAt(j - 1);
      }
    }

    for (int i = 1; i <= mLena; ++i) {
      mArr[i][0] = i;
      mArrOp[i][0] = 'D';
      mArrCh[i][0] = mStringA.charAt(i - 1);
      for (int j = 1; j <= mLenb; ++j) {
        if (mStringA.charAt(i - 1) == mStringB.charAt(j - 1)) {
          mArr[i][j] = mArr[i - 1][j - 1]; // store the cost
          mArrOp[i][j] = '='; // store the operation
          mArrCh[i][j] = mStringB.charAt(j - 1);
          // mArr[i][j];
        } else {
          final int l1 = mArr[i - 1][j - 1] + 1;
          final int l2 = mArr[i - 1][j] + 1;
          final int l3 = mArr[i][j - 1] + 1;
          mArr[i][j] = Math.min(Math.min(l1, l2), l3);
          if (mArr[i][j] == l1) {
            // mArr[i][j]+=3;
            mArrOp[i][j] = 'M';
            mArrCh[i][j] = mStringB.charAt(j - 1);
          } else if (mArr[i][j] == l2) {
            // mArr[i][j]+=1;
            mArrOp[i][j] = 'D';
            mArrCh[i][j] = mStringA.charAt(i - 1);
          } else {
            // mArr[i][j]+=1;
            mArrOp[i][j] = 'I';
            mArrCh[i][j] = mStringB.charAt(j - 1);
          }
          if (mAllowTranspose) {
            if (mArrOp[i][j] == 'M' && mArrOp[i - 1][j - 1] == 'M') {
              if (mStringB.charAt(j - 1) == mStringA.charAt(i - 2)
                && mStringB.charAt(j - 2) == mStringA.charAt(i - 1)) {
                mArrOp[i][j] = 'T';
                mArrOp[i - 1][j - 1] = 'T';
                mArr[i][j] -= 1;
              }
            }
          }
        }
      }
    }
    mDist = mArr[mLena][mLenb];
    goBackwards();

  }

  void goBackwards() {
    int i = mStringA.length();
    int j = mStringB.length();
    while (((i >= 0) && (j >= 0)) && (i + j > 0)) {
      mTransforms.add((char) mArrOp[i][j], mArrCh[i][j]);
      if ((mArrOp[i][j] == '=' || mArrOp[i][j] == 'M' || mArrOp[i][j] == 'T') && i > 0 && j > 0) {
        --i;
        --j;
      } else if (mArrOp[i][j] == 'I' || i == 0) {
        --j;
      } else {
        --i;
      }
    }

    mTransforms.reverse();
  }

  int distance() {
    return mDist;
  }

  EditTransforms transform() {
    return mTransforms;
  }

  void printMatrix() {
    System.out.print('\t');
    for (int i = 0; i < mStringA.length(); ++i) {
      System.out.print("\t" + mStringA.charAt(i));
    }
    System.out.println();
    for (int j = 0; j <= mStringB.length(); ++j) {
      if (j != 0) {
        System.out.print(mStringB.charAt(j - 1));
      }
      for (int i = 0; i <= mStringA.length(); ++i) {
        System.out.print("\t" + mArr[i][j]);
      }
      System.out.println();
    }
  }
}
