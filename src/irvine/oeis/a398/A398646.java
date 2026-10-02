package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398646 allocated for V. Barbera.
 * @author Sean A. Irvine
 */
public class A398646 extends Sequence0 {

  // After V. Barbera

  private List<Z> mRow = new ArrayList<>();
  private int mPos = 0;
  private int mN = 1;
  private boolean mStart = true;

  /** Construct the sequence. */
  public A398646() {
    mRow.add(Z.TEN);
  }

  private static int c(final int m, final int km) {
    final Z lhs = Z.THREE.pow(m);
    final Z rhs = Z.TWO.pow(km + 1);
    return lhs.compareTo(rhs) < 0 ? 1 : 2;
  }

  private static List<Z> nextRow(final List<Z> ans, final int m, final int km) {
    final List<Z> t = new ArrayList<>();
    final int c = c(m, km);
    for (final Z value : ans) {
      Z s = value;
      int d = 0;
      while (s.mod(Z.TWO).isZero()) {
        s = s.divide(Z.TEN);
        ++d;
      }
      for (int j = 1; j <= d; ++j) {
        Z s1 = s;
        for (int j1 = 1; j1 <= j; ++j1) {
          s1 = s1.multiply(Z.TEN);
          if (j1 == j) {
            s1 = s1.add(Z.ONE);
            for (int j2 = j + 1; j2 <= d + c; ++j2) {
              s1 = s1.multiply(Z.TEN);
            }
          }
        }
        t.add(s1);
      }
    }
    return t;
  }

  @Override
  public Z next() {
    if (mStart) {
      mStart = false;
      return Z.ZERO;
    }
    if (mPos >= mRow.size()) {
      int km = 2;
      for (int m = 2; m <= mN; ++m) {
        km += c(m, km);
      }
      ++mN;
      mRow = nextRow(mRow, mN, km);
      mPos = 0;
    }
    return mRow.get(mPos++);
  }
}
