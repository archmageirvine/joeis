package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398731 allocated for V. Barbera.
 * @author Sean A. Irvine
 */
public class A398731 extends Sequence0 {

  private static final Z Q = Z.FIVE;
  private static final int D = 2; // floor(log_2(5))
  private int mN = -1;
  private int mM = 0;
  private Z[] mRow;

  private Z[] row(final int n) {
    if (n < 1) {
      return new Z[] {Z.ZERO};
    }
    List<Z> r = new ArrayList<>();
    r.add(Z.ONE);
    int km = D + 1;
    for (int m = 1; m < n; ++m) {
      final List<Z> s = new ArrayList<>();
      final int c = Q.pow(m + 1).compareTo(Z.ONE.shiftLeft(km + D)) < 0 ? D : D + 1;
      for (final Z value : r) {
        int dm = km;
        Z t = value;
        for (int j = 1; j < m; ++j) {
          t = t.subtract(Q.pow(m - j));
          final int e = Functions.VALUATION.i(t, 2);
          t = t.shiftRight(e);
          dm -= e;
        }
        for (int j = 1; j <= dm - 1; ++j) {
          s.add(Q.multiply(value).add(Z.ONE.shiftLeft(km - dm + j)));
        }
      }
      km += c;
      r = s;
    }

    final Z modulus = Z.ONE.shiftLeft(km);
    final Z inverse = Q.pow(n).modInverse(modulus);
    final List<Z> result = new ArrayList<>();
    for (final Z value : r) {
      result.add(value.negate().multiply(inverse).mod(modulus));
    }
    Collections.sort(result);
    return result.toArray(new Z[0]);
  }

  @Override
  public Z next() {
    if (mRow == null || mM >= mRow.length) {
      mRow = row(++mN);
      mM = 0;
    }
    return mRow[mM++];
  }
}
