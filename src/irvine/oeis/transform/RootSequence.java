package irvine.oeis.transform;

import java.lang.reflect.InvocationTargetException;

import irvine.math.q.Q;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceFactory;

/**
 * Take the square root (or some other fractional exponent) of another sequence by using Euler and inverse Euler transform.
 * @author Georg Fischer
 */
public class RootSequence extends EulerTransform {

  /**
   * Construct the sequence.
   * @param offset first index
   * @param seq the underlying sequence
   * @param exponent take the sequence to this power
   */
  public RootSequence(final int offset, final Sequence seq, final Q exponent) {
    super(offset, new SimpleTransformSequence(new InverseEulerTransform(seq), k -> k.multiply(exponent.num()).divide(exponent.den())), 1);
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

  /**
   * Main method: compute some convolution power of a sequence
   * @param args command line arguments:
   * <ul>
   * <li>-a A-number</li>
   * <li>-f multiply all terms by this factor (default 1)</li>
   * <li>-n number of terms (default 32)</li>
   * <li>-o offset, first index (default 0) </li>
   * <li>-q power, maybe a fraction (default "1/2")</li>
   * <li>-s skip this number of terms in the underlying sequence (default 1)</li>
   * </ul>
   */
  public static void main(final String[] args) {
    int debug = 0;
    String aSeqNo = null;
    Q pq = new Q(1, 2);
    AbstractSequence seq = null;
    int offset = 0;
    int noTerms = 32;
    int skip = 1;
    int iarg = 0;
    while (iarg < args.length) { // consume all arguments
      final String opt = args[iarg++];
      try {
        if ("-d".equals(opt)) {
          debug = Integer.parseInt(args[iarg++]);
        } else if ("-a".equals(opt)) {
          aSeqNo = args[iarg++];
          seq = (AbstractSequence) Class.forName("irvine.oeis.a" + aSeqNo.substring(1, 4) + '.' + aSeqNo).getDeclaredConstructor().newInstance();
        } else if ("-n".equals(opt)) {
          noTerms = Integer.parseInt(args[iarg++]);
        } else if ("-o".equals(opt)) {
          offset = Integer.parseInt(args[iarg++]);
        } else if ("-q".equals(opt)) {
          String pqf = args[iarg++].replaceAll("\\s", ""); // remove whitespace
          if (pqf.indexOf('/') < 0) {
            pqf += "/1";
          }
          final String[] pqrs = pqf.split("/");
          pq = new Q(Long.parseLong(pqrs[0]), Long.parseLong(pqrs[1]));
        } else if ("-s".equals(opt)) {
          skip = Integer.parseInt(args[iarg++]);
        } else {
          System.err.println("??? invalid option: \"" + opt + "\"");
        }
      } catch (final ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException e) {
        System.err.println("wrong option: " + args[iarg - 1] + ", message: " + e.getMessage());
      }
    } // while args

    if (debug > 0) {
      System.out.println("RootSequence: offset=" + offset + ", aSeqNo=" + ((seq == null) ? "null" : aSeqNo) + ", pq=" + pq);
    }
    if (seq != null) {
      SequenceFactory.printTerms(new RootSequence(offset, seq.skip(skip), pq), noTerms);
    }
  } // main
}

