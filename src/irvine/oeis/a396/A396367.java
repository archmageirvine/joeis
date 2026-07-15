package irvine.oeis.a396;

import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.a286.A286708;

/**
 * A396367 Smallest number k that is neither squarefree nor powerful (in A332785) that exceeds A286708(n) and has the same squarefree kernel as A286708(n).
 * @author Sean A. Irvine
 */
public class A396367 extends A286708 {

  @Override
  public Z next() {
    Z k = super.next();
    final Z kernel = Functions.RAD.z(k);
    while (true) {
      k = k.add(kernel);
      if (!Predicates.SQUARE_FREE.is(k) && !Predicates.SQUAREFUL.is(k) && Functions.RAD.z(k).equals(kernel)) {
        return k;
      }
    }
  }
}
