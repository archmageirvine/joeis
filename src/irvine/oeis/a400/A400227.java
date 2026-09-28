package irvine.oeis.a400;

import irvine.math.function.Functions;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import irvine.oeis.DirectSequence;
import irvine.oeis.Sequence1;
import irvine.oeis.a073.A073092;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A400227 allocated for Carlo Mitchener.
 * @author Sean A. Irvine
 */
public class A400227 extends Sequence1 {

  // todo does not produce expected data

  //private final DirectSequence mA = DirectSequence.create(new A073092());
  private final DirectSequence mA = DirectSequence.create(new SimpleTransformSequence(new A073092(), k -> k.subtract(1)));
  private long mN = 0;

  @Override
  public Z next() {
    return Integers.SINGLETON.sumdiv(++mN, d -> mA.a(2 * d * d).multiply(Functions.MOBIUS.l(mN / d)));
  }
}


// a(n) = Sum_{d | n} mu(d)*B(2*n^2/d^2), where B(x) = A073092(x) - 1 i
