package jmason.poly;

/**
 * An object used to vehicle a polyomino into an accumulator, which will count it if so desired.
 * @author jmason
 */
public class Countable {
  final Polyomino mP;
  final boolean mCountable;

  public Countable(final Polyomino p, final boolean countable) {
    mP = p;
    mCountable = countable;
  }
}
