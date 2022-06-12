package irvine.oeis.producer;

import irvine.oeis.Sequence;

/**
 * Interface for sequence producers.  A producer is able to return sequence objects
 * for some number of sequences given a OEIS sequence identifier (A-number).
 * @author Sean A. Irvine
 */
public interface Producer {

  /**
   * Return an object capable of generating the terms of the specified sequence,
   * or null if this Producer is unable to generate the sequence.
   * @param aNumber OEIS A-number
   * @return sequence object or null.
   */
  Sequence getSequence(final String aNumber);
}
