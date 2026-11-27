package irvine.oeis.a402;

import irvine.math.predicate.Predicates;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;

/**
 * A402409 First occurrence of difference n between two consecutive terms of A001481. a(n) gives the upper term. The lower term is A402408.
 * @author Sean A. Irvine
 */
public class A402409 extends AbstractSequence {

  private long mN = 3;

  /** Construct the sequence. */
  public A402409() {
    super(4);
  }

  private boolean is(final Z square, final long base) {
    Z t = Z.ZERO;
    Z m = Z.ONE;
    Z s = square;
    final Z forbidden = Z.valueOf(base - 1);
    while (!s.isZero()) {
      final Z[] qr = s.divideAndRemainder(base);
      if (qr[1].equals(forbidden)) {
        return false;
      }
      s = qr[0];
      t = t.add(m.multiply(qr[1].add(1)));
      m = m.multiply(base);
    }
    return Predicates.SQUARE.is(t);
  }

  @Override
  public Z next() {
    ++mN;
    long k = 1;
    while (true) {
      final Z s = Z.valueOf(++k).square();
      if (is(s, mN)) {
        return s;
      }
    }
  }
}
