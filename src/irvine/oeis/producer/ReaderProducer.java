package irvine.oeis.producer;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import irvine.oeis.ReaderSequence;
import irvine.oeis.Sequence;

/**
 * A special Producer that handles reading a sequence from standard input.
 * @author Sean A. Irvine
 */
public class ReaderProducer implements Producer {

  @Override
  public Sequence getSequence(final String aNumber) {
    return "-".equals(aNumber) ? new ReaderSequence(new BufferedReader(new InputStreamReader(System.in))) : null;
  }
}
