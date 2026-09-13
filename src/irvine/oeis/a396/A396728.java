package irvine.oeis.a396;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicIntArray;

/**
 * A396728 allocated for Dar\u00edo Clavijo.
 * @author Sean A. Irvine
 */
public class A396728 extends Sequence0 {

  private int mN = -1;
  private int mMask;

  private Z count(final DynamicIntArray c) {
    Z t = Z.ONE;
    for (int i = 0; i < c.length(); ++i) {
      final int x = c.get(i);
      final DynamicIntArray s = new DynamicIntArray();
      for (int j = i + 1, k = 0; j < c.length(); ++j) {
        final int y = c.get(j);
        if (y != (mMask ^ x) && (x & ~y) != 0 && (y & ~x) != 0) {
          s.set(k++, y);
        }
      }
      t = t.add(count(s));
    }
    return t;
  }

  @Override
  public Z next() {
    if (++mN >= Integer.SIZE) {
      throw new UnsupportedOperationException();
    }
    mMask = (1 << mN) - 1;
    final DynamicIntArray c = new DynamicIntArray();
    for (int i = 0; i <= mMask; ++i) {
      c.set(i, i);
    }
    return count(c);
  }
}
