package irvine.oeis.a398;

import irvine.math.z.Z;
import irvine.oeis.FiniteSequence;
import irvine.oeis.UnionSequence;
import irvine.oeis.a000.A000040;

/**
 * A398160 Numbers k such that sigma(k) = psi(k) + Omega(k)^6.
 * @author Sean A. Irvine
 */
public class A398160 extends UnionSequence {

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
  public A398160() {
    super(1,
      new FiniteSequence(1, FiniteSequence.FINITE, 1, 77640, 90312, 98440, 99640, 101864, 106216, 107272, 174690, 203202, 245565, 267597, 485250, 615250, 622750, 682125, 788375, 1247834, 1545215, 3213034, 3244978, 3597693, 3783457, 7359674, 7674106, 7885365, 8592837, 9113615, 13018690, 14186722, 55026190, 63421602, 63499873, 69972190, 75331762, 83519997, 88581815, 113815698, 133858714, 281759890, 291560234, 312385965, 8125200690L),
      new MySequence(3937),
      new MySequence(19410),
      new MySequence(22578),
      new MySequence(24610),
      new MySequence(24910),
      new MySequence(25466),
      new MySequence(26554),
      new MySequence(26818),
      new MySequence(27285),
      new MySequence(29733),
      new MySequence(31535)
    );
  }
}

