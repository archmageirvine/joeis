package irvine.math.group;

import irvine.math.set.FiniteSet;
import irvine.math.set.IntegerPermutation;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SchreierSimsTest extends TestCase {

  public void check(final int n, final Z expected) {
    final int[] r = new int[n];
    final int[] s = new int[n];
    for (int k = 0; k < r.length; ++k) {
      r[k] = n - k;
      s[k] = Math.min(2 * k + 1, 2 * n - 2 * k);
    }
    final FiniteSet<IntegerPermutation> sg = new FiniteSet<>(IntegerPermutation.createFromOneBase(r), IntegerPermutation.createFromOneBase(s));
    assertEquals(expected, new IntegerPermutationGroup(n, sg, false).size());
  }

  public void test6() {
    check(6, Z.valueOf(120));
  }

  public void test11() {
    check(11, Z.valueOf(39916800));
  }

}
