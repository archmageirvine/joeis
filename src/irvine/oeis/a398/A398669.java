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
 * A398669 allocated for John Tyler Rascoe.
 * @author Sean A. Irvine
 */
public class A398669 extends Sequence0 {

  // After John T. Rascoe.

  // todo broken! infinite recursion

  /**
   * A word together with its hash/equality based on its entries.
   */
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
      return obj instanceof WordKey && Arrays.equals(mWord, ((WordKey) obj).mWord);
    }
  }

  /**
   * State consisting of a word and its potential-letter array.
   */
  private static final class State {
    private final int[] mWord;
    private final byte[][] mPotential;

    State(final int[] word, final byte[][] potential) {
      mWord = word;
      mPotential = potential;
    }
  }

  private int mN = -1;
  private List<State> mStates = null;
  private byte[][] mPots = null;

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

    // Python: a[0].append(1)
    final byte[] t = new byte[a[0].length + 1];
    System.arraycopy(a[0], 0, t, 0, a[0].length);
    t[a[0].length] = 1;
    a[0] = t;

    return a;
  }

  /*
   * Make a copy of a potential array. This is deliberately a deep copy,
   * since npot modifies rows of the array.
   */
  private static byte[][] copyPotential(final byte[][] a) {
    final byte[][] b = new byte[a.length][];
    for (int i = 0; i < a.length; ++i) {
      b[i] = a[i].clone();
    }
    return b;
  }

  private static byte[][] npot(final int j, final byte[][] f) {
    final byte[][] p = copyPotential(f);

    if (j == 1) {
      ++p[1][0];
      ++p[2][0];
    } else {
      final int g = group(j);
      final int t = Functions.TRIANGULAR.i(g);
      final int r = t + g + 2;

      if (r <= p.length + 1) {
        final int col = rank(j) - 1;
        for (int u = t + 1; u < r; ++u) {
          ++p[u - 1][col];
        }
      }

      for (int u = 0; u < p[j - 1].length; ++u) {
        --p[j - 1][u];
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

  /*
   * Generate the distinct images of word under permutations within each
   * triangular group.
   *
   * The Python version explicitly constructs:
   *
   *   product(permutations(group(1)),
   *           permutations(group(2)), ...)
   *
   * and subsequently puts the resulting words into a set.
   *
   * Here we avoid permutations of group elements which do not occur in
   * the word.  Only the distinct values actually occurring in the word
   * need to be assigned distinct target values.
   *
   * Every generated word is inserted directly into "seen".
   *
   * Returns the number of newly inserted words.
   */
  private static int reachableWords(final int[] word, final Set<WordKey> seen) {
    final int maxGroup = group(Functions.MAX.i(word)); //group(max(word));
    final int[] image = word.clone();

    return reachableGroup(word, image, 1, maxGroup, seen);
  }

  private static int reachableGroup(final int[] word,
                                    final int[] image,
                                    final int g,
                                    final int maxGroup,
                                    final Set<WordKey> seen) {
    if (g > maxGroup) {
      return seen.add(new WordKey(image.clone())) ? 1 : 0;
    }

    final int lo = Functions.TRIANGULAR.i(g) - g + 1;
    final int hi = Functions.TRIANGULAR.i(g);

    // Find the distinct source values from this group which occur in word.
    final int[] sources = new int[g];
    int nsources = 0;

    for (int x = lo; x <= hi; ++x) {
      boolean present = false;
      for (final int value : word) {
        if (value == x) {
          present = true;
          break;
        }
      }
      if (present) {
        sources[nsources++] = x;
      }
    }

    // Nothing from this group occurs in the word.
    if (nsources == 0) {
      return reachableGroup(word, image, g + 1, maxGroup, seen);
    }

    final boolean[] used = new boolean[g];
    return assignGroup(word, image, sources, nsources, 0,
      lo, used, g, maxGroup, seen);
  }

  /*
   * Assign distinct target values from the current group to the distinct
   * source values occurring in the word.
   */
  private static int assignGroup(final int[] word,
                                 final int[] image,
                                 final int[] sources,
                                 final int nsources,
                                 final int pos,
                                 final int lo,
                                 final boolean[] used,
                                 final int g,
                                 final int maxGroup,
                                 final Set<WordKey> seen) {
    if (pos == nsources) {
      return reachableGroup(word, image, g + 1, maxGroup, seen);
    }

    final int source = sources[pos];
    int count = 0;

    for (int k = 0; k < g; ++k) {
      if (!used[k]) {
        used[k] = true;
        final int target = lo + k;

        // Replace every occurrence of source by target.
        for (int i = 0; i < word.length; ++i) {
          if (word[i] == source) {
            image[i] = target;
          }
        }

        count += assignGroup(word, image, sources, nsources, pos + 1,
          lo, used, g, maxGroup, seen);

        // Restore the source value before trying the next target.
        for (int i = 0; i < word.length; ++i) {
          if (word[i] == source) {
            image[i] = source;
          }
        }

        used[k] = false;
      }
    }

    return count;
  }

  /*
   * Advance all states by one letter.
   */
  private void advance() {
    final List<State> next = new ArrayList<>();

    for (final State state : mStates) {
      for (int j = 1; j <= mPots.length; ++j) {
        if (!usable(state.mPotential[j - 1])) {
          continue;
        }

        final int[] word = Arrays.copyOf(state.mWord, state.mWord.length + 1);
        word[word.length - 1] = j;

        next.add(new State(word, npot(j, state.mPotential)));
      }
    }

    mStates = next;
  }

  private Z compute(final int n) {
    if (mStates == null) {
      mPots = pots(n + 1);

      // Python:
      // A = [ [[[], p]] ]
      mStates = new ArrayList<>();
      mStates.add(new State(new int[0], mPots));
      mN = 0;
    }

    while (mN < n) {
      advance();
      ++mN;
    }

    /*
     * This is the second half of the Python algorithm:
     *
     * s = set()
     * z = 0
     * for i2,j in A[i]:
     *     f = 0
     *     for j in reachable_words(i2):
     *         if j not in s:
     *             f += 1
     *         s.add(j)
     *     if f:
     *         z += 1
     *
     * We insert reachable words directly into s, so there is no need
     * to construct a separate set for each state.
     */
    final Set<WordKey> seen = new HashSet<>();
    int z = 0;

    for (final State state : mStates) {
      if (reachableWords(state.mWord, seen) != 0) {
        ++z;
      }
    }

    return Z.valueOf(z);
  }

  @Override
  public Z next() {
    return compute(mN + 1);
  }
}
