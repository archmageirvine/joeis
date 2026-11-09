package irvine.oeis.a401;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CompletionService;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401433 Number of orbits of Aut(F_2) on the subgroups of index n of the free group F_2 of rank 2.
 * @author Sean A. Irvine
 */
public class A401433 extends Sequence1 {

  // After Maja Gwozdz

  private static final int THREADS = Integer.parseInt(System.getProperty("oeis.threads", String.valueOf(Runtime.getRuntime().availableProcessors())));
  private int mN = 0;

  private static final class ImageChunk {
    private final int mStart;
    private final byte[][][] mImages;

    private ImageChunk(final int start, final byte[][][] images) {
      mStart = start;
      mImages = images;
    }
  }

  /**
   * Construct the canonical BFS word for a pair of permutations.
   * @param r first permutation
   * @param u second permutation
   * @param s starting vertex
   * @return BFS word
   */
  private static byte[] word(final int[] r, final int[] u, final int s) {
    final int n = r.length;
    final int[] lab = new int[n];
    Arrays.fill(lab, -1);
    lab[s] = 0;
    final int[] order = new int[n];
    order[0] = s;
    int k = 1;
    final byte[] result = new byte[2 * n];
    int p = 0;
    for (int i = 0; i < k; ++i) {
      final int v = order[i];
      for (final int[] img : new int[][] {r, u}) {
        final int w = img[v];
        if (lab[w] < 0) {
          lab[w] = k;
          order[k++] = w;
        }
        result[p++] = (byte) lab[w];
      }
    }
    return result;
  }

  /**
   * Canonical form, minimized over all possible starting vertices.
   * @param r first permutation
   * @param u second permutation
   * @return canonical word
   */
  private static byte[] canon(final int[] r, final int[] u) {
    byte[] best = word(r, u, 0);
    for (int s = 1; s < r.length; ++s) {
      final byte[] candidate = word(r, u, s);
      if (Arrays.compare(candidate, best) < 0) {
        best = candidate;
      }
    }
    return best;
  }

  private static final class WordKey {
    private final byte[] mWord;
    private final int mHash;

    private WordKey(final byte[] word) {
      mWord = word;
      mHash = Arrays.hashCode(word);
    }

    @Override
    public int hashCode() {
      return mHash;
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof WordKey && Arrays.equals(mWord, ((WordKey) obj).mWord);
    }
  }
  private final class Search {
    private final int[] mR = new int[mN];
    private final int[] mU = new int[mN];
    private final int[] mW = new int[2 * mN];
    private final boolean[][] mUsed = new boolean[2][mN];
    private final List<byte[]> mResult = new ArrayList<>();

    private Search() {
      Arrays.fill(mR, -1);
      Arrays.fill(mU, -1);
    }

    /**
     * Compare a partial BFS word from s against the current prefix.
     * @param s starting vertex
     * @param j prefix length
     * @return negative, zero, or positive according to the comparison
     */
    private int cmp(final int s, final int j) {
      final int[] lab = new int[mN];
      Arrays.fill(lab, -1);
      lab[s] = 0;
      final int[] order = new int[mN];
      order[0] = s;
      int k = 1;
      int p = 0;
      for (int i = 0; i < k; ++i) {
        final int v = order[i];
        for (final int[] img : new int[][] {mR, mU}) {
          final int x = img[v];
          if (x < 0 || p == j) {
            return 0;
          }
          if (lab[x] < 0) {
            lab[x] = k;
            order[k++] = x;
          }
          if (lab[x] != mW[p]) {
            return lab[x] < mW[p] ? -1 : 1;
          }
          ++p;
        }
      }
      return 0;
    }

