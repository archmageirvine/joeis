package irvine.oeis.a400;

import java.util.HashSet;

import irvine.math.z.Z;
import irvine.oeis.a047.A047201;

/**
 * A400182 allocated for Farhad Banazadeh.
 * @author Sean A. Irvine
 */
public class A400182 extends A047201 {

  @Override
  public Z next() {
    Z m = super.next();
    final HashSet<Z> seen = new HashSet<>();
    while (seen.add(m)) {
      switch ((int) m.mod(5)) {
        case 1:
          m = m.multiply(6).subtract(1);
          break;
        case 2:
          m = m.multiply(6).subtract(2);
          break;
        case 3:
          m = m.multiply(6).add(2);
          break;
        case 4:
          m = m.multiply(6).add(1);
          break;
        default:
          break;
      }
      while (m.mod(5) == 0) {
        m = m.divide(5);
      }
    }
    return Z.valueOf(seen.size());
  }
}
/*
T(k) = (6*k-1)/5^v_5(6*k-1) if k == 1 (mod 5),

T(k) = (6*k-2)/5^v_5(6*k-2) if k == 2 (mod 5),

T(k) = (6*k+2)/5^v_5(6*k+2) if k == 3 (mod 5),

T(k) = (6*k+1)/5^v_5(6*k+1) if k == 4 (mod 5).
 */
