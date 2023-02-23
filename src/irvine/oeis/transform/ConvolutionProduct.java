package irvine.oeis.transform;

import java.lang.reflect.InvocationTargetException;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SkipSequence;

/**
 * Compute the convolution product of two or more generating functions.
 * First, all parameter sequences are transformed by an {@link InverseEulerTransform}.
 * The resulting sequences are multiplied by the corresponding exponents, and termwise sums are computed.
 * The sequence of these sums is finally transformed back by an {@link EulerTransform}.
 * @author Georg Fischer
 */
public class ConvolutionProduct extends EulerTransform {

  private final Q[] mExponents;
  private final InverseEulerTransform[] mIETs;
  private final int mSeqNo;

  /**
   * Construct the sequence.
   * @param offset first index
   * @param exponents list of rational exponents in the order of <code>seqs</code>
   * @param seqs list of sequences
   */
  public ConvolutionProduct(final int offset, final String exponents, final Sequence... seqs) {
    super(offset);
    mSeqNo = seqs.length;
    final String[] exps = exponents.replaceAll("[^\\-\\d\\/\\,\\;]", "").split("[\\,\\;]");
    mExponents =  new Q[mSeqNo];
    mIETs = new InverseEulerTransform[mSeqNo];
    for (int is = 0; is < mSeqNo; ++is) {
      seqs[is].next(); // skip 1
      mIETs[is] = new InverseEulerTransform(seqs[is]);
      long num = 0;
      long den = 1;
      try {
        final String es = exps[is];
        final int slashPos = es.indexOf('/');
        if (slashPos < 0) {
          num = Long.parseLong(es);
        } else {
          num = Long.parseLong(es.substring(0, slashPos));
          den = Long.parseLong(es.substring(slashPos + 1));
        }
      } catch (final NumberFormatException exc) {
        // ignore
      }
      mExponents[is] = new Q(num, den);
    }
    mSeq = new AbstractSequence(0) {
        @Override
        public Z next() {
          Q sum = Q.ZERO;
          for (int is = 0; is < mSeqNo; ++is) {
            sum = sum.add(new Q(mIETs[is].next()).multiply(mExponents[is]));
          }
          if (!sum.isInteger()) {
            throw new UnsupportedOperationException("resulting term is not integer: " + sum);
          } 
          return sum.num();
        }
      };
    mPreTerms = new Z[] { Z.ONE };
  }

  /**
   * Construct the sequence.
   * @param offset first index
   * @param exponents list of rational exponents in the order of <code>seqs</code>
   * @param aSeqNos list of sequences
   */
  public ConvolutionProduct(final int offset, final String exponents, final String aSeqNos) {
    this(offset, exponents, toArray(aSeqNos));
  }

  /**
   * Build an array of sequences.
   * @param aSeqNos list of (A-numbers eventually followed by a negative skip count (default -1))
   * @return array of sequences
   */
  public static Sequence[] toArray(final String aSeqNos) {
    final String[] seqNos = aSeqNos.split("\\,");
    final int seqLen = seqNos.length;
    final Sequence[] result = new Sequence[seqLen];
    for (int is = 0; is < seqLen; ++is) {
      String seqNo = seqNos[is];
      final int dashPos = seqNo.indexOf('-');
      Sequence seq;
      try {
        if (dashPos < 0) {
          seq = (Sequence) Class.forName("irvine.oeis.a" + seqNo.substring(1, 4) + '.' + seqNo)
              .getDeclaredConstructor().newInstance();
        } else {
          final int skip = Integer.parseInt(seqNo.substring(dashPos + 1));
          seqNo = seqNo.substring(0, dashPos);
          seq = new SkipSequence((Sequence) Class.forName("irvine.oeis.a" + seqNo.substring(1, 4) + '.' + seqNo)
              .getDeclaredConstructor().newInstance(), skip);
        }
      } catch (final ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException exc) {
        throw new UnsupportedOperationException("invalid A-number: " + seqNo);
      }
      result[is] = seq;
    }
    return result;
  }

  /**
   * Main test method: compute the convolution product of several sequences
   * @param args command line arguments:
   * <ul>
   * <li>-a list of (A-numbers eventually followed by a negative skip count (default -1))</li>
   * <li>-n number of terms (default 32)</li>
   * <li>-o offset, first index (default 0) </li>
   * <li>-q list of rational exponents (default "1,1")</li>
   * </ul>
   */
  public static void main(final String[] args) {
    int debug = 0;
    String aSeqNos = "A007528,A002476"; // A354543 Convolution of {{A007528}} and {{A002476}}
    String exponents = "1,1";
    int offset = 0;
    int noTerms = 32;
    int iarg = 0;
    while (iarg < args.length) { // consume all arguments
      final String opt = args[iarg++];
      try {
        if (opt.equals("-d")) {
          debug = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-a")) {
          aSeqNos = args[iarg++];
        } else if (opt.equals("-n")) {
          noTerms = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-o")) {
          offset = Integer.parseInt(args[iarg++]);
        } else if (opt.equals("-q")) {
          exponents = args[iarg++];
        } else {
          System.err.println("??? invalid option: \"" + opt + "\"");
        }
      } catch (final Exception exc) { // take default
        System.err.println("wrong option: " + args[iarg - 1] + ", message: " + exc.getMessage());
      }
    } // while args

    final ConvolutionProduct cp = new ConvolutionProduct(offset, exponents, aSeqNos);
    for (int iterm = 0; iterm < noTerms; ++iterm) {
      if (iterm > 0) {
        System.out.print(",");
      }
      System.out.print(cp.next());
    } // for iterm
    System.out.println();
  } // main
}

