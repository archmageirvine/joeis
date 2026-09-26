package irvine.oeis.a399;

import irvine.math.z.Z;

/**
 * A399901 allocated for Bartlomiej Pawlik.
 * @author Sean A. Irvine
 */
public class A399901 extends A399900 {

  private long mN = 0;

  private int find(final long n) {
    int row = -1;
    while (t(++row, 1) <= n) {
      int col = 0;
      long s = 0;
      while (s < n) {
        s += t(row, ++col);
      }
      if (s == n) {
        return row + 1;
      }
    }
    return 0;
  }

  @Override
  public Z next() {
    return Z.valueOf(find(++mN));
  }
}
