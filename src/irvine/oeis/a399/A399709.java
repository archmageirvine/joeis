package irvine.oeis.a399;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.array.LongDynamicLongArray;

/**
 * A399709 Lexicographically earliest sequence where a(1) = 3, allowed integers are &gt;= 3, and each term a(n) is banned for the next a(n) terms.
 * @author Sean A. Irvine
 */
public class A399709 extends Sequence1 {

  private final LongDynamicLongArray mPos = new LongDynamicLongArray();
  private long mN = 0;

  @Override
  public Z next() {
    ++mN;
    long k = 3;
    while (mPos.get(k) >= mN) {
      ++k;
    }
    mPos.set(k, mN + k);
    return Z.valueOf(k);
  }
}

