package irvine.oeis.a401;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.oeis.a390.A390628;

/**
 * A401362 Numbers k whose symmetric representation of sigma(k), SRS(k), contains at least one part that is not unimodal.
 * @author Sean A. Irvine
 */
public class A401362 extends A390628 {

  private int mN = 0;

  private boolean isUnimodal(final ArrayList<Long> lst, final int start, final int end) {
    if (end - start <= 2) {
      return true;
    }
    long prev = -1;
    int k = start;
    while (k < end) {
      final long p = lst.get(k);
      if (p != 0) {
        if (p < prev) {
          break;
        }
        prev = lst.get(k);
      }
      ++k;
    }
    if (k == end) {
      return true;
    }
    prev = lst.get(k);
    while (++k < end) {
      final long p = lst.get(k);
      if (p > prev) {
        return false;
      }
      if (p != 0) {
        prev = p;
      }
    }
    return true;
  }

  private boolean isUnimodal(final Z n) {
    final ArrayList<Long> lst = widthPattern(n.intValueExact());
    //System.out.println(n + " -> " + lst);
    int s = 0;
    while (s < lst.size()) {
      int e = s;
      while (++e < lst.size() && lst.get(e) != 0) {
        // do nothing
      }
      if (!isUnimodal(lst, s, e)) {
        return false;
      }
      s = e + 1;
    }
    return true;
  }

  @Override
  public Z next() {
    while (true) {
      if (!isUnimodal(Z.valueOf(++mN))) {
        return Z.valueOf(mN);
      }
    }
  }
}
