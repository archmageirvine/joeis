package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;

/**
 * A397701 Numbers k such that sigma(k) = psi(k) + tau(k)^3 + omega(k)^3.
 * @author Sean A. Irvine
 */
public class A397701 extends UnionSequence {

  private static final class MySequence extends A000040 {
    private final Z mM;

    /** Construct the sequence. */
    private MySequence(final long m) {
      mM = Z.valueOf(m);
    }

    @Override
    public Z next() {
      while (true) {
        final Z p = super.next();
        if (!mM.mod(p).isZero()) {
          return mM.multiply(p.square());
        }
      }
    }
  }

  /** Construct the sequence. */
  public A397701() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 59928, 61608, 62376, 63048, 63560, 66440, 69560, 69608, 74888, 134838, 138618, 140346, 141858, 167805, 186813, 316953, 397250, 415250, 434750, 466125, 550375, 778610, 852698, 1078735, 1812822, 2009810, 2105642, 2256045, 2265362, 2511597, 4451178, 5998773, 6362335, 8249226, 9903938, 21578178, 23806910, 25630418, 28416333, 30138535, 38414510, 79456242, 199119786, 222206138, 238078005, 351181002, 378724610, 772007478, 818795810),
      new MySequence(223),
      new MySequence(9093)
    );
  }
}
