package jmason.poly;

/**
 * A BCumulator is a named set of counters specialized for counting polyominoes with maximum bias.
 * @author jmason
 */
public class BCumulator extends Cumulator {
  final int[] maxBias;

  public BCumulator(final String name, final int max) {
    super(name, max);
    maxBias = new int[max + 1];
  }

  public void add(final int c, final int b) {
    if (b > maxBias[c]) {
      mCounters[c] = 1;
      maxBias[c] = b;
    } else if (b == maxBias[c]) {
      ++mCounters[c];
    }

  }

  @Override
  public void print() {
    System.err.println(mName);
    System.err.println(build());
    System.err.println(buildBias());
  }

  public String buildBias() {
    return build(maxBias);
  }
}
