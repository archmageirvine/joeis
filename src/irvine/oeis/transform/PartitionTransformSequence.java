package irvine.oeis.transform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;

import irvine.math.group.IntegerField;
import irvine.math.group.PolynomialRingField;
import irvine.math.polynomial.Polynomial;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.ReaderSequence;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the partition transform of another sequence.
 * @author Sean A. Irvine
 */
public class PartitionTransformSequence extends AbstractSequence {

  private static final PolynomialRingField<Z> RING = new PolynomialRingField<>(IntegerField.SINGLETON);
  private Sequence mSeq = null;
  protected final ArrayList<Integer> mTerms = new ArrayList<>();
  private int mN = 0;

  /**
   * Compute the partition transform of the given values.
   * @param c values
   * @param n maximum degree
   * @return partition transform
   */
  public static Polynomial<Z> partitionTransform(final Collection<Integer> c, final int n) {
    Polynomial<Z> p = RING.one();
    int prev = -1;
    for (final int u : c) {
      if (u > prev) {
        p = RING.multiply(p, RING.oneMinusXToTheN(u), n);
        prev = u;
      }
    }
    return RING.series(RING.one(), p, n);
  }

  /**
   * Compute the partition transform of the given values.
   * @param c values
   * @param n maximum degree
   * @return partition transform
   */
  public static Polynomial<Z> partitionTransformZ(final Collection<Z> c, final int n) {
    Polynomial<Z> p = RING.one();
    Z prev = Z.NEG_ONE;
    for (final Z u : c) {
      if (u.compareTo(prev) > 0) {
        p = RING.multiply(p, RING.oneMinusXToTheN(u.intValueExact()), n);
        prev = u;
      }
    }
    return RING.series(RING.one(), p, n);
  }

  /**
   * Creates a new partition transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip
   */
  public PartitionTransformSequence(final Sequence seq, final int skip) {
    super(seq.getOffset());
    mSeq = seq;
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
  }

  /**
   * Creates a new partition transform.
   */
  protected PartitionTransformSequence() {
    super(0);
  }

  /**
   * Set the underlying sequence.
   * @param seq sequence
   */
  public void setUnderlyingSequence(final Sequence seq) {
    mSeq = seq;
  }

  @Override
  public Z next() {
    ++mN;
    final Z next = mSeq.next();
    if (next != null) {
      mTerms.add(next.intValueExact());
    }
    return partitionTransform(mTerms, mN).coeff(mN);
  }

  /**
   * Apply the partition transform to the sequence supplied on standard input.
   * @param args number of terms to skip
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final int skip = args.length > 0 ? Integer.parseInt(args[0]) : 0;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final PartitionTransformSequence seq = new PartitionTransformSequence(new ReaderSequence(r), skip);
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