    private void rec(final int j, final int cnt, final int[] alive) {
      int[] candidates = alive;
      if ((j & 1) == 0) {
        final int[] keep = new int[alive.length];
        int size = 0;
        for (final int s : alive) {
          final int c = cmp(s, j);
          if (c < 0) {
            return;
          }
          if (c == 0) {
            keep[size++] = s;
          }
        }
        candidates = Arrays.copyOf(keep, size);
      }
      if (j == 2 * mN) {
        mResult.add(toBytes(mW));
        return;
      }
      final int k = j / 2;
      if (k >= cnt) {
        return;
      }

      final int t = j & 1;
      final int[] img = t == 0 ? mR : mU;
      final boolean[] used = mUsed[t];
      for (int m = 0; m < Math.min(cnt + 1, mN); ++m) {
        if (!used[m]) {
          used[m] = true;
          img[k] = m;
          mW[j] = m;
          rec(j + 1, cnt + (m == cnt ? 1 : 0), candidates);
          used[m] = false;
          img[k] = -1;
        }
      }
    }

    private byte[] toBytes(final int[] values) {
      final byte[] result = new byte[values.length];
      for (int i = 0; i < values.length; ++i) {
        result[i] = (byte) values[i];
      }
      return result;
    }

    private List<byte[]> generate() {
      rec(0, 1, initialAlive());
      return mResult;
    }

    private int[] initialAlive() {
      final int[] alive = new int[Math.max(0, mN - 1)];
      for (int i = 1; i < mN; ++i) {
        alive[i - 1] = i;
      }
      return alive;
    }
  }

  /**
   * Find the three transformed canonical words for an origami.
   * @param c canonical word
   * @return transformed words
   */
  private static byte[][] images(final byte[] c) {
    final int n = c.length / 2;
    final int[] r = new int[n];
    final int[] u = new int[n];
    for (int i = 0; i < n; ++i) {
      r[i] = c[2 * i];
      u[i] = c[2 * i + 1];
    }

    final int[] ri = new int[n];
    for (int i = 0; i < n; ++i) {
      ri[r[i]] = i;
    }

    final int[] uri = new int[n];
    for (int i = 0; i < n; ++i) {
      uri[i] = u[ri[i]];
    }

    return new byte[][] {
      canon(r, uri),
      canon(u, ri),
      canon(u, r)
    };
  }

  private static int find(final int[] parent, int x) {
    while (parent[x] != x) {
      parent[x] = parent[parent[x]];
      x = parent[x];
    }
    return x;
  }

  @Override
  public Z next() {
    ++mN;
    final List<byte[]> origamis = new Search().generate();
    final int size = origamis.size();
    final Map<WordKey, Integer> index = new HashMap<>(size * 2);
    for (int i = 0; i < size; ++i) {
      index.put(new WordKey(origamis.get(i)), i);
    }
    final int[] parent = new int[size];
    for (int i = 0; i < size; ++i) {
      parent[i] = i;
    }

    final int step = 2000;
    final ExecutorService executor = Executors.newFixedThreadPool(THREADS);
    final CompletionService<ImageChunk> completion =
      new ExecutorCompletionService<>(executor);

    try {
      int tasks = 0;
      for (int start = 0; start < size; start += step) {
        final int lo = start;
        final int hi = Math.min(start + step, size);
        completion.submit(() -> {
          final byte[][][] result = new byte[hi - lo][][];
          for (int i = lo; i < hi; ++i) {
            result[i - lo] = images(origamis.get(i));
          }
          return new ImageChunk(lo, result);
        });
        ++tasks;
      }

      for (int task = 0; task < tasks; ++task) {
        final ImageChunk chunk = completion.take().get();
        for (int j = 0; j < chunk.mImages.length; ++j) {
          final int i = chunk.mStart + j;
          for (final byte[] e : chunk.mImages[j]) {
            final Integer y0 = index.get(new WordKey(e));
            if (y0 == null) {
              throw new IllegalStateException("Transformed origami not found: " + mN);
            }
            final int x = find(parent, i);
            final int y = find(parent, y0);
            if (x != y) {
              parent[x] = y;
            }
          }
        }
      }
    } catch (final InterruptedException e) {
      Thread.currentThread().interrupt();
      throw new RuntimeException(e);
    } catch (final ExecutionException e) {
      throw new RuntimeException(e.getCause());
    } finally {
      executor.shutdownNow();
    }

    int count = 0;
    for (int i = 0; i < size; ++i) {
      if (find(parent, i) == i) {
        ++count;
      }
    }
    return Z.valueOf(count);
  }
}
