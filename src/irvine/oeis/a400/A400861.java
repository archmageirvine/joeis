package irvine.oeis.a400;

import java.util.concurrent.atomic.AtomicInteger;

import irvine.math.z.Z;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A400861 allocated for Dimas Saputra.
 * @author Sean A. Irvine
 */
public class A400861 extends ParallelPermutationSequence {

  /** Construct the sequence. */
  public A400861() {
    super(0);
  }

  private int mLen = 0;
  private final AtomicInteger mMax = new AtomicInteger();

  private int set(final int[] p) {
    final boolean[] s = new boolean[mLen];
    for (int k = 0; k < p.length; ++k) {
      int sum = 0;
      for (int j = k; j < p.length; ++j) {
        sum += p[j] + 1;
        s[sum - 1] = true;
      }
    }
    int k = 0;
    while (s[k]) {
      ++k;
    }
    return k;
  }

  @Override
  protected long count(final int[] p) {
    mMax.accumulateAndGet(set(p), Math::max);
    return 0;
  }

  @Override
  public Z next() {
    // Note mN has not yet been incremented when we reach here
    mLen = (mN + 1) * (mN + 2) / 2 + 2; // enough that the top is always 0
    mMax.set(0);
    super.next();
    return Z.valueOf(mMax.get());
  }
}
