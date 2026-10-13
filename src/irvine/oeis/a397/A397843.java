package irvine.oeis.a397;

import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;
import irvine.oeis.transform.SimpleTransformSequence;

/**
 * A397843 Numbers k such that sigma(k) = psi(k) + Omega(k)^4.
 * @author Sean A. Irvine
 */
public class A397843 extends UnionSequence {

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
        if (Functions.GCD.z(mM, p).isOne()) {
          return mM.multiply(p.square());
        }
      }
    }
  }

  /** Construct the sequence. */
  public A397843() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 1, 2040, 2744, 4590, 10633, 12750, 147390, 208537),
      new MySequence(510),
      new SimpleTransformSequence(1, new A000040(), p -> p.square().multiply(217))
    );
  }
}

