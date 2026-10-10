package irvine.oeis.a399;

import java.util.Arrays;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

import irvine.math.z.Z;
import irvine.oeis.ParallelPermutationSequence;

/**
 * A399277 allocated for Daniel Yaqubi.
 * @author Sean A. Irvine
 */
public class A399277 extends ParallelPermutationSequence {

  private final Set<String> mA = ConcurrentHashMap.newKeySet();

  /** Construct the sequence. */
  public A399277() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    final int n = p.length;
    final int[] m = new int[n];
    for (int k = 1; k < n; ++k) {
      ++m[(n + p[k-1] - p[k]) % n];
    }
    mA.add(Arrays.toString(m));
    return 0;
  }

  @Override
  public Z next() {
    mA.clear();
    super.next();
    return Z.valueOf(mA.size());
  }
}
