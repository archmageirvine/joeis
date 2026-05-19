package irvine.oeis.a395;

import java.util.TreeSet;

import irvine.factor.prime.Fast;
import irvine.math.z.Z;
import irvine.oeis.Sequence1;
import irvine.util.Triple;

/**
 * A395899 Sphenic numbers k = p*q*r, primes p &lt; q &lt; r, such that r &lt; p^3.
 * @author Sean A. Irvine
 */
public class A395899 extends Sequence1 {

  private final Fast mPrime = new Fast();
  private final TreeSet<Triple<Long>> mA = new TreeSet<>((a, b) -> {
    final Z u = Z.valueOf(a.left()).multiply(a.mid()).multiply(a.right());
    final Z v = Z.valueOf(b.left()).multiply(b.mid()).multiply(b.right());
    return u.compareTo(v);
  });
  {
    mA.add(new Triple<>(2L, 3L, 5L));
  }

  @Override
  public Z next() {
    final Triple<Long> t = mA.pollFirst();
    final long p = t.left();
    final long pp = mPrime.nextPrime(p);
    if (pp < t.mid()) {
      mA.add(new Triple<>(pp, t.mid(), t.right()));
    }
    final long qq = mPrime.nextPrime(t.mid());
    if (qq < t.right()) {
      mA.add(new Triple<>(p, qq, t.right()));
    }
    final long rr = mPrime.nextPrime(t.right());
    if (p * p * p > rr) {
      mA.add(new Triple<>(p, t.mid(), rr));
    }
    return Z.valueOf(p).multiply(t.mid()).multiply(t.right());
  }
}
