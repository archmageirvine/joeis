package irvine.oeis.a397;

import java.util.HashSet;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;

/**
 * A397774 allocated for Bill McEachen.
 * @author Sean A. Irvine
 */
public class A397774 extends Sequence1 {

  private long mN = 1;
  private Sequence mRow = new Row(1);

  protected static class Row extends CachedSequence {
    private final long mStart;
    private final HashSet<Long> mUsed = new HashSet<>();

    Row(final long start) {
      super(1);
      mStart = 2 * start - 1;
    }

    @Override
    protected Z compute(final Z nn) {
      final long n = nn.longValueExact();
      if (n == 1) {
        return Z.valueOf(mStart);
      }
      if (n == 2) {
        return Z.TWO;
      }
      if (a(n - 1).isZero()) {
        return null; // we finished the row
      }
      if ((n & 1) == 0) {
        return a(n - 1).subtract(a(n - 3)).abs();
      }
      long p = 2;
      Z t;
      do {
        p = Functions.NEXT_PRIME.l(p);
        t = a(n - 1).add(p);
      } while (mUsed.contains(p) || t.isProbablePrime());
      mUsed.add(p);
      return t;
    }
  }

  @Override
  public Z next() {
    Z t = mRow.next();
    if (t == null) {
      mRow = new Row(++mN);
      t = mRow.next();
    }
    return t;
  }
}
