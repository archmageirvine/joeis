package irvine.oeis.producer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

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
      new PariProducer(),
      new GapProducer()
    );
  }

  /**
   * Create a producer based on a comma separated list. The <code>ReaderProducer</code>
   * will always be included as the first element.
   * For example <code>java,gp</code>
   * @param producerList comma separated list of Producers
   * @return final Producer
   */
  public static Producer createProducer(final String producerList) {
    final String[] p = producerList.split(",");
    final Producer[] prods = new Producer[p.length + 1];
    prods[0] = new ReaderProducer();
    int k = 0;
    for (final String s : p) {
      final String t = s.trim().toLowerCase(Locale.getDefault());
      switch (t) {
        case "gap":
          prods[++k] = new GapProducer();
          break;
        case "java":
          prods[++k] = new JavaProducer();
          break;
        case "pari":
        case "gp":
          prods[++k] = new PariProducer();
          break;
        default:
          throw new RuntimeException("Unknown producer type: \"" + s + "\"");
      }
    }
    return new MetaProducer(prods);
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
