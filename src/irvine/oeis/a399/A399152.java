package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399152 a(n) is the minimum number of residues mod M = 2n+1 left uncovered when, for every divisor d &gt; 1 of M, exactly one residue class mod d is removed.
 * @author Sean A. Irvine
 */
public class A399152 extends Sequence1 {

  // After Ege &Ouml;zt&uuml;rk

  private static final Z ONE = Z.ONE;
  private long mN = 0;

  private static final class Search {

    private final int mM;
    private final List<Integer> mDs;
    private final Z[][] mMasks;
    private final int[] mSuf;
    private int mBest;

    Search(final int m, final List<Integer> ds, final Z[][] masks, final int[] suf) {
      mM = m;
      mDs = ds;
      mMasks = masks;
      mSuf = suf;
      mBest = m;
    }

    private void dfs(final int i, final Z cov) {
      final int unc = mM - cov.bitCount();
      if (unc - mSuf[i] >= mBest) {
        return;
      }
      if (i == mDs.size()) {
        mBest = unc;
        return;
      }
      final int d = mDs.get(i);

      /*
       * Translation symmetry: for the first divisor we only need residue 0.
       * Thereafter, all residues have to be considered.
       */
      final int first = 0;
      final int last = i == 0 ? 1 : d;
      final Candidate[] candidates = new Candidate[last - first];
      for (int r = first; r < last; ++r) {
        candidates[r - first] = new Candidate(r, mMasks[i][r].andNot(cov).bitCount());
      }
      // Try the residue giving the largest immediate coverage first.
      Arrays.sort(candidates, Comparator.comparingInt((Candidate c) -> c.mGain).reversed());
      for (final Candidate candidate : candidates) {
        dfs(i + 1, cov.or(mMasks[i][candidate.mResidue]));
      }
    }
  }

  private static final class Candidate {
    private final int mResidue;
    private final int mGain;
    Candidate(final int residue, final int gain) {
      mResidue = residue;
      mGain = gain;
    }
  }

  @Override
  public Z next() {
    ++mN;
    final int m = (int) (2 * mN + 1);
    // Divisors d >= 2 of m, in increasing order.
    final List<Integer> ds = new ArrayList<>();
    for (int d = 2; d <= m; ++d) {
      if (m % d == 0) {
        ds.add(d);
      }
    }

    final int k = ds.size();
    // masks[i][r] is the mask of numbers x with x == r (mod d).
    final Z[][] masks = new Z[k][];
    for (int i = 0; i < k; ++i) {
      final int d = ds.get(i);
      masks[i] = new Z[d];
      for (int r = 0; r < d; ++r) {
        Z mask = Z.ZERO;
        for (int x = r; x < m; x += d) {
          mask = mask.or(ONE.shiftLeft(x));
        }
        masks[i][r] = mask;
      }
    }

    // suf[i] = sum(m/d) for d in ds[i..].
    final int[] suf = new int[k + 1];
    for (int i = k - 1; i >= 0; --i) {
      suf[i] = suf[i + 1] + m / ds.get(i);
    }
    final Search search = new Search(m, ds, masks, suf);
    search.dfs(0, Z.ZERO);
    return Z.valueOf(search.mBest);
  }
}
