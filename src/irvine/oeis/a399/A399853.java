package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;

import irvine.math.MemoryFunction1;
import irvine.math.MemoryFunctionInt2;
import irvine.math.MemoryFunctionInt3;
import irvine.math.partition.IntegerComposition;
import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.a398.A398335;
import irvine.util.Pair;

/**
 * A399853 Number of strongly connected digraphs on n labeled nodes, reducible as a flow graph rooted at node 1 and also rooted at node 2, in which every proper region block of the decomposition rooted at node 1 avoiding node 2 is a single node.
 * @author Gregory Morse
 */
public class A399853 extends A398335 {

  private static final int MAX_CACHE_ENTRIES = 250000;
  private int mCacheEntries;
  private int mN = 1;

  /** Construct the sequence. */
  public A399853() {
    super(2);
  }

  private final MemoryFunction1<Z> mFlat = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      return n <= 1 ? Z.ONE : flatStrong(n);
    }
  };

  private final MemoryFunction1<Map<List<Integer>, Z>> mMarkedDags = new MemoryFunction1<>() {
    @Override
    protected Map<List<Integer>, Z> compute(final int n) {
      if (n <= 1) {
        return Map.of(List.of(1, 1, 0, 0), Z.ONE);
      }
      final Map<List<Integer>, Z> result = new HashMap<>();
      result.put(List.of(n, n, 0, 0), Z.ONE);
      // Peel the sources. The distinguished sink is either isolated or left behind.
      for (int k = 1; k < n; ++k) {
        final int r = n - k;
        for (int i = 0; i < k; ++i) {
          if (i > 0) {
            final Z labels = Binomial.binomial(n - 1, k - 1).multiply(Binomial.binomial(k - 1, i - 1));
            for (int m = 1; m <= r; ++m) {
              for (int l = 1; l <= r; ++l) {
                add(result, List.of(k, l + i, 0, 0), labels.multiply(dagCount(r, m, l)).multiply(shoot(k - i, m, r - m)));
              }
            }
          }
          final Z labels = Binomial.binomial(n - 1, k).multiply(Binomial.binomial(k, i));
          for (final Map.Entry<List<Integer>, Z> entry : get(r).entrySet()) {
            final List<Integer> key = entry.getKey();
            final int m = key.get(0);
            final int l = key.get(1);
            final int d = key.get(2);
            final int covered = d == 0 ? m - 1 : m;
            final int free = r - covered - 1;
            final Z weight = labels.multiply(entry.getValue());
            for (int hit = d == 0 ? 1 : 0; hit <= k - i; ++hit) {
              final Z choose = weight.multiply(Binomial.binomial(k - i, hit));
              for (int only = 0; only <= hit; ++only) {
                final Z count = choose.multiply(Binomial.binomial(hit, only)).multiply(shoot(k - i - only, covered, free));
                add(result, List.of(k, l + i, d + hit, key.get(3) + only), count);
              }
            }
          }
        }
      }
      return result;
    }
  };

  private final MemoryFunction1<Map<List<Integer>, Z>> mMarkedSources = new MemoryFunction1<>() {
    @Override
    protected Map<List<Integer>, Z> compute(final int n) {
      final Map<List<Integer>, Z> result = new HashMap<>();
      if (n < 2) {
        return result;
      }
      for (final Map.Entry<List<Integer>, Z> entry : mMarkedDags.get(n - 1).entrySet()) {
        final List<Integer> key = entry.getKey();
        final int m = key.get(0);
        final int d = key.get(2);
        for (int hit = d == 0 ? 1 : 0; hit <= 1; ++hit) {
          final int required = m + (d == 0 ? 0 : hit);
          final int free = n - 1 - m - (d == 0 ? 0 : 1);
          for (int degree = required; degree <= required + free; ++degree) {
            final Z count = entry.getValue().multiply(Binomial.binomial(free, degree - required));
            add(result, List.of(degree, key.get(1), d, hit, key.get(3), d == 0 && degree == 1 ? 1 : 0), count);
          }
        }
      }
      return result;
    }
  };

  private static <T> void add(final Map<T, Z> table, final T key, final Z term) {
    if (!term.isZero()) {
      table.merge(key, term, Z::add);
    }
  }

  private final MemoryFunction1<Map<Integer, Z>> mConeDegrees = new MemoryFunction1<>() {
    @Override
    protected Map<Integer, Z> compute(final int n) {
      if (n <= 1) {
        return Map.of(1, Z.ONE);
      }
      final Map<Integer, Z> result = new HashMap<>();
      for (int m = 1; m < n; ++m) {
        for (int l = 1; l < n; ++l) {
          final Z count = dagCount(n - 1, m, l).shiftLeft(n - l - 1);
          if (!count.isZero()) {
            for (int d = m; d < n; ++d) {
              final Z term = count.multiply(Binomial.binomial(n - 1 - m, d - m));
              add(result, d, term);
              add(result, d + 1, term);
            }
          }
        }
      }
      return result;
    }
  };

  private static Z sum(final Iterable<Z> values) {
    Z count = Z.ZERO;
    for (final Z value : values) {
      count = count.add(value);
    }
    return count;
  }

  private final MemoryFunction1<Z> mCones = new MemoryFunction1<>() {
    @Override
    protected Z compute(final int n) {
      return sum(mConeDegrees.get(n).values());
    }
  };

  private final MemoryFunctionInt2<Z> mLimbo = new MemoryFunctionInt2<>() {
    @Override
    protected Z compute(final int n, final int pool) {
      if (n == 0) {
        return Z.ONE;
      }
      final Z incoming = Z.ONE.shiftLeft(pool).subtract(1);
      Z count = Z.ZERO;
      for (int m = 1; m <= n; ++m) {
        for (int l = 1; l <= n; ++l) {
          count = count.add(dagCount(n, m, l).multiply(incoming.pow(m)).shiftLeft(n - l + (long) pool * (n - m)));
        }
      }
      return count;
    }
  };

  private static void shapes(final int n, final List<Pair<Integer, Integer>> shells, final BiConsumer<List<Pair<Integer, Integer>>, Integer> action) {
    if (!shells.isEmpty()) {
      action.accept(shells, n);
    }
    for (int k = 0; k < n - 1; ++k) {
      for (int g = 0; g < n - 1 - k; ++g) {
        shells.add(new Pair<>(k, g));
        shapes(n - 1 - k - g, shells, action);
        shells.remove(shells.size() - 1);
      }
    }
  }

  private static Z labels(final int n, final List<Pair<Integer, Integer>> shells, final boolean markedCore, final boolean markedLast) {
    int remaining = n - 2 - (markedCore || markedLast ? 1 : 0);
    Z count = Z.ONE;
    for (int j = 0; j < shells.size(); ++j) {
      if (j > 0) {
        count = count.multiply(remaining--);
      }
      final Pair<Integer, Integer> shape = shells.get(j);
      final int k = shape.left() - (markedLast && j == shells.size() - 1 ? 1 : 0);
      final int g = shape.right();
      count = count.multiply(Binomial.binomial(remaining, k)).multiply(Binomial.binomial(remaining - k, g));
      remaining -= k + g;
    }
    return count;
  }

  private Z shellProduct(final List<Pair<Integer, Integer>> shells, final int c, final int delta, final boolean skipFirst, final boolean skipLast) {
    Z product = Z.ONE;
    int pool = c + delta;
    for (int j = shells.size() - 1; j >= 0; --j) {
      if (pool < 0) {
        return Z.ZERO;
      }
      final Pair<Integer, Integer> shape = shells.get(j);
      final int g = shape.right();
      product = product.multiply(mLimbo.get(g, pool)).multiply(Z.ONE.shiftLeft(pool).subtract(g == 0 ? 1 : 0));
      if (!(skipFirst && j == 0) && !(skipLast && j == shells.size() - 1)) {
        product = product.multiply(mCones.get(1 + shape.left()));
      }
      pool += g;
    }
    return product;
  }

  // First-level counts, indexed by the marked out-degree.
  private final MemoryFunction1<Map<Integer, Z>> mMarked = new MemoryFunction1<>() {
    @Override
    protected Map<Integer, Z> compute(final int n) {
      final Map<Integer, Z> result = new HashMap<>();
      shapes(n, new ArrayList<>(), (shells, core) -> {
        final Z weight = labels(n, shells, false, false).multiply(mFlat.get(core)).multiply(shellProduct(shells, core, 0, true, false));
        mConeDegrees.get(1 + shells.get(0).left()).forEach((t, count) -> add(result, t, weight.multiply(count)));
      });
      return result;
    }
  };

  private Z coreReturn(final List<Pair<Integer, Integer>> shells, final int core, final int only, final boolean mid) {
    Z count = Z.ZERO;
    for (int j = 0; j <= only; ++j) {
      Z product = shellProduct(shells, core, -1 - j, mid, false);
      if (core == 2) {
        product = product.subtract(shellProduct(shells, core, -2 - j, mid, false));
      }
      final Z term = Binomial.binomial(only, j).multiply(product).shiftLeft(only - j);
      count = (j & 1) == 0 ? count.add(term) : count.subtract(term);
    }
    return count;
  }

  private static void addLevel(final Map<List<Integer>, Z> table, final Map<Integer, Z> degrees, final int q, final Z count) {
    if (!count.isZero()) {
      degrees.forEach((t, c) -> add(table, List.of(q, 0, t), count.multiply(c)));
    }
  }

  // Return levels, by in-degree, direct hit, and marked out-degree.
  private final MemoryFunctionInt2<Map<List<Integer>, Z>> mReturn = new MemoryFunctionInt2<>() {
    @Override
    protected Map<List<Integer>, Z> compute(final int n, final int middle) {
      final boolean mid = middle != 0;
      final Map<List<Integer>, Z> result = new HashMap<>();
      shapes(n, new ArrayList<>(), (shells, core) -> {
        final int last = shells.size() - 1;
        final int lastCone = shells.get(last).left() + 1;
        final Map<Integer, Z> degrees = mid ? mConeDegrees.get(1 + shells.get(0).left()) : Map.of(0, Z.ONE);
        if (core >= 2) {
          final Z labels = labels(n, shells, true, false);
          mMarkedDags.get(core - 1).forEach((key, count) -> {
            final int d = key.get(2);
            final int only = key.get(3);
            final Z weight = labels.multiply(count).multiply(coreReturn(shells, core, only, mid))
              .shiftLeft(2L * (core - 1) - key.get(0) - key.get(1) - only - (d == 0 ? 0 : 1));
            addLevel(result, degrees, d == 0 ? 1 : d, weight);
            if (d != 0) {
              addLevel(result, degrees, d + 1, weight);
            }
          });
        }
        if (lastCone >= 2) {
          final Z weight = labels(n, shells, false, true).multiply(mFlat.get(core)).multiply(shellProduct(shells, core, 0, mid, true));
          mMarkedSources.get(lastCone).forEach((key, count) -> {
            final int q = key.get(2);
            final int hit = key.get(3);
            final boolean sourceOnly = key.get(5) == 1;
            final Z base = weight.multiply(count).shiftLeft(lastCone - key.get(1) - key.get(4) - 1);
            if (mid && last == 0) {
              for (int extra = sourceOnly ? 1 : 0; extra <= 1; ++extra) {
                add(result, List.of(q, hit, key.get(0) - hit + extra), base);
              }
            } else {
              addLevel(result, degrees, q + hit, sourceOnly ? base : base.multiply2());
            }
          });
        }
      });
      return result;
    }
  };

  private final MemoryFunctionInt3<Z> mLift = new MemoryFunctionInt3<>() {
    @Override
    protected Z compute(final int t, final int a, final int b) {
      Z count = Z.ZERO;
      for (int v = 0; v <= t; ++v) {
        final Z term = Binomial.binomial(t, v).multiply(Z.ONE.shiftLeft(v).subtract(1).pow(b)).shiftLeft((long) v * a);
        count = ((t - v) & 1) == 0 ? count.add(term) : count.subtract(term);
      }
      return count;
    }
  };

  private static final class Histogram {
    private final int mLast;
    private final Z mWays;
    private final Z mCode;

    private Histogram(final int last, final Z ways, final Z code) {
      mLast = last;
      mWays = ways;
      mCode = code;
    }
  }

  // The packed reverse-boundary DP, with shared prefixes of level data.
  private final class Boundary {
    private final Boundary mParent;
    private final int mDepth;
    private final int mQ;
    private final int mG;
    private final int mT;
    private final Z mPlace;
    private final Map<List<Integer>, Boundary> mChildren = new HashMap<>();
    private final Map<Z, Z> mCounts = new HashMap<>();

    private Boundary(final Boundary parent, final int q, final int g, final int t) {
      mParent = parent;
      mDepth = parent == null ? 0 : parent.mDepth + 1;
      mQ = q;
      mG = g;
      mT = t;
      mPlace = Z.valueOf(mN + 1L).pow(Math.max(0, mDepth - 1));
    }

    private Boundary extend(final int q, final int g, final int t) {
      final List<Integer> key = List.of(q, g, t);
      final Boundary previous = mChildren.get(key);
      if (previous != null) {
        return previous;
      }
      final Boundary child = new Boundary(this, q, g, t);
      if (mCacheEntries < MAX_CACHE_ENTRIES) {
        mChildren.put(key, child);
        ++mCacheEntries;
      }
      return child;
    }

    private Z count(final Z code) {
      if (mParent == null) {
        return Z.ONE;
      }
      final Z previous = mCounts.get(code);
      if (previous != null) {
        return previous;
      }
      final Z[] qr = code.divideAndRemainder(mPlace);
      final int existing = qr[0].intValueExact();
      final Z lower = qr[1];
      Z work = lower;
      int active = 0;
      final Z base = Z.valueOf(mN + 1L);
      for (int k = 1; k < mDepth; ++k) {
        final Z[] digit = work.divideAndRemainder(base);
        active += digit[1].intValueExact();
        work = digit[0];
      }
      Z count = Z.ZERO;
      for (final Histogram h : mHistograms.get(mN, mQ, mDepth)) {
        final int a = active + mQ - h.mLast;
        if (mG < 0 || mG == (a > 0 ? 1 : 0)) {
          final Z lift = mLift.get(mT, a, existing + h.mLast);
          if (!lift.isZero()) {
            count = count.add(h.mWays.multiply(lift).multiply(mParent.count(lower.add(h.mCode))));
          }
        }
      }
      if (mCacheEntries < MAX_CACHE_ENTRIES) {
        mCounts.put(code, count);
        ++mCacheEntries;
      }
      return count;
    }
  }

  private final MemoryFunctionInt3<List<Histogram>> mHistograms = new MemoryFunctionInt3<>() {
    @Override
    protected List<Histogram> compute(final int n, final int q, final int parts) {
      final List<Histogram> result = new ArrayList<>();
      final IntegerComposition compositions = new IntegerComposition(q + parts, parts);
      int[] h;
      while ((h = compositions.next()) != null) {
        int remaining = q;
        Z ways = Z.ONE;
        Z code = Z.ZERO;
        Z place = Z.ONE;
        for (int k = 0; k < h.length - 1; ++k) {
          final int x = h[k] - 1;
          ways = ways.multiply(Binomial.binomial(remaining, x));
          remaining -= x;
          code = code.add(place.multiply(x));
          place = place.multiply(n + 1L);
        }
        result.add(new Histogram(remaining, ways, code));
      }
      return result;
    }
  };

  private Z decorate(final int[] levels, final int j, final boolean entry, final int g, final int t, final Boundary prefix) {
    final int n = levels[j];
    Z count = Z.ZERO;
    if (j == levels.length - 1) {
      if (entry) {
        for (int q = 0; q <= n; ++q) {
          count = count.add(Binomial.binomial(n, q).multiply(prefix.extend(q, g, t).count(Z.ZERO)));
        }
        return count.multiply(mFlat.get(n));
      }
      for (final Map.Entry<List<Integer>, Z> level : mReturn.get(n + 1, 0).entrySet()) {
        count = count.add(level.getValue().multiply(prefix.extend(level.getKey().get(0), g, t).count(Z.ZERO)));
      }
    } else {
      for (final Map.Entry<List<Integer>, Z> level : mReturn.get(n + 2, 1).entrySet()) {
        final List<Integer> key = level.getKey();
        final Boundary next = prefix.extend(key.get(0), g, t);
        count = count.add(level.getValue().multiply(decorate(levels, j + 1, entry, key.get(1), key.get(2), next)));
      }
    }
    return count;
  }

  @Override
  public Z next() {
    ++mN;
    Z count = sum(mMarked.get(mN).values());
    for (int depth = 2; depth < mN; ++depth) {
      mCacheEntries = 0;
      Boundary root = new Boundary(null, 0, -1, 0);
      final IntegerComposition compositions = new IntegerComposition(mN, depth);
      int[] levels;
      while ((levels = compositions.next()) != null) {
        final int inner = levels[depth - 1];
        if (inner < 2) {
          continue;
        }
        if (mCacheEntries >= MAX_CACHE_ENTRIES) {
          mCacheEntries = 0;
          root = new Boundary(null, 0, -1, 0);
        }
        int remaining = mN - 1 - levels[0];
        Z labels = Binomial.binomial(mN - 2, levels[0] - 1);
        for (int k = 1; k < depth - 1; ++k) {
          labels = labels.multiply(Binomial.binomial(remaining, levels[k])).multiply(levels[k]);
          remaining -= levels[k];
        }
        for (final Map.Entry<Integer, Z> first : mMarked.get(levels[0] + 1).entrySet()) {
          final int t = first.getKey();
          final Z outer = labels.multiply(first.getValue());
          final Z atEntry = decorate(levels, 1, true, -1, t, root);
          final Z interior = decorate(levels, 1, false, -1, t, root).multiply(inner - 1);
          count = count.add(outer.multiply(atEntry.add(interior)));
        }
      }
    }
    return count;
  }
}
