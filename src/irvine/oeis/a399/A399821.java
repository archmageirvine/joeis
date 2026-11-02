package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Set;

import irvine.factor.prime.Fast;
import irvine.math.LongUtils;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A399821 allocated for Jwalin Bhatt.
 * @author Sean A. Irvine
 */
public class A399821 extends Sequence0 {

  // After Jwalin Bhatt

  private final Fast mPrime = new Fast();
  private int mN = -1;

  private List<Integer> primesUpTo(final int n) {
    final List<Integer> primes = new ArrayList<>();
    for (long k = 2; k <= n; k = mPrime.nextPrime(k)) {
      primes.add((int) k);
    }
    return primes;
  }

  /**
   * Compare two lists lexicographically.
   * @param a first list
   * @param b second list
   * @return comparison
   */
  private static int compareLists(final List<Long> a, final List<Long> b) {
    for (int k = 0; k < Math.min(a.size(), b.size()); ++k) {
      final int c = Long.compare(a.get(k), b.get(k));
      if (c != 0) {
        return c;
      }
    }
    return Integer.compare(a.size(), b.size());
  }

  private static final class Candidate {
    private final long[] mValues;

    private Candidate(final long[] values) {
      mValues = values;
    }
  }

  private static final class Search {
    private final long mStep;
    private final PriorityQueue<Candidate> mHeap = new PriorityQueue<>((a, b) -> {
      final int c = Integer.compare(b.mValues.length, a.mValues.length);
      return c != 0 ? c : LongUtils.compare(a.mValues, b.mValues);
    });
    private final Set<List<Long>> mSeen = new HashSet<>();

    private Search(final long step) {
      mStep = step;
    }

    private void add(final List<Long> values) {
      if (values.isEmpty()) {
        return;
      }

      // Normalize by translation
      final long first = values.get(0);
      final List<Long> h = new ArrayList<>(values.size());
      for (final long x : values) {
        h.add(x - first);
      }

      // Canonicalize up to reversal
      final List<Long> reverse = new ArrayList<>(h.size());
      final long last = h.get(h.size() - 1);
      for (int k = h.size() - 1; k >= 0; --k) {
        reverse.add(last - h.get(k));
      }

      final List<Long> canonical = compareLists(h, reverse) <= 0 ? h : reverse;
      final List<Long> key = Collections.unmodifiableList(new ArrayList<>(canonical));
      if (mSeen.add(key)) {
        mHeap.add(new Candidate(LongUtils.toLong(key)));
      }
    }

    private int run(final List<Integer> primes) {
      while (!mHeap.isEmpty()) {
        final long[] h = mHeap.remove().mValues;
        final int len = h.length;
        int divisor = 0;
        for (final int p : primes) {
          if (p > len) {
            break;
          }
          final Set<Long> residues = new HashSet<>();
          for (final long x : h) {
            residues.add(x % p);
          }
          if (residues.size() == p) {
            divisor = p;
            break;
          }
        }
        if (divisor == 0) {
          return len;
        }
        for (int residue = 0; residue < divisor; ++residue) {
          List<Long> part = new ArrayList<>();
          long previous = 0;
          boolean havePrevious = false;
          for (final long x : h) {
            if (x % divisor == residue) {
              continue;
            }
            if (havePrevious && x - previous > mStep) {
              add(part);
              part = new ArrayList<>();
            }
            part.add(x);
            previous = x;
            havePrevious = true;
          }
          add(part);
        }
      }
      throw new IllegalStateException();
    }
  }

  @Override
  public Z next() {
    ++mN;
    final long step = 2L * mN;
    long modulus = 1;
    long p = 1;
    List<Long> residues;
    List<Integer> cuts;
    do {
      p = mPrime.nextPrime(p);
      modulus = Math.multiplyExact(modulus, p);
      residues = new ArrayList<>();
      for (long x = 0; x < modulus; ++x) {
        if (Functions.GCD.l(x, modulus) == 1) {
          residues.add(x);
        }
      }
      final int m = residues.size();
      cuts = new ArrayList<>();
      for (int i = 0; i < m; ++i) {
        final long next = i + 1 == m ? residues.get(0) + modulus : residues.get(i + 1);
        if (next - residues.get(i) > step) {
          cuts.add(i);
        }
      }
    } while (cuts.isEmpty());

    final int m = residues.size();
    final List<Long> doubled = new ArrayList<>(2 * m);
    doubled.addAll(residues);
    for (final long x : residues) {
      doubled.add(x + modulus);
    }

    final Search search = new Search(step);
    for (int k = 0; k < cuts.size(); ++k) {
      final int i = cuts.get(k);
      final int j = k + 1 < cuts.size() ? cuts.get(k + 1) : cuts.get(0) + m;
      search.add(new ArrayList<>(doubled.subList(i + 1, j + 1)));
    }

    final int maxLength = search.mHeap.peek().mValues.length;
    return Z.valueOf(search.run(primesUpTo(maxLength)));
  }
}
