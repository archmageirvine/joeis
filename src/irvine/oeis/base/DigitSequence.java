package irvine.oeis.base;

import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * A sequence consisting of the digits of the numbers in another sequence.
 * @author Sean A. Irvine
 */
public class DigitSequence implements Sequence {

  private final Sequence mSeq;
  private String mA;
  private int mM = -1;

  protected DigitSequence(final Sequence seq) {
    mSeq = seq;
    mA = mSeq.next().toString();
  }

  @Override
  public Z next() {
    if (++mM == mA.length()) {
      mA = mSeq.next().toString();
      mM = 0;
    }
    return Z.valueOf(mA.charAt(mM) - '0');
  }
}

