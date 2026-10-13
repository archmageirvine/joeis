package irvine.oeis.a397;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;

/**
 * A397842 Numbers k such that sigma(k) = psi(k) + omega(k)^7.
 * @author Sean A. Irvine
 */
public class A397842 extends UnionSequence {

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
  public A397842() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 1, 837, 23436, 89373),
      new MySequence(1),
      new MySequence(127),
      new MySequence(11811),
      new MySequence(112890),
      new MySequence(120054),
      new MySequence(124338),
      new MySequence(127330),
      new MySequence(132770),
      new MySequence(134090),
      new MySequence(138754),
      new MySequence(148665)
    );
  }
}

