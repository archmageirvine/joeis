package irvine.oeis.a401;

import irvine.factor.factor.Jaguar;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A401841 allocated for Felix Huber.
 * @author Sean A. Irvine
 */
public class A401841 extends Sequence1 {

  // After Felix Huber

  private Z mA = Z.ZERO;

  @Override
  public Z next() {
    while (true) {
      mA = mA.add(60);
      final Z m2 = mA.multiply2();
      final Z m4 = mA.square().multiply(4);
      final Z[] d = Jaguar.factor(mA).divisorsSorted();
      for (final Z y : d) {
        final Z y2 = y.square();
        for (final Z x : d) {
          if (x.compareTo(y) > 0) {
            break;
          }
          if (m2.compareTo(x.multiply(y)) <= 0) {
            final Z x2 = x.square();
            final Z r2 = x2.multiply(y2).subtract(m4);
            final Z[] sqrt = r2.sqrtAndRemainder();
            if (sqrt[1].isZero()) {
              final Z r = sqrt[0].multiply2();
              final Z q0 = x2.add(y2).subtract(r);
              if (Predicates.SQUARE.is(q0) && mA.mod(q0.sqrt()).isZero()) {
                return mA;
              }
              final Z q1 = x2.add(y2).add(r);
              if (Predicates.SQUARE.is(q1) && mA.mod(q1.sqrt()).isZero()) {
                return mA;
              }
            }
          }
        }
      }
    }
  }
}
/*
A401841 := proc(n) option remember;
    local d, m, q, r, x, y;
    m := 0;
    if 1 < n then
        m := A401841(n - 1);
    end if;
    do
        m := m + 60;
        d := NumberTheory:-Divisors(m);
        for x in d do
            for y in d do
                if x <= y and 2*m <= x*y then
                    r := x^2*y^2 - 4*m^2;
                    if issqr(r) then
                        r := isqrt(r);
                        for q in [x^2 + y^2 - 2*r, x^2 + y^2 + 2*r] do
                            if issqr(q) and irem(m, isqrt(q)) = 0 then
                                return m;

                            end if;

                        end do;

                    end if;

                end if;

            end do;

        end do;

    end do;

end proc:

seq(A401841(n), n = 1 .. 40);

 */
