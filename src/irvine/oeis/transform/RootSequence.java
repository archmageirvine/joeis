package irvine.oeis.transform;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.ConstantFactorSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * Take the square root (or some other fractional exponent) of another sequence by using Euler and inverse Euler transform.
 * @author Georg Fischer
 */
public class RootSequence extends AbstractSequence {

  private final EulerTransform mET;

  /**
   * Construct the sequence.
   * @param offset first index
   * @param seq the underlying sequence
   * @param exponent take the sequence to this power
   */
  public RootSequence(final int offset, final Sequence seq, final Q exponent) {
    super(offset);
    mET = new EulerTransform(offset, new ConstantFactorSequence(new InverseEulerTransform(seq), exponent), 1);
  }

  /**
   * Constructor with long parameters.
   * @param seq the underlying sequence
   * @param num numerator of the exponent
   * @param den denominator of the exponent
   */
  public RootSequence(final int offset, final Sequence seq, final long num, final long den) {
    this(offset, seq, new Q(num, den));
  }

  @Override
  public Z next() {
    return mET.next();
  }

  /**
   * Main method: compute some convolution power of a sequence
   * @param args command line arguments:
   * <ul>
   * <li>-a A-number</li>
   * <li>-f multiply all terms by this factor (default 1")</li>
   * <li>-n number of terms (default 32")</li>
   * <li>-o offset, first index (default 0) </li>
   * <li>-q power, maybe a fraction (default "1/2")</li>
   * <li>-s skip this number of terms in the underlying sequence (default 1)</li>
   * </ul>
   */
  public static void main(final String[] args) {
    int debug = 0;
    String aSeqNo = null;
    Q pq = new Q(1, 2);
    Sequence mSeq = null;
    int offset = 0;
    long factor = 1;
    int noTerms = 32;
    int skip = 1;
    int iarg = 0;
    while (iarg < args.length) { // consume all arguments
      final String opt = args[iarg++];
      try {
        if (opt.equals("-d")) {
          debug = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-a")) {
          aSeqNo = args[iarg++]; // remove whitespace
          mSeq = (Sequence) Class.forName("irvine.oeis.a" + aSeqNo.substring(1, 4) + '.' + aSeqNo)
            .getDeclaredConstructor().newInstance();
        } else if (opt.equals("-f")) {
          factor = Long.parseLong(args[iarg++]);
        } else if (opt.equals("-n")) {
          noTerms = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-o")) {
          offset = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-q")) {
          String pqf = args[iarg++].replaceAll("\\s", ""); // remove whitespace
          if (pqf.indexOf('/') < 0) {
            pqf += "/1";
          }
          final String[] pqrs = pqf.split("/");
          pq = new Q(Long.parseLong(pqrs[0]), Long.parseLong(pqrs[1]));
        } else if (opt.equals("-s")) {
          skip = Integer.parseInt(args[iarg++]);
        } else {
          System.err.println("??? invalid option: \"" + opt + "\"");
        }
      } catch (final Exception exc) { // take default
        System.err.println("wrong option: " + args[iarg - 1] + ", mesage: " + exc.getMessage());
      }
    } // while args

    if (debug > 0) {
      System.out.println("RootSequence: offset=" + offset + ", aSeqNo=" + ((mSeq == null) ? "null" : aSeqNo) + ", pq=" + pq);
    }
    final RootSequence rs = new RootSequence(offset, new SkipSequence(mSeq, skip), pq);
    for (int iterm = 0; iterm < noTerms; ++iterm) {
      if (iterm > 0) {
        System.out.print(",");
      }
      System.out.print(rs.next().multiply(factor));
    } // for iterm
    System.out.println();
  } // main
}

