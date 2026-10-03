package irvine.oeis.a399;

import java.util.concurrent.atomic.AtomicInteger;

import irvine.math.z.Z;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A336282.
 * @author Sean A. Irvine
 */
public class A399946 extends ParallelPermutationSequence {

  /** Construct the sequence. */
  public A399946() {
    super(1);
  }

  private final AtomicInteger mMaxTip = new AtomicInteger();

  private int gilbreathTip(final int[] p) {
    final int[] curr = p.clone();
    int len = mN;
    while (len > 1) {
      for (int i = 0; i < len - 1; ++i) {
        curr[i] = Math.abs(curr[i] - curr[i + 1]);
      }
      --len;
    }
    return curr[0];
  }

  @Override
  protected long count(final int[] p) {
    final int tip = gilbreathTip(p);
    mMaxTip.accumulateAndGet(tip, Math::max);
    return 0;
  }

  @Override
  protected boolean accept(final int[] p, final int sum, final int pos) {
    if (pos <= 2) {
      return true;
    }
    // Check no differences repeat
    final int d = Math.abs(p[pos - 1] - p[pos - 2]);
    for (int k = 1; k < pos - 1; ++k) {
      if (Math.abs(p[k - 1] - p[k]) == d) {
        return false;
      }
    }
    return true;
  }

  @Override
  public Z next() {
    mMaxTip.set(0);
    super.next();
    return Z.valueOf(mMaxTip.get());
  }
}
