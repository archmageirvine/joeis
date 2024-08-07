package irvine.oeis.transform;

import java.lang.reflect.InvocationTargetException;

import irvine.math.q.Q;
import irvine.math.z.Z;
import irvine.oeis.AbstractSequence;
import irvine.oeis.Sequence;
import irvine.oeis.SequenceFactory;

/**
 * Compute the convolution product of two or more generating functions.
 * First, all parameter sequences are transformed by an {@link InverseEulerTransform}.
 * The resulting sequences are multiplied by the corresponding exponents, and termwise sums are computed.
 * The sequence of these sums is finally transformed back by an {@link EulerTransform}.
 * @author Georg Fischer
 */
public class ConvolutionProduct extends EulerTransform {

  /**
   * Construct the sequence.
   * @param offset first index
   * @param exponents list of rational exponents in the order of <code>seqs</code>
   * @param seqs list of sequences
   */
  public ConvolutionProduct(final int offset, final String exponents, final Sequence... seqs) {
    super(offset);
    final int seqNo = seqs.length;
    final String[] exps = exponents.replaceAll("[^\\-\\d\\/\\,\\;]", "").split("[\\,\\;]");
    final Q[] qExponents =  new Q[seqNo];
    final InverseEulerTransform[] inverseEulerTransforms = new InverseEulerTransform[seqNo];
    for (int is = 0; is < seqNo; ++is) {
      seqs[is].next(); // skip 1
      inverseEulerTransforms[is] = new InverseEulerTransform(seqs[is]);
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
      qExponents[is] = new Q(num, den);
    }
    mSeq = new AbstractSequence(0) {
        @Override
        public Z next() {
          Q sum = Q.ZERO;
          for (int is = 0; is < seqNo; ++is) {
            sum = sum.add(new Q(inverseEulerTransforms[is].next()).multiply(qExponents[is]));
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
      final Sequence seq;
      try {
        if (dashPos < 0) {
          seq = (Sequence) Class.forName("irvine.oeis.a" + seqNo.substring(1, 4) + '.' + seqNo)
              .getDeclaredConstructor().newInstance();
        } else {
          final int skip = Integer.parseInt(seqNo.substring(dashPos + 1));
          seqNo = seqNo.substring(0, dashPos);
          seq = (Sequence) Class.forName("irvine.oeis.a" + seqNo.substring(1, 4) + '.' + seqNo)
              .getDeclaredConstructor().newInstance();
          for (int k = 0; k < skip; ++k) {
            seq.next();
          }
        }
      } catch (final ClassNotFoundException | NoSuchMethodException | InstantiationException | IllegalAccessException | InvocationTargetException exc) {
        throw new UnsupportedOperationException("invalid A-number: " + seqNo, exc);
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
        if ("-d".equals(opt)) {
          debug = Integer.parseInt(args[iarg++]);
        } else if ("-a".equals(opt)) {
          aSeqNos = args[iarg++];
        } else if ("-n".equals(opt)) {
          noTerms = Integer.parseInt(args[iarg++]);
        } else if ("-o".equals(opt)) {
          offset = Integer.parseInt(args[iarg++]);
        } else if ("-q".equals(opt)) {
          exponents = args[iarg++];
        } else {
          System.err.println("??? invalid option: \"" + opt + "\"");
        }
      } catch (final Exception exc) { // take default
        System.err.println("wrong option: " + args[iarg - 1] + ", message: " + exc.getMessage());
      }
    } // while args

    SequenceFactory.printTerms(new ConvolutionProduct(offset, exponents, aSeqNos), noTerms);
  } // main
}

