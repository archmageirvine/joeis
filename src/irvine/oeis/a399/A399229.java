package irvine.oeis.a399;

import java.util.ArrayList;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence2;
import irvine.util.array.LongDynamicByteArray;
import irvine.util.array.LongDynamicLongArray;

/**
 * A399229 allocated for Helmuth Haslacher.
 * @author Sean A. Irvine
 */
public class A399229 extends Sequence2 {

  // After Helmuth Haslacher

  private long mN = 1;

  @Override
  public Z next() {
    ++mN;
    long d = 1;
    long t = 10;
    while (t <= 9 * mN * (d + 1)) {
      ++d;
      t *= 10;
    }
    final long m = 9 * mN * d;
    final LongDynamicLongArray f = new LongDynamicLongArray();
    for (long x = 1; x <= m; ++x) {
      f.set(x, Functions.DIGIT_SUM.l(Z.valueOf(x).pow(mN)));
    }
    final LongDynamicByteArray color = new LongDynamicByteArray();
    long totalLength = 0;
    for (long start = 1; start <= m; ++start) {
      final ArrayList<Long> path = new ArrayList<>();
      long x = start;
      while (color.get(x) == 0) {
        color.set(x, (byte) 1);
        path.add(x);
        x = f.get(x);
      }
      if (color.get(x) == 1) {
        totalLength += path.size() - path.indexOf(x);
      }
      for (final long y : path) {
        color.set(y, (byte) 2);
      }
    }
    return Z.valueOf(totalLength);
  }
}
