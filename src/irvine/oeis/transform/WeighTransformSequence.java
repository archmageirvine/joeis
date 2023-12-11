package irvine.oeis.transform;

import irvine.math.z.Binomial;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.memory.MemoryFunction2Sequence;
import irvine.oeis.memory.MemorySequence;

/**
 * Compute the WEIGH transform of another sequence.  Corresponds to <code>weighout</code>
 * in the Maple transforms.
 * @author Sean A. Irvine
 */
public class WeighTransformSequence extends MemoryFunction2Sequence<Integer, Z> {

  private static final int DEFOFF = 0;
  private final MemorySequence mH;
  private int mN = -1;

  /**
   * Construct the weigh transform of the given sequence.
   * @param offset first index of target sequence
   * @param seq sequence
   */
  public WeighTransformSequence(final int offset, final Sequence seq) {
    super(offset);
    mH = MemorySequence.cachedSequence(seq);
  }

  /**
   * Construct the weigh transform of the given sequence.
   * @param seq sequence
   */
  public WeighTransformSequence(final Sequence seq) {
    this(DEFOFF, seq);
  }

  private Z h(final int m) {
    // Treat values beyond end of a finite sequence as 0
    // (necessary for some sequences such A038084)
    final Z t = mH.a(m);
    return t == null ? Z.ZERO : t;
  }

  @Override
  protected Z compute(final Integer n, final Integer m) {
    if (n == 0) {
      return Z.ONE;
    }
    if (m < 1) {
      return Z.ZERO;
    }
    Z sum = Z.ZERO;
    for (int j = 0; j <= n / m; ++j) {
      sum = sum.add(Binomial.binomial(h(m), Z.valueOf(j)).multiply(get(n - m * j, m - 1)));
    }
    return sum;
  }

  @Override
  public Z next() {
    return get(++mN, mN);
  }
}
