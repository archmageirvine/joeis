package irvine.oeis.cons;

import irvine.math.cr.CR;
import irvine.math.z.Z;
import irvine.oeis.Sequence;

/**
 * Convert a binary sequence into a real constant and expand as a decimal sequence.
 * @author Sean A. Irvine
 */
public class BinaryToDecimalExpansionSequence extends DecimalExpansionSequence {

  /**
   * Construct the decimal expansion of a binary sequence.
   * @param binarySequence underlying binary sequence
   */
  public BinaryToDecimalExpansionSequence(final Sequence binarySequence) {
    super(new CR() {
      private final Sequence mBinarySeq = binarySequence;
      private Z mA = Z.ZERO;
      private int mLength = 0;

      @Override
      protected Z approximate(final int precision) {
        if (precision >= 0) {
          return Z.ZERO;
        }
        while (mLength < -precision) {
          mA = mA.multiply2().add(mBinarySeq.next());
          ++mLength;
        }
        return mA.shiftRight(mLength + precision);
      }
    });
  }
}
