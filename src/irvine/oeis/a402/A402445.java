package irvine.oeis.a402;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402445 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A402445 extends Sequence1 {

  // After Alper Ferudun

  private int mN = 0;

  private static final class Cells implements Comparable<Cells> {
    private final long[] mWords;

    private Cells(final long[] words) {
      mWords = words;
    }

    static Cells ofSize(final int totalBits) {
      return new Cells(new long[(totalBits + 63) / 64]);
    }

    void put(final int v) {
      mWords[v >>> 6] |= 1L << (v & 63);
    }

    int popCount() {
      int sum = 0;
      for (final long w : mWords) {
        sum += Long.bitCount(w);
      }
      return sum;
    }

    int[] list() {
      final int[] out = new int[popCount()];
      int idx = 0;
      for (int k = 0; k < mWords.length; ++k) {
        long w = mWords[k];
        while (w != 0) {
          out[idx++] = (k << 6) + Long.numberOfTrailingZeros(w);
          w &= w - 1;
        }
      }
      return out;
    }

    @Override
    public int compareTo(final Cells other) {
      final int len = Math.max(mWords.length, other.mWords.length);
      for (int i = len - 1; i >= 0; --i) {
        final long a = i < mWords.length ? mWords[i] : 0L;
        final long b = i < other.mWords.length ? other.mWords[i] : 0L;
        final int cmp = Long.compareUnsigned(a, b);
        if (cmp != 0) {
          return cmp;
        }
      }
      return 0;
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof Cells && compareTo((Cells) obj) == 0;
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mWords);
    }
  }

  private static final class Job {
    private final Cells mFree;
    private final int mWeight;

    private Job(final Cells free, final int weight) {
      mFree = free;
      mWeight = weight;
    }

    Cells free() {
      return mFree;
    }

    int weight() {
      return mWeight;
    }
  }

  private static final class Edge {
    private final int mA;
    private final int mB;
    private final int mC;

    private Edge(final int a, final int b, final int c) {
      mA = a;
      mB = b;
      mC = c;
    }
  }

  private static final class Factor {
    private final long mScope;
    private final Z[] mValues;

    private Factor(final long scope, final Z[] values) {
      mScope = scope;
      mValues = values;
    }
  }

  private static final class CoverKeyEntry implements Comparable<CoverKeyEntry> {
    private final long mMask;
    private final int mExtra;
    private final boolean mRequired;

    private CoverKeyEntry(final long mask, final int extra, final boolean required) {
      mMask = mask;
      mExtra = extra;
      mRequired = required;
    }

    @Override
    public int compareTo(final CoverKeyEntry o) {
      final int c1 = Long.compareUnsigned(mMask, o.mMask);
      if (c1 != 0) {
        return c1;
      }
      final int c2 = Integer.compare(mExtra, o.mExtra);
      if (c2 != 0) {
        return c2;
      }
      return Boolean.compare(mRequired, o.mRequired);
    }

    @Override
    public boolean equals(final Object obj) {
      if (!(obj instanceof CoverKeyEntry)) {
        return false;
      }
      final CoverKeyEntry other = (CoverKeyEntry) obj;
      return mMask == other.mMask && mExtra == other.mExtra && mRequired == other.mRequired;
    }

    @Override
    public int hashCode() {
      return Objects.hash(mMask, mExtra, mRequired);
    }
  }

  private static int[] bits(long x) {
    final int[] out = new int[Long.bitCount(x)];
    int idx = 0;
    while (x != 0) {
      out[idx++] = Long.numberOfTrailingZeros(x);
      x &= x - 1;
    }
    return out;
  }

  private static List<Job> jobs(final int n) {
    final TreeMap<Cells, Integer> map = new TreeMap<>();
    for (int a = 1; a < 16; ++a) {
      for (int b = 1; b < 512; ++b) {
        final Cells[] views = new Cells[8];
        for (int t = 0; t < 8; ++t) {
          views[t] = Cells.ofSize(n * n);
        }
        for (int i = 0; i < n; ++i) {
          for (int j = 0; j < n; ++j) {
            if (((a >>> ((i % 2) * 2 + (j % 2))) & 1) == 0
              && ((b >>> ((i % 3) * 3 + (j % 3))) & 1) == 0) {
              for (int t = 0; t < 8; ++t) {
                int x = i;
                int y = j;
                if ((t & 1) != 0) {
                  x = n - 1 - x;
                }
                if ((t & 2) != 0) {
                  y = n - 1 - y;
                }
                if ((t & 4) != 0) {
                  final int tmp = x;
                  x = y;
                  y = tmp;
                }
                views[t].put(x * n + y);
              }
            }
          }
        }
        Cells minKey = views[0];
        for (int t = 1; t < 8; ++t) {
          if (views[t].compareTo(minKey) < 0) {
            minKey = views[t];
          }
        }
        final int delta = ((Integer.bitCount(a) + Integer.bitCount(b)) & 1) == 0 ? 1 : -1;
        map.merge(minKey, delta, Integer::sum);
      }
    }
    final List<Job> result = new ArrayList<>();
    for (final Map.Entry<Cells, Integer> e : map.entrySet()) {
      if (e.getValue() != 0) {
        result.add(new Job(e.getKey(), e.getValue()));
      }
    }
    result.sort(Comparator.comparingInt((final Job j) -> j.free().popCount()).reversed());
    return result;
  }

  private static final class GraphSolver {
    private static final long MAX_MEMO_BYTES = 256L * 1024L * 1024L;
    private static final long MAX_FACTOR_BYTES = 1024L * 1024L * 1024L;
    private static final int MAX_WIDTH = 22;

    private final Map<List<CoverKeyEntry>, Z> mMemo = new HashMap<>();
    private long mBytes = 0L;

    Z cover(final int nleft, final int nright, final int[][] pairEdges, final boolean[] initCl, final boolean[] initCr) {
      final boolean[] cl = initCl.clone();
      final boolean[] cr = initCr.clone();
      final int[] dl = new int[nleft];
      final int[] dr = new int[nright];
      for (final int[] e : pairEdges) {
        ++dl[e[0]];
        ++dr[e[1]];
      }
      for (int a = 0; a < nleft; ++a) {
        if (!cl[a] && dl[a] == 0) {
          return Z.ZERO;
        }
      }
      for (int b = 0; b < nright; ++b) {
        if (!cr[b] && dr[b] == 0) {
          return Z.ZERO;
        }
      }
      final boolean[] mandatory = new boolean[pairEdges.length];
      for (int k = 0; k < pairEdges.length; ++k) {
        final int a = pairEdges[k][0];
        final int b = pairEdges[k][1];
        if ((!cl[a] && dl[a] == 1) || (!cr[b] && dr[b] == 1)) {
          mandatory[k] = true;
          cl[a] = true;
          cr[b] = true;
        }
      }
      final long[] masks = new long[nright];
      final int[] extra = new int[nright];
      for (int k = 0; k < pairEdges.length; ++k) {
        if (mandatory[k]) {
          continue;
        }
        final int a = pairEdges[k][0];
        final int b = pairEdges[k][1];
        if (cl[a]) {
          ++extra[b];
        } else {
          masks[b] |= 1L << a;
        }
      }
      Z constant = Z.ONE;
      final List<CoverKeyEntry> key = new ArrayList<>();
      for (int b = 0; b < nright; ++b) {
        if (masks[b] == 0L) {
          long factor = 1L << extra[b];
          if (!cr[b]) {
            --factor;
          }
          constant = constant.multiply(factor);
          if (constant.isZero()) {
            return Z.ZERO;
          }
        } else {
          key.add(new CoverKeyEntry(masks[b], extra[b], !cr[b]));
        }
      }
      key.sort(Comparator.naturalOrder());
      final Z cached = mMemo.get(key);
      if (cached != null) {
        return constant.multiply(cached);
      }

      List<Factor> factors = new ArrayList<>(key.size());
      for (final CoverKeyEntry entry : key) {
        final int scopeBits = Long.bitCount(entry.mMask);
        final int size = 1 << scopeBits;
        final Z[] values = new Z[size];
        final int reqSub = entry.mRequired ? 1 : 0;
        for (int z = 0; z < size; ++z) {
          final int exp = entry.mExtra + scopeBits - Integer.bitCount(z);
          values[z] = Z.ONE.shiftLeft(exp).subtract(reqSub);
        }
        factors.add(new Factor(entry.mMask, values));
      }

      Z answer = Z.ONE;
      while (!factors.isEmpty()) {
        long all = 0L;
        final long[] adjacent = new long[49];
        for (final Factor f : factors) {
          all |= f.mScope;
          for (final int v : bits(f.mScope)) {
            adjacent[v] |= f.mScope & ~(1L << v);
          }
        }
        int bestVar = -1;
        long bestScore0 = Long.MAX_VALUE;
        long bestScore1 = Long.MAX_VALUE;
        for (final int v : bits(all)) {
          final long nb = adjacent[v];
          long fill = 0L;
          for (final int u : bits(nb)) {
            fill += Long.bitCount(nb & ~adjacent[u] & ~(1L << u));
          }
          final long score0 = fill / 2L;
          final long score1 = Long.bitCount(nb);
          if (score0 < bestScore0
            || (score0 == bestScore0 && (score1 < bestScore1 || (score1 == bestScore1 && v < bestVar)))) {
            bestVar = v;
            bestScore0 = score0;
            bestScore1 = score1;
          }
        }
        final int var = bestVar;
        final List<Factor> involved = new ArrayList<>();
        final List<Factor> keep = new ArrayList<>();
        long merged = 0L;
        for (final Factor f : factors) {
          if (((f.mScope >>> var) & 1L) != 0L) {
            merged |= f.mScope;
            involved.add(f);
          } else {
            keep.add(f);
          }
        }
        final long outScope = merged & ~(1L << var);
        final int[] outBits = bits(outScope);
        final int width = outBits.length;
        if (width > MAX_WIDTH) {
          throw new IllegalStateException("Factor width " + width + " exceeds limit");
        }
        final int size = 1 << width;
        long oldEntries = 0L;
        for (final Factor f : involved) {
          oldEntries += f.mValues.length;
        }
        for (final Factor f : keep) {
          oldEntries += f.mValues.length;
        }
        final long allocation = oldEntries * 64L + (long) size * (64L + 4L * involved.size());
        if (allocation > MAX_FACTOR_BYTES) {
          throw new IllegalStateException("Factor memory limit exceeded");
        }

        final int m = involved.size();
        final int[][] projections = new int[m][size];
        final int[] varBits = new int[m];
        for (int k = 0; k < m; ++k) {
          final int[] fb = bits(involved.get(k).mScope);
          int varPos = -1;
          for (int i = 0; i < fb.length; ++i) {
            if (fb[i] == var) {
              varPos = i;
              break;
            }
          }
          varBits[k] = 1 << varPos;
          final int[] bitMap = new int[width];
          for (int i = 0; i < width; ++i) {
            int pos = -1;
            for (int j = 0; j < fb.length; ++j) {
              if (fb[j] == outBits[i]) {
                pos = j;
                break;
              }
            }
            bitMap[i] = pos >= 0 ? (1 << pos) : 0;
          }
          final int[] p = projections[k];
          for (int z = 1; z < size; ++z) {
            p[z] = p[z & (z - 1)] | bitMap[Integer.numberOfTrailingZeros(z)];
          }
        }

        final Z[] values = new Z[size];
        for (int z = 0; z < size; ++z) {
          Z zero = Z.ONE;
          Z one = Z.ONE;
          for (int k = 0; k < m; ++k) {
            final int p = projections[k][z];
            final Z[] fvals = involved.get(k).mValues;
            zero = zero.multiply(fvals[p]);
            one = one.multiply(fvals[p | varBits[k]]);
          }
          values[z] = zero.subtract(one);
        }

        if (outScope == 0L) {
          answer = answer.multiply(values[0]);
        } else {
          keep.add(new Factor(outScope, values));
        }
        factors = keep;
      }

      final long cost = (long) key.size() * 16L + 104L;
      if (mBytes + cost <= MAX_MEMO_BYTES) {
        mBytes += cost;
        mMemo.put(key, answer);
      }
      return constant.multiply(answer);
    }
  }

  private static Z product(final int[] counts) {
    Z acc = Z.ONE;
    for (final int d : counts) {
      if (d == 0) {
        return Z.ZERO;
      }
      acc = acc.multiply(Z.ONE.shiftLeft(d).subtract(1));
    }
    return acc;
  }

  private static Z allThree(final Edge[] edges, final GraphSolver solver) {
    final int[] da = new int[25];
    final int[] db = new int[49];
    final int[] dc = new int[121];
    for (final Edge e : edges) {
      ++da[e.mA];
      ++db[e.mB];
      ++dc[e.mC];
    }
    if (containsZero(da) || containsZero(db) || containsZero(dc)) {
      return Z.ZERO;
    }
    final boolean[] ca = new boolean[25];
    final boolean[] cb = new boolean[49];
    final boolean[] cc = new boolean[121];
    final boolean[] forced = new boolean[edges.length];
    for (int k = 0; k < edges.length; ++k) {
      final Edge e = edges[k];
      if (da[e.mA] == 1 || db[e.mB] == 1 || dc[e.mC] == 1) {
        forced[k] = true;
        ca[e.mA] = true;
        cb[e.mB] = true;
        cc[e.mC] = true;
      }
    }
    final List<Edge> filteredList = new ArrayList<>(edges.length);
    for (int k = 0; k < edges.length; ++k) {
      if (!forced[k]) {
        filteredList.add(edges[k]);
      }
    }
    final Edge[] filtered = filteredList.toArray(new Edge[0]);
    final int[] fdb = new int[49];
    final int[] fdc = new int[121];
    @SuppressWarnings("unchecked")
    final List<Integer>[] groups = new List[25];
    for (int a = 0; a < 25; ++a) {
      groups[a] = new ArrayList<>();
    }
    for (int k = 0; k < filtered.length; ++k) {
      final Edge e = filtered[k];
      ++fdb[e.mB];
      ++fdc[e.mC];
      groups[e.mA].add(k);
    }

    final List<Integer> varsList = new ArrayList<>();
    for (int a = 0; a < 25; ++a) {
      if (!ca[a]) {
        varsList.add(a);
      }
    }
    varsList.sort((a, b) -> Integer.compare(groupScore(groups[b], filtered, cb, cc, fdb, fdc),
      groupScore(groups[a], filtered, cb, cc, fdb, fdc)));
    final int[] vars = varsList.stream().mapToInt(Integer::intValue).toArray();

    final boolean[] active = new boolean[filtered.length];
    Arrays.fill(active, true);
    final Z[] acc = {Z.ZERO, Z.ZERO};
    walkAllThree(0, false, vars, filtered, groups, cb, cc, active, fdb, fdc, solver, acc);
    return acc[0].subtract(acc[1]);
  }

  private static int groupScore(final List<Integer> grp, final Edge[] edges,
                                final boolean[] cb, final boolean[] cc,
                                final int[] db, final int[] dc) {
    int total = 0;
    for (final int k : grp) {
      final Edge e = edges[k];
      final int bTerm = cb[e.mB] ? 0 : 100 / Math.max(1, db[e.mB]);
      final int cTerm = cc[e.mC] ? 0 : 100 / Math.max(1, dc[e.mC]);
      total += bTerm + cTerm;
    }
    return total;
  }

  private static void walkAllThree(final int depth, final boolean negative, final int[] vars,
                                   final Edge[] edges, final List<Integer>[] groups,
                                   final boolean[] cb, final boolean[] cc,
                                   final boolean[] active, final int[] db, final int[] dc,
                                   final GraphSolver solver, final Z[] acc) {
    if (depth == vars.length) {
      final List<int[]> pairList = new ArrayList<>();
      for (int k = 0; k < edges.length; ++k) {
        if (active[k]) {
          pairList.add(new int[] {edges[k].mB, edges[k].mC});
        }
      }
      final int[][] pairs = pairList.toArray(new int[0][]);
      final Z x = solver.cover(49, 121, pairs, cb, cc);
      if (negative) {
        acc[1] = acc[1].add(x);
      } else {
        acc[0] = acc[0].add(x);
      }
      return;
    }
    walkAllThree(depth + 1, negative, vars, edges, groups, cb, cc, active, db, dc, solver, acc);

    final int a = vars[depth];
    boolean ok = true;
    for (final int k : groups[a]) {
      final Edge e = edges[k];
      active[k] = false;
      --db[e.mB];
      --dc[e.mC];
      if ((!cb[e.mB] && db[e.mB] == 0) || (!cc[e.mC] && dc[e.mC] == 0)) {
        ok = false;
      }
    }
    if (ok) {
      walkAllThree(depth + 1, !negative, vars, edges, groups, cb, cc, active, db, dc, solver, acc);
    }
    for (final int k : groups[a]) {
      final Edge e = edges[k];
      active[k] = true;
      ++db[e.mB];
      ++dc[e.mC];
    }
  }

  private static Z smallProduct(final int[] hist, final int shift) {
    if (hist[0] > 0) {
      return Z.ZERO;
    }
    Z z = Z.ONE;
    for (int d = 2; d < 26; ++d) {
      if (hist[d] > 0) {
        z = z.multiply(Z.ONE.shiftLeft(d).subtract(1).pow(hist[d]));
      }
    }
    return shift > 0 ? z.shiftLeft(shift) : z;
  }

  private static Z gray57(final Edge[] edges) {
    final int[] left = new int[25];
    final int[] right = new int[49];
    for (final Edge e : edges) {
      ++left[e.mA];
      ++right[e.mB];
    }
    if (containsZero(left) || containsZero(right)) {
      return Z.ZERO;
    }
    final boolean[] coveredLeft = new boolean[25];
    final boolean[] coveredRight = new boolean[49];
    for (final Edge e : edges) {
      if (left[e.mA] == 1 || right[e.mB] == 1) {
        coveredLeft[e.mA] = true;
        coveredRight[e.mB] = true;
      }
    }
    final List<Integer> verticesList = new ArrayList<>();
    for (int v = 0; v < 25; ++v) {
      if (!coveredLeft[v]) {
        verticesList.add(v);
      }
    }
    final int m = verticesList.size();
    final int[] index = new int[25];
    Arrays.fill(index, -1);
    for (int i = 0; i < m; ++i) {
      index[verticesList.get(i)] = i;
    }

    @SuppressWarnings("unchecked")
    final List<Integer>[] neighbors = new List[m];
    for (int i = 0; i < m; ++i) {
      neighbors[i] = new ArrayList<>();
    }
    final int[] degree = new int[49];
    int shift = 0;
    for (final Edge e : edges) {
      if (left[e.mA] == 1 || right[e.mB] == 1) {
        continue;
      }
      if (coveredRight[e.mB]) {
        ++shift;
      } else {
        ++degree[e.mB];
      }
      if (!coveredLeft[e.mA]) {
        neighbors[index[e.mA]].add(e.mB);
      }
    }
    final int[] histogram = new int[26];
    for (int v = 0; v < 49; ++v) {
      if (!coveredRight[v]) {
        ++histogram[degree[v]];
      }
    }

    Z positive = Z.ZERO;
    Z negative = Z.ZERO;
    int previous = 0;
    final int totalSteps = 1 << m;
    for (int step = 0; step < totalSteps; ++step) {
      if (step > 0) {
        final int gray = step ^ (step >>> 1);
        final int changed = Integer.numberOfTrailingZeros(gray ^ previous);
        final boolean remove = ((gray >>> changed) & 1) != 0;
        for (final int v : neighbors[changed]) {
          if (coveredRight[v]) {
            if (remove) {
              --shift;
            } else {
              ++shift;
            }
          } else {
            --histogram[degree[v]];
            if (remove) {
              --degree[v];
            } else {
              ++degree[v];
            }
            ++histogram[degree[v]];
          }
        }
        previous = gray;
      }
      final Z value = smallProduct(histogram, shift);
      if ((step & 1) == 0) {
        positive = positive.add(value);
      } else {
        negative = negative.add(value);
      }
    }
    return positive.subtract(negative);
  }

  private static boolean containsZero(final int[] arr) {
    for (final int v : arr) {
      if (v == 0) {
        return true;
      }
    }
    return false;
  }

  private static Z cube(final int n, final Cells free, final GraphSolver solver) {
    final int[] cells = free.list();
    final int[] d5 = new int[25];
    final int[] d7 = new int[49];
    final int[] d11 = new int[121];
    final Edge[] edges = new Edge[cells.length];
    final int[][] abEdges = new int[cells.length][2];
    final int[][] acEdges = new int[cells.length][2];
    final int[][] bcEdges = new int[cells.length][2];

    for (int k = 0; k < cells.length; ++k) {
      final int v = cells[k];
      final int i = v / n;
      final int j = v % n;
      final Edge e = new Edge((i % 5) * 5 + (j % 5), (i % 7) * 7 + (j % 7), (i % 11) * 11 + (j % 11));
      ++d5[e.mA];
      ++d7[e.mB];
      ++d11[e.mC];
      edges[k] = e;
      abEdges[k][0] = e.mA;
      abEdges[k][1] = e.mB;
      acEdges[k][0] = e.mA;
      acEdges[k][1] = e.mC;
      bcEdges[k][0] = e.mB;
      bcEdges[k][1] = e.mC;
    }
    final Z s5 = product(d5);
    final Z s7 = product(d7);
    final Z s11 = product(d11);
    Z positive = Z.ONE.shiftLeft(cells.length);
    Z negative = s5.add(s7).add(s11);
    if (!s5.isZero() && !s7.isZero()) {
      positive = positive.add(n >= 23 ? gray57(edges) : solver.cover(25, 49, abEdges, new boolean[25], new boolean[49]));
    }
    if (!s5.isZero() && !s11.isZero()) {
      positive = positive.add(solver.cover(25, 121, acEdges, new boolean[25], new boolean[121]));
    }
    if (!s7.isZero() && !s11.isZero()) {
      positive = positive.add(solver.cover(49, 121, bcEdges, new boolean[49], new boolean[121]));
    }
    if (!s5.isZero() && !s7.isZero() && !s11.isZero()) {
      negative = negative.add(allThree(edges, solver));
    }
    return positive.subtract(negative);
  }

  private static Z computeTerm(final int n) {
    final List<Job> work = jobs(n);
    final GraphSolver solver = new GraphSolver();
    Z pos = Z.ZERO;
    Z neg = Z.ZERO;
    for (final Job job : work) {
      final int w = job.weight();
      final Z x = cube(n, job.free(), solver).multiply(Math.abs(w));
      if (w > 0) {
        pos = pos.add(x);
      } else {
        neg = neg.add(x);
      }
    }
    return pos.subtract(neg);
  }

  @Override
  public Z next() {
    return computeTerm(++mN);
  }
}
