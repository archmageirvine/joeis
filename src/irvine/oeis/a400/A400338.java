package irvine.oeis.a400;

import irvine.math.series.Series;
import irvine.math.z.Z;
import irvine.oeis.a225.A225543;
import irvine.oeis.gf.GfSequence;

/**
 * A400338 allocated for Vaclav Kotesovec.
 * @author Sean A. Irvine
 */
public class A400338 extends GfSequence {

  /** Construct the sequence. */
  public A400338() {
    super(0, SQ.divide(SQ.one(), Series.create(new A225543())));
  }

  @Override
  public Z next() {
    return super.next();
  }
}
