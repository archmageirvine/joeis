package irvine.oeis.transform;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.MemoryFunctionInt2;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * Deleham DELTA transform.
 *
 * T(n,k) is defined by
 *
 *   P(0,k)=1
 *   P(n,-1)=0
 *   P(n,k)=P(n,k-1)+(x*r(k)+y*s(k))*P(n-1,k+1)
 *
 * and T(n,k) is the coefficient of x^(n-k)y^k in P(n,0).
 *
 * Sequence is read by rows.
 *
 * @author Sean A. Irvine
 */
public class DelehamDeltaSequence extends AbstractSequence {

  private final Sequence mR;
  private final Sequence mS;
  private final ArrayList<Z> mRv = new ArrayList<>();
  private final ArrayList<Z> mSv = new ArrayList<>();

  /**
   * Construct the DELTA transform.
   * @param offset sequence offset
   * @param r first sequence
   * @param s second sequence
   */
  public DelehamDeltaSequence(final int offset, final Sequence r, final Sequence s) {
    super(offset);
    mR = r;
    mS = s;
  }

  /**
   * Construct the DELTA transform.
   * @param r first sequence
   * @param s second sequence
   */
  public DelehamDeltaSequence(final Sequence r, final Sequence s) {
    this(0, r, s);
  }

  private final MemoryFunctionInt2<Z[]> mP = new MemoryFunctionInt2<>() {
    @Override
    protected Z[] compute(final int n, final int k) {
      if (n == 0) {
        return new Z[] {Z.ONE};
      }
      if (k < 0) {
        final Z[] t = new Z[n + 1];
        Arrays.fill(t, Z.ZERO);
        return t;
      }
      final Z[] left = get(n, k - 1);
      final Z[] child = get(n - 1, k + 1);
      final Z[] res = Arrays.copyOf(left, n + 1);
      final Z rk = r(k);
      final Z sk = s(k);
      for (int j = 0; j < child.length; ++j) {
        if (!child[j].isZero()) {
          res[j] = res[j].add(child[j].multiply(rk));
          res[j + 1] = res[j + 1].add(child[j].multiply(sk));
        }
      }
      return res;
    }
  };

  private Z r(final int k) {
    while (mRv.size() <= k) {
      mRv.add(mR.next());
    }
    return mRv.get(k);
  }

  private Z s(final int k) {
    while (mSv.size() <= k) {
      mSv.add(mS.next());
    }
    return mSv.get(k);
  }

  private int mN = -1;
  private int mM = 0;

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    return mP.get(mN, 0)[mM];
  }
}
