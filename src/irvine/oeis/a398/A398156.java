package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A398156 a(n) is the least positive integer m such that (1 + 1/m)^m and e agree in their first n digits after the decimal point, without rounding.
 * @author Sean A. Irvine
 */
public class A398156 extends Sequence1 {

  // After Felix Huber

  private long mN = 0;

  private CR f(final Z m) {
    CR t = CR.ONE;
    long k = 2;
    CR r = CR.valueOf(new Q(1, m.multiply2()));
    while (r.abs().compareTo(CR.TEN.pow(-2 * mN - 20)) > 0) {
      t = t.signedAdd((k & 1) == 1, CR.ONE.divide(m.pow(k - 1).multiply(k)));
      ++k;
      r = CR.ONE.divide(m.pow(k - 1).multiply(k));
    }
    return t;
  }

  @Override
  public Z next() {
    ++mN;
    final Z t = Z.TEN.pow(mN);
    final Z q = CR.E.multiply(t).floor();
    final CR s = CR.valueOf(q).log().subtract(CR.LOG10.multiply(mN));
    final CR u = CR.E.subtract(CR.valueOf(q).divide(t));
    Z m = Z.ONE.max(CR.E.divide(u.multiply(2)).floor());
    Z l = Z.ONE.max(m.divide2());
    Z h = m.multiply2();
    while (f(l).compareTo(s) >= 0 && l.compareTo(Z.ONE) > 0) {
      h = l;
      l = Z.ONE.max(l.divide2());
    }
    while (f(h).compareTo(s) < 0) {
      l = h;
      h = h.multiply2();
    }
    while (l.add(1).compareTo(h) < 0) {
      m = l.add(h).divide2();
      if (f(m).compareTo(s) >= 0) {
        h = m;
      } else {
        l = m;
      }
    }
    return h;
  }
}

