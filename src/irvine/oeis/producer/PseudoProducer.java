package irvine.oeis.producer;

import irvine.oeis.PseudoSequence;
import irvine.oeis.Sequence;

/**
 * A special Producer that handles reading a sequence from a b-file directory.
 * @author Georg Fischer
 */
public class PseudoProducer implements Producer {

  private final boolean mVerbose = "true".equals(System.getProperty("oeis.verbose"));

  @Override
  public Sequence getSequence(final String aNumber) {
    try {
      return new PseudoSequence(aNumber);
    } catch (final RuntimeException exc) {
      if (mVerbose) {
        final String env = System.getenv("BFPATH");
        System.err.println("PseudoProducer: BFPATH=" + env + ", A-number=" + aNumber + " could not be read: " + exc.getMessage());
        exc.printStackTrace();
      }
      return null;
    }
  }
}
