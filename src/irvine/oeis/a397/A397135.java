package irvine.oeis.a397;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence2;

/**
 * A397135 Number of words of length n in S, such that S is a set containing the word ab and if a word w of the form xy is in S then w* of the form x(k^r)y is in S where k^r is the reversal of some factor k of w with |k| &gt; 1.
 * @author Sean A. Irvine
 */
public class A397135 extends Sequence2 {

  // After John Tyler Rascoe

  private static final class Word {
    private final int[] mWord;

    private Word(final int[] word) {
      mWord = word;
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof Word && Arrays.equals(mWord, ((Word) obj).mWord);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mWord);
    }
  }

  private static List<int[]> factors(final int[] word) {
    final HashSet<Word> seen = new HashSet<>();
    final ArrayList<int[]> res = new ArrayList<>();
    for (int i = 0; i < word.length; ++i) {
      for (int j = i + 2; j <= word.length; ++j) {
        final int[] t = Arrays.copyOfRange(word, i, j);
        if (seen.add(new Word(t))) {
          res.add(t);
        }
      }
    }
    return res;
  }

  private static Z compute(final int maxN) {
    final HashSet<Word> seen = new HashSet<>();
    final ArrayList<ArrayList<int[]>> generations = new ArrayList<>();
    final ArrayList<Z> counts = new ArrayList<>();
    while (counts.size() <= maxN) {
      counts.add(Z.ZERO);
    }
    counts.set(2, Z.ONE);

    final int[] start = {1, 2};
    final ArrayList<int[]> g0 = new ArrayList<>();
    g0.add(start);
    generations.add(g0);
    seen.add(new Word(start));

    for (int gen = 0; gen < maxN; ++gen) {
      final ArrayList<int[]> next = new ArrayList<>();
      for (final int[] word : generations.get(gen)) {
        for (final int[] factor : factors(word)) {
          final int flen = factor.length;
          for (int pos = 0; pos <= word.length; ++pos) {
            final int[] w = new int[word.length + flen];
            System.arraycopy(word, 0, w, 0, pos);
            for (int k = 0; k < flen; ++k) {
              w[pos + k] = factor[flen - 1 - k];
            }
            System.arraycopy(word, pos, w, pos + flen, word.length - pos);
            if (w.length > maxN) {
              continue;
            }
            final Word key = new Word(w);
            if (seen.add(key)) {
              next.add(w);
              counts.set(w.length, counts.get(w.length).add(1));
            }
          }
        }
      }
      generations.add(next);
    }
    return counts.get(maxN);
  }

  private int mN = 1;

  @Override
  public Z next() {
    return compute(++mN);
  }
}
