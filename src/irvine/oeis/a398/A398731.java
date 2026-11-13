package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.cr.CR;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398731 Irregular triangle read by rows in which row n gives the congruences (mod 2^floor(1+n*log_2(5))) that have an admissible sequence of order n; related to 5x+1 problem.
 * @author Sean A. Irvine
 */
public class A398731 extends Sequence0 {

  private final Z mQ;
  private final int mD;
  private int mN = -1;
  private int mM = 0;
  private Z[] mRow;

  protected A398731(final Z q) {
    mQ = q;
    mD = CR.valueOf(mQ).log().divide(CR.LOG2).floor().intValueExact();
  }

  /** Construct the sequence. */
  public A398731() {
    this(Z.FIVE);
  }

  private Z[] row(final int n) {
    if (n < 1) {
      return new Z[] {Z.ZERO};
    }
    List<Z> r = new ArrayList<>();
    r.add(Z.ONE);
    int km = mD + 1;
    for (int m = 1; m < n; ++m) {
      final List<Z> s = new ArrayList<>();
      final int c = mQ.pow(m + 1).compareTo(Z.ONE.shiftLeft(km + mD)) < 0 ? mD : mD + 1;
      for (final Z value : r) {
        int dm = km;
        Z t = value;
        for (int j = 1; j < m; ++j) {
          t = t.subtract(mQ.pow(m - j));
          final int e = Functions.VALUATION.i(t, 2);
          t = t.shiftRight(e);
          dm -= e;
        }
        for (int j = 1; j <= dm - 1; ++j) {
          s.add(mQ.multiply(value).add(Z.ONE.shiftLeft(km - dm + j)));
        }
      }
      km += c;
      r = s;
    }

    final Z modulus = Z.ONE.shiftLeft(km);
    final Z inverse = mQ.pow(n).modInverse(modulus);
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
