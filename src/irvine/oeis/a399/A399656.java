package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399656 allocated for Boon Suan Ho.
 * @author Sean A. Irvine
 */
public class A399656 extends Sequence0 {

  // todo this only produces initial terms (based on Python)

  private static final int LIMIT = 354;

  private final List<Integer> mTerms;
  private int mN;

  /**
   * Extend the ordered list P using the set T.
   * @param p ordered list of existing terms
   * @param t set of new terms
   * @return extended list
   */
  private static List<Integer> extend(final List<Integer> p, final Set<Integer> t) {
    int maxP = 0;
    for (final int x : p) {
      maxP = Math.max(maxP, x);
    }

    if (maxP == 0) {
      final Set<Integer> s = new HashSet<>(p);
      s.addAll(t);
      int max = 0;
      for (final int x : s) {
        max = Math.max(max, x);
      }
      final int width = max == 0 ? 0 : Integer.SIZE - Integer.numberOfLeadingZeros(max);
      final List<Integer> result = new ArrayList<>(s);
      result.sort((a, b) -> {
        // Compare the zero-padded binary representations in reverse order.
        for (int i = 0; i < width; ++i) {
          final int abit = (a >>> i) & 1;
          final int bbit = (b >>> i) & 1;
          if (abit != bbit) {
            return Integer.compare(abit, bbit);
          }
        }
        return 0;
      });
      return result;
    }

    final List<Integer> p0 = new ArrayList<>();
    final List<Integer> p1 = new ArrayList<>();
    for (final int x : p) {
      if ((x & 1) == 0) {
        p0.add(x / 2);
      } else {
        p1.add(x / 2);
      }
    }

    final Set<Integer> t0 = new HashSet<>();
    final Set<Integer> t1 = new HashSet<>();
    for (final int x : t) {
      if ((x & 1) == 0) {
        t0.add(x / 2);
      } else {
        t1.add(x / 2);
      }
    }

    final List<Integer> e0 = extend(p0, t0);
    final List<Integer> e = new ArrayList<>();
    for (int i = p0.size(); i < e0.size(); ++i) {
      e.add(2 * e0.get(i));
    }

    int maxE = 0;
    for (final int x : e) {
      maxE = Math.max(maxE, x);
    }
    for (int i = 0; i < maxE; ++i) {
      t1.add(i);
    }

    final List<Integer> o0 = extend(p1, t1);
    final List<Integer> o = new ArrayList<>();
    for (int i = p1.size(); i < o0.size(); ++i) {
      o.add(2 * o0.get(i) + 1);
    }

    final List<Integer> result = new ArrayList<>(p.size() + o.size() + e.size());
    result.addAll(p);
    result.addAll(o);
    result.addAll(e);
    return result;
  }

  /** Construct the sequence. */
  public A399656() {
    List<Integer> p = new ArrayList<>();
    for (int n = 0; n < 9; ++n) {
      final Set<Integer> t = new HashSet<>();
      t.add(n);
      p = extend(p, t);
    }
    mTerms = new ArrayList<>(p.subList(0, Math.min(LIMIT, p.size())));
  }

  @Override
  public Z next() {
    return Z.valueOf(mTerms.get(mN++) + 1);
  }
}
