package irvine.oeis.a395;

import java.util.ArrayList;
import java.util.Arrays;

import irvine.math.z.Z;
import irvine.oeis.a095.A095076;

/**
 * A395964 allocated for Benoit Cloitre.
 * @author Sean A. Irvine
 */
public class A395964 extends A095076 {

  private Z mF = Z.ZERO;

  private Z thueMorseTransform(final Z n) {
    final int bigN = n.bitLength() + 1;
    final ArrayList<Integer> v = new ArrayList<>();
    final ArrayList<Integer> u = new ArrayList<>();
    for (int k = 0; k < bigN; ++k) {
      if (n.testBit(bigN - 1 - k)) {
        u.add(k);
      } else {
        v.add(k);
      }
    }
    final int[] wp = new int[bigN];
    Arrays.fill(wp, -1);
    wp[0] = 0;
    for (int k = 0; k < wp.length; ++k) {
      if (wp[k] == -1) {
        break;
      }
      if (k < v.size() && v.get(k) < bigN) {
        wp[v.get(k)] = wp[k];
      }
      if (k < u.size() && u.get(k) < bigN) {
        wp[u.get(k)] = 1 - wp[k];
      }
    }
    Z res = Z.ZERO;
    for (final int w : wp) {
      res = res.multiply2().add(w);
    }
    return res;
  }

  @Override
  public Z next() {
    mF = mF.multiply2().add(super.next());
    return thueMorseTransform(mF).modZ(2);
  }
}
