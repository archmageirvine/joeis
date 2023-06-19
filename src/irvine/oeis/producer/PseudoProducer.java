package irvine.oeis.producer;

import irvine.oeis.PseudoSequence;
import irvine.oeis.Sequence;
import irvine.util.string.StringUtils;

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
        StringUtils.message("PseudoProducer: BFPATH=" + System.getenv("BFPATH") + ", A-number=" + aNumber + " could not be read.");
      }
      return null;
    }
  }
}
