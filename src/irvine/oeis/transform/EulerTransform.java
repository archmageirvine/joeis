package irvine.oeis.transform;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

import irvine.math.z.Z;
import irvine.math.z.ZUtils;
import irvine.oeis.FiniteSequence;
import irvine.oeis.PeriodicSequence;
import irvine.oeis.ReaderSequence;
import irvine.oeis.Sequence;

/**
 * Apply the Euler transform to some other sequence.
 * The program follows closely the code of the OEIS implementations
 * for Maple (N.J.A. Sloane) and Mathematica (Olivier Gerard),
 * see <a href="https://oeis.org/wiki/Sequence_transforms">Sequence Transforms</a>
 * @author Georg Fischer
 */
public class EulerTransform implements Sequence {

  protected Sequence mSeq;
  protected final ArrayList<Z> mAs = new ArrayList<>(); // underlying sequence
  protected final ArrayList<Z> mBs = new ArrayList<>(); // resulting sequence
  protected final ArrayList<Z> mCs = new ArrayList<>(); // auxiliary sequence
  protected Z[] mPreTerms; // initial terms to be prepended
  protected int mIn; // index for initial terms
  protected int mN; // current index >= 1, may be used in advance() of a subclass

  /**
   * Empty constructor;
   * initializes the internal properties
   */
  public EulerTransform() {
    mIn = 0;
    mN = 0;
    mAs.add(Z.ZERO); // [0] not used
    mBs.add(Z.ZERO); // [0] is not returned
    mCs.add(Z.ZERO); // [0] starts the sum
    mPreTerms = new Z[] { }; // no prefix terms
  }

  /**
   * Create a new sequence with no additional terms at the front.
   * @param seq main sequence
   */
  public EulerTransform(final Sequence seq) {
    this();
    mSeq = seq;
  }

  /**
   * Create a new sequence with additional terms at the front.
   * @param preTerms additional terms to be prepended;
   */
  public EulerTransform(final long... preTerms) {
    this();
    mPreTerms = ZUtils.toZ(preTerms);
  }

  /**
   * Create the Euler transform of the given sequence,
   * with additional Z terms prepended.
   * @param seq underlying sequence
   * @param preTerms additional terms to be prepended;
   * usually there is a leading one.
   */
  public EulerTransform(final Sequence seq, final Z... preTerms) {
    this(seq);
    mPreTerms = preTerms;
  }

  /**
   * Create a new sequence 
   * with additional long terms prepended.
   * @param seq main sequence
   * @param preTerms additional terms to be prepended;
   * usually there is a leading one.
   */
  public EulerTransform(final Sequence seq, final long... preTerms) {
    this(seq);
    mPreTerms = ZUtils.toZ(preTerms);
  }
  
  /**
   * Create a new sequence. 
   * This constructor is used in most of the generated sequences.
   * @param seqType: 0 = generic, 1 = finite, 2 = periodic, 3 = linear recurrence (0 = arbitrary)
   * @param terms finite list of terms
   * @param preTerms additional terms to be prepended;
   * usually there is a leading one.
   */
  public EulerTransform(final int seqType, final String terms, final String preTerms) {
    this();
    mPreTerms = preTerms.isEmpty() ? new Z[0] : ZUtils.toZ(preTerms);
    switch (seqType) {
      case 0: // generic
      /*
        final String aseqno = terms;
        try {
          mSeq = (Sequence) Class.forName("irvine.oeis." 
              + aseqno.substring(0, 4).toLowerCase() + "." + aseqno).getDeclaredConstructor().newInstance();
        } catch (Exception exc) {
          throw exc;
        }
      */
        break;  
      case 1: // finite
        mSeq = new FiniteSequence(ZUtils.toZ(terms));
        break;  
      case 2: // periodic
        mSeq = new PeriodicSequence(ZUtils.toZ(terms));
        break;
      default:
        throw new RuntimeException("Unexpected sequence type");
    }
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
    final Z aNext = advance(); // underlying sequence will see mN = 1, 2, 3, ... 
    mAs.add(aNext == null ? Z.ZERO : aNext); // get next a(n)
    mCs.add(Z.ZERO); // allocate c[n]
    for (int i = mN; i <= mN; ++i) {
      Z cSum = Z.ZERO; // start sum
      for (int d = 1; d <= i; ++d) { // compute c[n] = sum ...
        if (i % d == 0) { // "did(i,d)"
          cSum = cSum.add(Z.valueOf(d).multiply(mAs.get(d)));
        }
      } // for d
      mCs.set(i, cSum); // = c[n]
    } // for i
    final int i = mN;
    Z bSum = mCs.get(i); 
    for (int d = 1; d < i; ++d) {
      bSum = bSum.add(mCs.get(d).multiply(mBs.get(i - d)));
    } // for d
    bSum = bSum.divide(Z.valueOf(i));
    mBs.add(bSum);
    return bSum;
  } 

  /**
   * Wrapper around <code>mSeq.next()</code>, may be overwritten 
   * when <code>seqType == 1</code>.
   * When this method is overwritten, super.mN runs through 1, 2, 3, and so on.
   * @return next term of the underlying sequence to be Euler transformed
   */
  protected Z advance() {
    return mSeq.next();
  }

  /**
   * Apply the Euler transform to the sequence supplied on standard input.
   * @param args number of terms to skip
   * @throws IOException if an I/O error occurs.
   */
  public static void main(final String[] args) throws IOException {
    final int skip = args.length > 0 ? Integer.parseInt(args[0]) : 0;
    try (final BufferedReader r = new BufferedReader(new InputStreamReader(System.in))) {
      final EulerTransform seq = new EulerTransform(new ReaderSequence(r), skip);
      Z a;
      while ((a = seq.next()) != null) {
        System.out.println(a);
      }
    }
  }
}
