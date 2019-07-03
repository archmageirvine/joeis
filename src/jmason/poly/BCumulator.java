package jmason.poly;

/**
 * A named set of counters specialized for counting polyominoes with maximum bias.
 * @author jmason
 */
public class BCumulator extends Cumulator {

  final int[] mMaxBias;

  BCumulator(final String name, final int max) {
    super(name, max);
    mMaxBias = new int[max + 1];
  }

  void add(final int c, final int b) {
    if (b > mMaxBias[c]) {
      mCounters[c] = 1;
      mMaxBias[c] = b;
    } else if (b == mMaxBias[c]) {
      ++mCounters[c];
    }
  }

  @Override
  void print() {
    System.err.println(mName);
    System.err.println(build());
    System.err.println(buildBias());
  }

  String buildBias() {
    return build(mMaxBias);
  }
}
