package irvine.oeis.transform;

import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;

/**
 * A sequence comprising the inverse Weigh transform of another sequence.
 * From <code>weighouti</code> in the OEIS <a href="https://oeis.org/transforms.txt">Maple transforms</a> collection.
 * @author Georg Fischer
 */
public class InverseWeighTransform extends AbstractSequence {

  private static final int DEFOFF = 1;
  private Sequence mSeq;
  private final ArrayList<Z> mAs = new ArrayList<>(); // resulting sequence
  private final ArrayList<Z> mBs = new ArrayList<>(); // sequence to be transformed
  private final ArrayList<Z> mCs = new ArrayList<>(); // auxiliary sequence
  protected Z[] mPreTerms; // initial terms to be prepended
  protected int mIn; // index for initial terms
  protected int mN; // current index >= 1, may be used in advance() of a subclass

  /**
   * Empty constructor;
   * initializes the internal properties
   */
  public InverseWeighTransform() {
    super(DEFOFF);
    mIn = 0;
    mN = 0;
    mAs.add(Z.ZERO); // [0] is not returned
    mBs.add(Z.ZERO); // [0] not used
    mCs.add(Z.ZERO); // [0] starts the sum
    mPreTerms = new Z[] { }; // no preprended terms
  }

  /**
   * Create a new sequence with no additional terms at the front.
   * @param seq main sequence
   */
  public InverseWeighTransform(final Sequence seq) {
    this();
    mSeq = seq;
  }

  /**
   * Creates a new inverse Euler transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip in sequence
   * @param preTerms additional terms to be prepended to the result - usually there is a leading one.
   */
  public InverseWeighTransform(final Sequence seq, final int skip, final Z... preTerms) {
    this(seq);
    for (int k = 0; k < skip; ++k) {
      seq.next();
    }
    mPreTerms = preTerms;
  }

  /**
   * Creates a new inverse Euler transform sequence of the given sequence, skipping
   * the specified number of terms in advance.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip in sequence
   * @param preTerms additional terms to be prepended to the result - usually there is a leading one.
   */
  public InverseWeighTransform(final Sequence seq, final int skip, final long... preTerms) {
    this(seq, skip, ZUtils.toZ(preTerms));
  }

  /**
   * Creates a new inverse Euler transform sequence of the given sequence, skipping
   * the specified number of terms in advance. A one is prepended.
   *
   * @param seq underlying sequence
   * @param skip number of terms to skip in sequence
   */
  public InverseWeighTransform(final Sequence seq, final int skip) {
    this(seq, skip, Z.ONE);
  }

  /**
   * Return a term.
   * @return the next term of the transformed sequence.
   */
  @Override
  public Z next() {
    if (mIn < mPreTerms.length) { // during prepend phase
      return mPreTerms[mIn++];
    }
    // normal, transform terms
    ++mN; // starts with 1
    final Z bNext = mSeq.next();
    mBs.add(bNext == null ? Z.ZERO : bNext); // get next b(n)
    mCs.add(Z.ZERO); // allocate c[n]
    final int i = mN;

    Z cSum = Z.valueOf(i).multiply(mBs.get(i));
    for (int d = 1; d < i; ++d) {
      cSum = cSum.subtract(mCs.get(d).multiply(mBs.get(i - d)));
    } // for d
    mCs.set(i, cSum);
    Z aSum = mCs.get(i);
    if (i > 1) {
      // for i from 2 to nops(b) do a:=[op(a), c[i]/i - (1/i)*add(-dids(i,d)*a[d]*d , d=1..i-1)]: od:}
      // dids:=proc(m,n) if irem(m,n) = 0 then (-1)^(m/n)  else 0: fi: end:
      aSum = mCs.get(i);
      for (int d = 1; d < i; ++d) {
        if (i % d == 0) { // dids != 0
          if (((i / d) & 1) == 0) { // m/n even => dids = 1
            aSum = aSum.add(mAs.get(d).multiply(Z.valueOf(d)));
          } else { // m/n odd => dids = -1
            aSum = aSum.subtract(mAs.get(d).multiply(Z.valueOf(d)));
          }
        }
      } // for d
      aSum = aSum.divide(Z.valueOf(i));
    }
    mAs.add(aSum);
    return aSum;
  }

}
