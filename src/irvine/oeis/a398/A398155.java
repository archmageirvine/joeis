package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398155 a(n) is the least integer m &gt;= 3 such that m*sin(Pi/m) and m*tan(Pi/m) agree in their first n digits after the decimal point, without rounding.
 * @author Sean A. Irvine
 */
public class A398155 extends Sequence1 {

  // After Felix Huber

  private long mN = 0;

  private boolean test(final Z t, final Z q, final Z m) {
    final CR z = CR.PI.divide(m);
    final Z s = t.multiply(m);
    return z.sin().multiply(s).floor().compareTo(q) >= 0
      && z.tan().multiply(s).floor().compareTo(q.add(1)) < 0;
  }

  @Override
  public Z next() {
    ++mN;
    final Z t = Z.TEN.pow(mN);
    final Z q = CR.PI.multiply(t).floor();
    Z l = Z.TWO;
    Z h = Z.THREE;
    while (!test(t, q, h)) {
      h = h.multiply2();
    }
    while (l.add(1).compareTo(h) < 0) {
      final Z m = l.add(h).divide2();
      if (test(t, q, m)) {
        h = m;
      } else {
        l = m;
      }
    }
    return h;
  }
}

