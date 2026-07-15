package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a332.A332785;

/**
 * A396542 Smallest powerful k (in A001694) that exceeds A332785(n) and has the same squarefree kernel as A332785(n).
 * @author Sean A. Irvine
 */
public class A396542 extends A332785 {

  @Override
  public Z next() {
    Z k = super.next();
    final Z kernel = Functions.RAD.z(k);
    while (true) {
      k = k.add(kernel);
      if (Predicates.SQUAREFUL.is(k) && Functions.RAD.z(k).equals(kernel)) {
        return k;
      }
    }
  }
}
