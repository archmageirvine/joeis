package irvine.oeis.a396;

import java.util.TreeMap;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.a000.A000037;

/**
 * A396581 The fractional part of A000037(n) is the a(n)-th smallest fractional part of all sqrt(m) where m is nonsquare and 1 &lt;= m &lt;= A000037(n).
 * @author Sean A. Irvine
 */
public class A396581 extends A000037 {

  private final TreeMap<CR, Long> mA = new TreeMap<>();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    final Z t = super.next();
    mA.put(CR.valueOf(t).sqrt().frac(), mN);
    long k = 0;
    for (final Long v : mA.values()) {
      ++k;
      if (v == mN) {
        return Z.valueOf(k);
      }
    }
    throw new RuntimeException();
  }
}
