package irvine.oeis.a399;

import irvine.math.cr.CR;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A086811.
 * @author Sean A. Irvine
 */
public class A399325 extends DecimalExpansionSequence {

  /** Construct the sequence. */
  public A399325() {
    super(0, new UnaryCrFunction() {
      @Override
      public CR execute(final CR x) {
        return CR.SEVEN.pow(x.subtract(1)).subtract(CR.TWO.pow(x)).add(1);
      }
    }.inverseMonotone(CR.ZERO, CR.HALF).execute(CR.ZERO));
  }
}
