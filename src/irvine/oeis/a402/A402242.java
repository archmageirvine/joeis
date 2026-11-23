package irvine.oeis.a402;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;

/**
 * A402242 allocated for Yinon Werner.
 * @author Sean A. Irvine
 */
public class A402242 extends Sequence0 {

  private int mN = -1;
  private Set<Z> mSets = new HashSet<>();

  @Override
  public Z next() {
    if (++mN == 0) {
      mSets.add(Z.ZERO);
    } else {
      // Pairs (x, y) such that x XOR y = m and 1 <= x < y < m
      final List<int[]> pairs = new ArrayList<>();
      for (int x = 1; x < mN; ++x) {
        final int y = x ^ mN;
        if (x < y && y < mN) {
          pairs.add(new int[] {x, y});
        }
      }
      // Inclusion requirements: If x is in T and x XOR m < m, then x XOR m must also be in T.
      final List<int[]> required = new ArrayList<>();
      for (int x = 1; x < mN; ++x) {
        final int y = x ^ mN;
        if (y < mN) {
          required.add(new int[] {x, y});
        }
      }

      final Set<Z> nextSets = new HashSet<>();
      for (final Z t : mSets) {
        // Branch 1: leave m out
        boolean exclude = true;
        for (final int[] pair : pairs) {
          if (t.testBit(pair[0]) && t.testBit(pair[1])) {
            exclude = false;
            break;
          }
        }
        if (exclude) {
          nextSets.add(t);
        }
        // Branch 2: include m
        boolean include = true;
        for (final int[] requirement : required) {
          if (t.testBit(requirement[0]) && !t.testBit(requirement[1])) {
            include = false;
            break;
          }
        }
        if (include) {
          nextSets.add(t.setBit(mN));
        }
      }
      mSets = nextSets;
    }
    return Z.valueOf(mSets.size());
  }
}
