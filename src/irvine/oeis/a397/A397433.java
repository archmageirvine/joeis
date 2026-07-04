package irvine.oeis.a397;

import java.util.HashSet;
import java.util.Set;

import irvine.factor.factor.Jaguar;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A397433 allocated for Hassane Bakkaoui.
 * @author Sean A. Irvine
 */
public class A397433 extends Sequence1 {

  private long mN = 0;

  @Override
  public Z next() {
    final Set<Integer> s = new HashSet<>();
    for (final Z d : Jaguar.factor(++mN).divisors()) {
      s.add(d.bitLength());
    }
    return Z.valueOf(s.size());
  }
}
