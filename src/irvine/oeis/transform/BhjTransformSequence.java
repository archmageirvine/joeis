package irvine.oeis.transform;

import java.util.ArrayList;
import java.util.List;

import irvine.math.function.Functions;
import irvine.math.partition.IntegerPartition;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.memory.MemorySequence;

/**
 * BHJ transform.
 * @author Sean A. Irvine
 */
public class BhjTransformSequence extends Sequence1 {

  // See https://oeis.org/transforms2.html (but beware errors)

  private final MemorySequence mA;

  protected BhjTransformSequence(final Sequence seq) {
    // The mA sequence will be numbered from 0
    mA = MemorySequence.cachedSequence(seq);
  }

  private static Z t(final List<Z> a, final int n) {
    final IntegerPartition part = new IntegerPartition(n);
    Z sum = a.get(n - 1).multiply2();
    int[] p;
    final int[] q = new int[n + 1];
    while ((p = part.next()) != null) {
      IntegerPartition.toCountForm(p, q);
      int odd = 0;
      Z d = Z.ONE;
      Z t1 = Functions.FACTORIAL.z(p.length);
      Z t2 = Functions.FACTORIAL.z(p.length / 2);
      for (int i = 1; i < q.length; ++i) {
        if (q[i] != 0) {
          if ((q[i] & 1) == 1) {
            ++odd;
          }
          t1 = t1.multiply(a.get(i - 1).pow(q[i])).divide(Functions.FACTORIAL.z(q[i]));
          t2 = t2.multiply(a.get(i - 1).pow((q[i] + 1) / 2)).divide(Functions.FACTORIAL.z(q[i] / 2));
          d = d.multiply(Functions.FACTORIAL.z(i).pow(q[i]));
        }
      }
      final Z t3 = odd > 1 ? t1 : t1.subtract(t2);
      final Z t = t3.multiply(Functions.FACTORIAL.z(n)).divide(d);
      //System.out.println(n + " " + Arrays.toString(p) + " " + Arrays.toString(q) + " k=" + p.length + " t=" + t + " t3=" + t3+ " t1=" + t1 + " t2=" + t2 + " #odd=" + odd);
      sum = sum.add(t);
    }

    return sum.divide2();
  }

  /**
   * Compute the BHJ transform of the given list.
   * @param a list
   * @return BHJ transform
   */
  public static List<Z> bhj(final List<Z> a) {
    final ArrayList<Z> res = new ArrayList<>(a.size());
    for (int k = 1; k <= a.size(); ++k) {
      res.add(t(a, k));
    }
    //System.out.println(res);
    return res;
  }

  private int mN = -1;

  @Override
  public Z next() {
    mA.next(); // ensure sufficient terms in underlying sequence
    return bhj(mA.toList()).get(++mN);
  }
}
