package irvine.oeis.a401;

import irvine.oeis.Combiner;
import irvine.oeis.a002.A002334;
import irvine.oeis.a002.A002335;

/**
 * A401357 allocated for Pierre Colmant.
 * @author Sean A. Irvine
 */
public class A401357 extends Combiner {

  /** Construct the sequence. */
  public A401357() {
    super(1, new A002334().skip(), new A002335().skip(), (x, y) -> x.subtract(y).square().add(y.square()));
  }
}

