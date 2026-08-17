package irvine.oeis.a398;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A398669.
 * @author Sean A. Irvine
 */
public class A398669 extends Sequence0 {

  // After John T. Rascoe.

  private int mN = -1;

  private static int group(final int i) {
    return 1 + ((int) Math.sqrt(8L * (i - 1) + 1) - 1) / 2;
  }

  private static int rank(final int i) {
    final int g = group(i);
    return g - (Functions.TRIANGULAR.i(g) - i);
  }

  private static byte[][] pots(final int nMax) {
    final int size = Functions.TRIANGULAR.i(group(nMax));
    final byte[][] a = new byte[size][];
    for (int i = 1; i <= size; ++i) {
      a[i - 1] = new byte[group(i) - 1];
    }
    // a[0].append(1)
    final byte[] t = new byte[a[0].length + 1];
    System.arraycopy(a[0], 0, t, 0, a[0].length);
    t[a[0].length] = 1;
    a[0] = t;
    return a;
  }

  // Creates a safe modifiable version of a given row in the copy
  private static byte[] writable(final byte[][] p, final boolean[] copied, final int row) {
    if (!copied[row]) {
      p[row] = p[row].clone();
      copied[row] = true;
    }
    return p[row];
  }

  private static byte[][] npot(final int j, final byte[][] f) {
    final byte[][] p = f.clone();
    final boolean[] copied = new boolean[p.length];

    if (j == 1) {
      ++writable(p, copied, 1)[0];
      ++writable(p, copied, 2)[0];
    } else {
      final int g = group(j);
      final int t = Functions.TRIANGULAR.i(g);
      final int r = t + g + 2;

      if (r <= p.length + 1) {
        final int col = rank(j) - 1;
        for (int u = t + 1; u < r; ++u) {
          ++writable(p, copied, u - 1)[col];
        }
      }

      final byte[] row = writable(p, copied, j - 1);
      for (int u = 0; u < row.length; ++u) {
        --row[u];
      }
    }
    return p;
  }

  private static boolean usable(final byte[] row) {
    for (final byte x : row) {
      if (x <= 0) {
        return false;
      }
    }
    return true;
  }

  private static final class State {
    private final int[] mWord;
    private final byte[][] mPotential;

    State(final int[] word, final byte[][] potential) {
      mWord = word;
      mPotential = potential;
    }
  }

  // Return the distinct elements of the specified triangular group which occur in w.
  private static int[] occurring(final int[] w, final int lo, final int hi) {
    final boolean[] present = new boolean[hi - lo + 1];

    for (final int x : w) {
      if (x >= lo && x <= hi) {
        present[x - lo] = true;
      }
    }

    int count = 0;
    for (final boolean b : present) {
      if (b) {
        ++count;
      }
    }

    final int[] result = new int[count];
    int k = 0;
    for (int i = 0; i < present.length; ++i) {
      if (present[i]) {
        result[k++] = lo + i;
      }
    }
    return result;
  }

  // Generate all distinct images of w under permutations of one triangular group.
  private static void permuteGroup(final int[] word, final int[] source, final int pos, final int lo, final int hi, final boolean[] used, final int[] image, final List<int[]> result) {
    if (pos == source.length) {
      result.add(image.clone());
      return;
    }

    for (int x = lo; x <= hi; ++x) {
      if (!used[x - lo]) {
        used[x - lo] = true;
        for (int i = 0; i < word.length; ++i) {
          if (word[i] == source[pos]) {
            image[i] = x;
          }
        }
        permuteGroup(word, source, pos + 1, lo, hi, used, image, result);
        used[x - lo] = false;
      }
    }
  }

  private static Set<WordKey> reachableWords(final int[] w) {
    final Set<WordKey> current = new HashSet<>();
    current.add(new WordKey(w));

    if (w.length == 0) {
      return current;
    }

    final int max = Arrays.stream(w).max().getAsInt();
    final int maxGroup = group(max);

    for (int g = 1; g <= maxGroup; ++g) {
      final int lo = Functions.TRIANGULAR.i(g) - g + 1;
      final int hi = Functions.TRIANGULAR.i(g);

      final Set<WordKey> next = new HashSet<>();

      for (final WordKey key : current) {
        final int[] source = occurring(key.mWord, lo, hi);

        if (source.length == 0) {
          next.add(key);
          continue;
        }

        final boolean[] used = new boolean[g];
        final int[] image = key.mWord.clone();
        final List<int[]> images = new ArrayList<>();

        permuteGroup(key.mWord, source, 0, lo, hi,
          used, image, images);

        for (final int[] x : images) {
          next.add(new WordKey(x));
        }
      }

      current.clear();
      current.addAll(next);
    }

    return current;
  }

  private static final class WordKey {
    private final int[] mWord;
    private final int mHash;

    WordKey(final int[] word) {
      mWord = word;
      mHash = Arrays.hashCode(word);
    }

    @Override
    public int hashCode() {
      return mHash;
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof WordKey
        && Arrays.equals(mWord, ((WordKey) obj).mWord);
    }
  }

  private Z compute(final int nMax) {
    final byte[][] p = pots(nMax + 1);

    final List<State> states = new ArrayList<>();
    states.add(new State(new int[0], p));

    for (int n = 0; n < nMax; ++n) {
      final List<State> next = new ArrayList<>();

      for (final State state : states) {
        for (int j = 1; j <= p.length; ++j) {
          if (!usable(state.mPotential[j - 1])) {
            continue;
          }

          final int[] word =
            Arrays.copyOf(state.mWord, state.mWord.length + 1);
          word[word.length - 1] = j;

          next.add(new State(word, npot(j, state.mPotential)));
        }
      }

      states.clear();
      states.addAll(next);
    }

    // The Python code has D[0] = 1.
    if (nMax == 0) {
      return Z.ONE;
    }

    final Set<WordKey> seen = new HashSet<>();
    int z = 0;

    for (final State state : states) {
      boolean newWord = false;

      for (final WordKey word : reachableWords(state.mWord)) {
        if (seen.add(word)) {
          newWord = true;
        }
      }

      if (newWord) {
        ++z;
      }
    }

    return Z.valueOf(z);
  }

  @Override
  public Z next() {
    return compute(++mN);
  }
}
