package irvine.oeis.a397;

import java.util.TreeMap;

import irvine.math.z.Z;
import irvine.oeis.a000.A000040;

/**
 * A397790 a(n) = prime^2 closest to prime(n)^3.
 * @author Sean A. Irvine
 */
public class A397790 extends A000040 {

  @Override
  public Z next() {
    final Z p3 = super.next().pow(3);
    final Z r = p3.sqrt();
    final TreeMap<Z, Z> m = new TreeMap<>();
    final Z q0 = mPrime.prevPrime(r.add(1)).square();
    m.put(p3.subtract(q0).abs(), q0);
    final Z q1 = mPrime.nextPrime(r).square();
    m.put(p3.subtract(q1).abs(), q1);
    return m.pollFirstEntry().getValue();
  }
}

