package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.math.MemoryFunction1;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A401963 Period of row 2^m - 1 - n in the Laver table of size 2^m, for any m such that 2^m &gt; n + 1.
 * @author Sean A. Irvine
 */
public class A401963 extends Sequence0 {

  private long mN = -1;
  private final MemoryFunction1<List<Integer>> mT = new MemoryFunction1<>() {
    @Override
    protected List<Integer> compute(final int n) {
      int x = n;
      final ArrayList<Integer> walk = new ArrayList<>();
      walk.add(x);
      while (x != 0) {
        final List<Integer> t = get(x - 1);
        x = t.get(n % t.size());
        walk.add(x);
      }
      Collections.sort(walk);
      return walk;
    }
  };

  @Override
  public Z next() {
    return Z.valueOf(mT.get(++mN).size());
  }
}

