package irvine.oeis.a400;

import irvine.math.series.Series;
import irvine.math.z.Z;
import irvine.oeis.a225.A225543;
import irvine.oeis.gf.GfSequence;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A400337 allocated for Vaclav Kotesovec.
 * @author Sean A. Irvine
 */
public class A400337 extends GfSequence {

  /** Construct the sequence. */
  public A400337() {
    super(0, SQ.divide(SQ.one(), Series.create(new SimpleTransformSequence(new A225543(), Z::negate))));
  }

  @Override
  public Z next() {
    return super.next().abs();
  }
}
