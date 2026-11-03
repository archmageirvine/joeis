package irvine.oeis.a401;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.a000.A000040;
import irvine.util.array.LongDynamicByteArray;

/**
 * A401173 allocated for Igor Zhuk.
 * @author Sean A. Irvine
 */
public class A401173 extends A000040 {

  // After Igor Zhuk

  private boolean is(final long p) {
    if (p == 2) {
      return false;
    }
    if (p > 5) {
      final long r = p % 24;
      if (r == 7 || r == 19) {
        return false;
      }
      if (Functions.KRONECKER.i(-83, p) != 1) {
        return false;
      }
    }
    final LongDynamicByteArray state = new LongDynamicByteArray();
    state.set(1, (byte) 2);
    for (long x = 0; x < p; ++x) {
      if (state.get(x) == 2) {
        continue;
      }
      long curr = x;
      final ArrayList<Long> path = new ArrayList<>();
      while (state.get(curr) == 0) {
        state.set(curr, (byte) 1);
        path.add(curr);
        curr *= curr;
        curr -= 2;
        curr %= p;
        curr *= curr;
        curr %= p;
      }
      if (state.get(curr) == 1) {
        return false;
      }
      for (final long u : path) {
        state.set(u, (byte) 2);
      }
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      final Z p = super.next();
      if (p.bitLength() > 31) {
        // curr^2 is dangerous in long (see "is")
        throw new UnsupportedOperationException();
      }
      if (is(p.longValueExact())) {
        return p;
      }
    }
  }
}
