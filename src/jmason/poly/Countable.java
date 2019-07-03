package jmason.poly;

/**
 * An object used to vehicle a polyomino into an accumulator, which will count it if so desired.
 * @author jmason
 */
class Countable {

  final Polyomino mP;
  final boolean mCountable;

  Countable(final Polyomino p, final boolean countable) {
    mP = p;
    mCountable = countable;
  }
}
