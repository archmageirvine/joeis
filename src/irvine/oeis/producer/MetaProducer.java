package irvine.oeis.producer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import irvine.oeis.Sequence;

/**
 * A Producer that tries a sequence of other Producers.
 * @author Sean A. Irvine
 */
public class MetaProducer implements Producer {

  private final List<Producer> mProducerList = new ArrayList<>();

  /**
   * Create the default Producer chain.
   * @return general purpose Producer
   */
  public static Producer createDefaultProducer() {
    return new MetaProducer(
      new ReaderProducer(),
      new JavaProducer(),
      new PariProducer()
    );
  }

  /**
   * Construct a Producer that tries each of a list of other Producers in turn.
   * @param producers list of producers
   */
  public MetaProducer(final Producer... producers) {
    Collections.addAll(mProducerList, producers);
  }

  @Override
  public Sequence getSequence(final String aNumber) {
    for (final Producer p : mProducerList) {
      final Sequence seq = p.getSequence(aNumber);
      if (seq != null) {
        return seq;
      }
    }
    // None of the Producers could handle this aNumber
    return null;
  }
}
