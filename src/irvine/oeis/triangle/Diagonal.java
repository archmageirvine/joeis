package irvine.oeis.triangle;

import java.util.function.Function;

import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.LambdaSequence;
import irvine.oeis.MemorySequence;

/**
 * Generate the rows of a triangle T(n,k) with an underlying sequence 
 * in the diagonal and the rest zeros.
 * @author Georg Fischer
 */
public class Diagonal extends BaseTriangle {

  private MemorySequence mSeq; // underlying sequence

  /**
   * Construct the sequence.
   * @param offset first index of the sequence
   * @param seq underlying sequence
   */
  public Diagonal(final int offset, final AbstractSequence seq) {
    this(offset, seq, new long[0]);
  }

  /**
   * Construct the sequence.
   * @param offset first index of the sequence
   * @param seq underlying sequence
   * @param initialTerms initial terms (starting at offset)
   */
  public Diagonal(final int offset, final AbstractSequence seq, final long... initialTerms) {
    super(offset, offset, offset);
    hasRAM(true);
    mSeq = MemorySequence.cache(offset, seq, initialTerms);
  }

  /**
   * Construct the sequence.
   * The offset is taken from the underlying sequence.
   * @param seq underlying sequence
   */
  public Diagonal(final AbstractSequence seq) {
    this(seq.getOffset(), seq);
  }

  /**
   * Convenience constructor with lambda expression
   * @param offset first index of the sequence
   * @param lambda lambda expression for the underlying sequence
   */
  public Diagonal(final int offset, final Function<Integer, Z> lambda) {
    this(offset, new MemorySequence(offset) {
          private int mN = offset - 1;
          @Override
          protected Z computeNext() {
            return lambda.apply(++mN);
          }
        });
  }

  /**
   * Compute an element of the Diagonal with shifted indexes.
   * @param n shifted row index
   * @param k shifted column index
   * @return T(n, k)
   */
  public Z triangleElement(final int n, final int k) {
    return (k == n) ? mSeq.a(n) : Z.ZERO;
  }
}
