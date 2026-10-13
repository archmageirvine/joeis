package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;

/**
 * A398159 Numbers k such that sigma(k) = psi(k) + Omega(k)^5.
 * @author Sean A. Irvine
 */
public class A398159 extends UnionSequence {

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
  public A398159() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 1, 12840, 13992, 14840, 15640, 28890, 31482, 43561, 80250, 92750, 97750, 181790, 423258, 1129990, 2068390, 9825882, 10421390, 14338681, 36751290),
      new MySequence(889),
      new MySequence(3210),
      new MySequence(3498),
      new MySequence(3710),
      new MySequence(3910)
    );
  }
}

