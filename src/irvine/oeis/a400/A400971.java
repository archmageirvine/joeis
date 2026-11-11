package irvine.oeis.a400;

import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A400971 allocated for Yongkuo Chen.
 * @author Sean A. Irvine
 */
public class A400971 extends Sequence0 {

  // After Yongkuo Chen

  private static final class Pair {
    private final int mS;
    private final long mT;

    Pair(final int s, final long t) {
      mS = s;
      mT = t;
    }

    @Override
    public int hashCode() {
      return 31 * mS + Long.hashCode(mT);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof Pair)) {
        return false;
      }
      final Pair other = (Pair) obj;
      return mS == other.mS && mT == other.mT;
    }
  }

  private Map<Pair, Z> distribution(final int lo, final int hi) {
    Map<Pair, Z> counts = new HashMap<>();
    counts.put(new Pair(0, 0), Z.ONE);
    for (int k = lo; k <= hi; ++k) {
      final Map<Pair, Z> next = new HashMap<>();
      final long cube = (long) k * k * k;
      for (final Map.Entry<Pair, Z> e : counts.entrySet()) {
        final Pair p = e.getKey();
        final Z w = e.getValue();
        // Two distinct choices contribute (0, 0)
        add(next, p.mS, p.mT, w.multiply2());
        // Choices +k and -k
        add(next, p.mS + k, p.mT + cube, w);
        add(next, p.mS - k, p.mT - cube, w);
      }
      counts = next;
    }
    return counts;
  }

  private void add(final Map<Pair, Z> map, final int s, final long t, final Z w) {
    final Pair p = new Pair(s, t);
    map.merge(p, w, Z::add);
  }

  private int mN = -1;

  @Override
  public Z next() {
    final int m = ++mN / 2;
    final Map<Pair, Z> left = distribution(1, m);
    final Map<Pair, Z> right = distribution(m + 1, mN);
    Z total = Z.ZERO;
    for (final Map.Entry<Pair, Z> e : left.entrySet()) {
      final Pair p = e.getKey();
      final Z w = right.get(new Pair(-p.mS, -p.mT));
      if (w != null) {
        total = total.add(e.getValue().multiply(w));
      }
    }
    return total.subtract(Z.ONE.shiftLeft(mN));
  }
}
