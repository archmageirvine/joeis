package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398739 allocated for Robert Potter.
 * @author Sean A. Irvine
 */
public class A398739 extends Sequence1 {

  // After Robert Potter

  private int mN = 0;

  @Override
  public Z next() {
    ++mN;
    final int m = 2 * mN + 1;
    final Set<Integer> unseen = new HashSet<>();
    for (int x = 1; x < m; x += 2) {
      if (Functions.GCD.i(x, m) == 1) {
        unseen.add(x);
      }
    }

    int res = 0;
    while (!unseen.isEmpty()) {
      int seed = Integer.MAX_VALUE;
      for (final int x : unseen) {
        seed = Math.min(seed, x);
      }

      final ArrayList<Boolean> flags = new ArrayList<>();
      int x = seed;
      do {
        unseen.remove(x);
        flags.add(Predicates.PRIME.is(x));
        x = Math.abs(2 * x - m);
      } while (x != seed);

      final int len = flags.size();
      boolean allPrime = true;
      int run = 0;
      int maxRun = 0;

      for (final boolean prime : flags) {
        if (prime) {
          ++run;
          maxRun = Math.max(maxRun, run);
        } else {
          allPrime = false;
          run = 0;
        }
      }

      if (allPrime) {
        maxRun = len;
      } else {
        run = 0;
        for (int i = 0; i < 2 * len; ++i) {
          if (flags.get(i % len)) {
            ++run;
            maxRun = Math.max(maxRun, run);
          } else {
            run = 0;
          }
        }
        maxRun = Math.min(maxRun, len);
      }
      res = Math.max(res, maxRun);
    }
    return Z.valueOf(res);
  }
}
