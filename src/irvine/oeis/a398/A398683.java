package irvine.oeis.a398;

import java.util.TreeSet;

import irvine.math.MemoryFunction1;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398683 Numbers k such that C(k,3) = C(x,5) + C(y,5) + C(z,5) is solvable, where k &gt; x &gt;= y &gt;= z &gt; 5.
 * @author Sean A. Irvine
 */
public class A398683 extends Sequence1 {

  private final TreeSet<Z> mA = new TreeSet<>();
  private int mN = 5;
  private final MemoryFunction1<Z> mB = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      return Binomial.binomial(n, 5);
    }
  };

  @Override
  public Z next() {
    while (true) {
      final Z t = mB.get(++mN);
      while (!mA.isEmpty() && mA.first().compareTo(t) < 0) {
        mA.pollFirst();
      }
      for (int k = 6; k <= mN; ++k) {
        final Z tu = t.add(mB.get(k));
        for (long j = k; j <= mN; ++j) {
          mA.add(tu.add(mB.get(j)));
        }
      }
      if (!mA.isEmpty() && mA.first().equals(t)) {
        return Z.valueOf(mN);
      }
    }
  }
}

