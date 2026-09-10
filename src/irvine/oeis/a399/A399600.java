package irvine.oeis.a399;

import java.util.Map;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.oeis.a000.A000961;
import irvine.util.Pair;

/**
 * A399600 allocated for Michael De Vlieger.
 * @author Sean A. Irvine
 */
public class A399600 extends Sequence1 {

  private final A000961 mA = new A000961();

  @Override
  public Z next() {
    final Map.Entry<Z, Pair<Long, Long>> pp = mA.nextEntry();
    if (pp.getKey().isOne()) {
      return Z.ONE;
    }
    final long m = pp.getValue().right();
    return Functions.BINOMIAL.z(Functions.PRIME_PI.z(pp.getValue().left()).add(m), m);
  }
}
