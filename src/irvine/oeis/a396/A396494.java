package irvine.oeis.a396;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

import irvine.math.partition.DistinctPartsPartition;
import irvine.math.partition.IntegerComposition;
import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A396494 allocated for John Tyler Rascoe.
 * @author Sean A. Irvine
 */
public class A396494 extends Sequence0 {

  // After Tyler Rascoe

  private int mN = -1;

  private static final class StrictPartition implements Comparable<StrictPartition> {
    private final int[] mParts;
    private final HashSet<Integer> mGaps = new HashSet<>();

    private StrictPartition(final int[] parts) {
      mParts = parts.clone();
      for (int k = 0; k + 1 < parts.length; ++k) {
        mGaps.add(parts[k + 1] - parts[k]);
      }
    }

    @Override
    public int compareTo(final StrictPartition o) {
      final int lim = Math.min(mParts.length, o.mParts.length);
      for (int k = 0; k < lim; ++k) {
        if (mParts[k] != o.mParts[k]) {
          return Integer.compare(mParts[k], o.mParts[k]);
        }
      }
      return Integer.compare(mParts.length, o.mParts.length);
    }

    @Override
    public boolean equals(final Object obj) {
      return obj instanceof StrictPartition && Arrays.equals(mParts, ((StrictPartition) obj).mParts);
    }

    @Override
    public int hashCode() {
      return Arrays.hashCode(mParts);
    }
  }

  private final ArrayList<ArrayList<StrictPartition>> mD = new ArrayList<>();
  private final HashSet<List<StrictPartition>> mSeen = new HashSet<>();
  private long mCount;

  private void buildStrictPartitions(final int n) {
    while (mD.size() < n) {
      final int m = mD.size() + 1;
      final ArrayList<StrictPartition> list = new ArrayList<>();
      final DistinctPartsPartition p = new DistinctPartsPartition(m);
      int[] q;
      while ((q = p.next()) != null) {
        list.add(new StrictPartition(q));
      }
      mD.add(list);
    }
  }

  private void searchProduct(final int[] composition, final int pos, final StrictPartition[] chosen, final HashSet<StrictPartition> usedPartitions, final HashSet<Integer> usedGaps) {
    if (pos == composition.length) {
      final ArrayList<StrictPartition> t = new ArrayList<>();
      Collections.addAll(t, chosen);
      Collections.sort(t);
      if (mSeen.add(t)) {
        ++mCount;
      }
      return;
    }

    for (final StrictPartition p : mD.get(composition[pos] - 1)) {
      if (!usedPartitions.add(p)) {
        continue;
      }
      boolean ok = true;
      for (final Integer g : p.mGaps) {
        if (usedGaps.contains(g)) {
          ok = false;
          break;
        }
      }

      if (ok) {
        chosen[pos] = p;
        usedGaps.addAll(p.mGaps);
        searchProduct(composition, pos + 1, chosen, usedPartitions, usedGaps);
        for (final Integer g : p.mGaps) {
          usedGaps.remove(g);
        }
      }

      usedPartitions.remove(p);
    }
  }

  @Override
  public Z next() {
    if (++mN == 0) {
      return Z.ONE;
    }
    buildStrictPartitions(mN);
    mSeen.clear();

    mCount = 0;
    for (int parts = 1; parts <= mN; ++parts) {
      final IntegerComposition compositions = new IntegerComposition(mN, parts);
      int[] c;
      while ((c = compositions.next()) != null) {
        searchProduct(c, 0, new StrictPartition[c.length], new HashSet<>(), new HashSet<>());
      }
    }
    return Z.valueOf(mCount);
  }
}
