package irvine.oeis.a396;

import java.util.ArrayList;
import java.util.Collections;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt2;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A396826 a(n) is the number of distinct integer-sided triangles (x, y, z) with sopfr(x) = sopfr(y) = sopfr(z) = n, where sopfr is A001414.
 * @author Sean A. Irvine
 */
public class A396826 extends Sequence1 {

  // After Felix Huber

  private int mN = 0;

  private final MemoryFunctionInt2<ArrayList<Z>> mH = new MemoryFunctionInt2<>() {
    @Override
    protected ArrayList<Z> compute(final int n, final int s) {
      if (n == 0) {
        final ArrayList<Z> res = new ArrayList<>(1);
        res.add(Z.ONE);
        return res;
      }
      final ArrayList<Z> res = new ArrayList<>();
      int p = Functions.PRIME.i(s + 1);
      for (int k = s; p <= n; ++k, p = Functions.NEXT_PRIME.i(p)) {
        for (final Z w : mH.get(n - p, k)) {
          res.add(w.multiply(p));
        }
      }
      return res;
    }
  };

  private final MemoryFunction1<ArrayList<Z>> mS = new MemoryFunction1<>() {
    @Override
    protected ArrayList<Z> compute(final int n) {
      final ArrayList<Z> res;
      if (n == 0) {
        res = new ArrayList<>(1);
        res.add(Z.ONE);
      } else {
        res = new ArrayList<>(mH.get(n, 0));
        Collections.sort(res);
      }
      return res;
    }
  };

  private Z triangles(final ArrayList<Z> s) {
    final int n = s.size();
    if (n < 3) {
      return Z.ZERO;
    }
    long cnt = 0;
    for (int z = n - 1; z >= 2; --z) {
      final Z u = s.get(z);
      int v = 0;
      int w = z - 1;
      while (v < w) {
        if (s.get(v).add(s.get(w)).compareTo(u) > 0) {
          cnt += w - v;
          --w;
        } else {
          ++v;
        }
      }
    }
    return Z.valueOf(cnt);
  }

  @Override
  public Z next() {
    return triangles(mS.get(++mN));
  }
}
