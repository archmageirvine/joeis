package irvine.oeis.a400;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A400477 allocated for Janaka Rodrigo.
 * @author Sean A. Irvine
 */
public class A400477 extends Sequence1 {

  private final TreeMap<Long, List<Long>> mPerimeters = new TreeMap<>();
  private long mC = 4;

  @Override
  public Z next() {
    while (true) {
      while (mPerimeters.isEmpty() || mPerimeters.firstKey() > 2 * mC) {
        final long c2 = ++mC * mC;
        for (long b = 2; b < mC; ++b) {
          final long a2 = c2 - b * b;
          final long a = Functions.SQRT.l(a2);
          if (a <= b && a * a == a2) {
            final long p = a + b + mC;
            final List<Long> lst = mPerimeters.computeIfAbsent(p, k -> new ArrayList<>());
            lst.add(a);
            if (a != b) { // assuming this is not allowed
              lst.add(b);
            }
            lst.add(mC);
          }
        }
      }
      final Map.Entry<Long, List<Long>> entry = mPerimeters.pollFirstEntry();
      final HashSet<Long> repeats = new HashSet<>();
      for (final Long v : entry.getValue()) {
        if (!repeats.add(v)) {
          return Z.valueOf(entry.getKey());
        }
      }
    }
  }
}
