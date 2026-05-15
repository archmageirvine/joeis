package irvine.oeis.a395;

import irvine.factor.factor.Jaguar;
import irvine.math.function.Functions;
import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a002.A002110;

/**
 * A395922 allocated for Jean-Marc Rebert.
 * @author Sean A. Irvine
 */
public class A395922 extends Sequence1 {

  private final Sequence mS = new A002110().skip();

  @Override
  public Z next() {
    final Z[] d = Jaguar.factor(mS.next()).divisorsSorted();
    int k = d.length;
    while (true) {
      if (Predicates.TRIANGULAR.is(d[--k])) {
        return Functions.TRINV.z(d[k]);
      }
    }
  }
}
