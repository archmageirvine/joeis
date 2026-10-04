package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Map;
import java.util.TreeMap;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A399406 Order array of the array W given by w(n, k) = k*(n + e), for n &gt;= 1, k &gt;= 1, a rectangular array, read by descending antidiagonals; see Comments.
 * @author Sean A. Irvine
 */
public class A399406 extends Sequence1 {

  private final CR mX;
  private final TreeMap<CR, Integer> mSorted = new TreeMap<>();
  private final ArrayList<Integer> mK = new ArrayList<>(); // offset 1
  private final ArrayList<LinkedList<Long>> mIndices = new ArrayList<>(); // offset 0
  private long mPos = 0;
  private int mN = 0;
  private int mM = -1;

  protected A399406(final CR x) {
    mX = x;
    mK.add(null); // row 0 unused
    mSorted.put(mX.add(1), 1);
    mK.add(1); // n = 1, k = 1
  }

  /** Construct the sequence. */
  public A399406() {
    this(CR.E);
  }

  @Override
  public Z next() {
    if (++mM > mN) {
      ++mN;
      mM = 0;
    }
    while (mIndices.size() <= mM || mIndices.get(mM).isEmpty()) {
      while (mSorted.firstKey().compareTo(mX.add(mK.size())) > 0) {
        // We need to start a new row of the array W
        final int n = mK.size();
        mK.add(1); // k = 1 for this new row
        mSorted.put(mX.add(n), n);
      }
      final Map.Entry<CR, Integer> e = mSorted.pollFirstEntry();
      final int n = e.getValue();
      final int k = mK.get(n);
      mK.set(n, k + 1);
      mSorted.put(mX.add(n).multiply(k + 1), n);
      while (mIndices.size() < n) {
        mIndices.add(new LinkedList<>());
      }
      mIndices.get(n - 1).add(++mPos);
    }
    return Z.valueOf(mIndices.get(mM).pollFirst());
  }
}
