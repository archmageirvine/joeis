package irvine.oeis.a402;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import irvine.math.z.Z;
import irvine.oeis.Sequence1;

/**
 * A402446 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A402446 extends Sequence1 {

  // Explicitly represented prefix of the infinite deck.
  private final ArrayList<Integer> mDeck = new ArrayList<>();
  // Last step at which each card was read.
  private final Map<Integer, Integer> mLast = new HashMap<>();
  // Next card beyond the represented prefix.
  private int mNextCard = 1;
  private int mN = 0;

  /** Construct the sequence. */
  public A402446() {
    mDeck.add(mNextCard++);
  }

  @Override
  public Z next() {
    ++mN;

    // Read and remove the top card.
    final int j = mDeck.remove(0);
    final int last = mLast.getOrDefault(j, 0);
    final int pos = 2 * (mN - last);

    // Extend the represented prefix of the infinite deck.
    // Newly exposed cards are the next untouched positive integers.
    while (mDeck.size() <= pos) {
      mDeck.add(mNextCard++);
    }

    // Reinsert the card after pos remaining cards.
    mDeck.add(pos, j);
    mLast.put(j, mN);
    return Z.valueOf(j);
  }
}
