package irvine.oeis.a398;

import irvine.math.cr.CR;
import irvine.math.cr.ComputableReals;
import irvine.math.cr.UnaryCrFunction;
import irvine.oeis.cons.DecimalExpansionSequence;

/**
 * A398684 Decimal expansion of two-dimensional minimum-variance onion constant.
 * @author Sean A. Irvine
 */
public class A398684 extends DecimalExpansionSequence {

  private static final UnaryCrFunction L = new UnaryCrFunction() {
    @Override
    public CR execute(final CR x) {
      return ComputableReals.SINGLETON.acot(x).subtract(x.square().inverse().add(1).log().multiply(x.divide(2)));
    }
  };

  private static final UnaryCrFunction F = new UnaryCrFunction() {
    @Override
    public CR execute(final CR x) {
      final CR log = x.square().inverse().add(1).log();
      final CR lx = L.execute(x);
      final CR acos = ComputableReals.SINGLETON.acos(x);

      final CR c1 = log.multiply(CR.PI.square()).multiply(3);

      final CR c2 = x.add(CR.TAU)
        .add(x.multiply(2).log().multiply(x.pow(3)).multiply(2))
        .subtract(acos.multiply(CR.ONE.subtract(x.square()).pow(3).sqrt()).multiply(2));
      final CR c3 = log.multiply(4).multiply(lx).multiply(c2);

      final CR c4 = CR.ONE
        .add(x.multiply(2).log().multiply(x.square()).multiply(2))
        .add(acos.multiply(CR.ONE.subtract(x.square()).sqrt()).multiply(x).multiply(2));
      final CR c5 = lx.square().multiply(24).multiply(c4);

      final CR c6 = lx.pow(3).multiply(48);
      return c3.subtract(c1).add(c5).divide(c6);
    }
  };

  /** Construct the sequence. */
  public A398684() {
    super(0, F.inverseMonotone(CR.HALF, CR.ONE).execute(CR.ZERO));
  }
}
