package irvine.oeis.a402;

import java.util.LinkedList;
import java.util.List;

import irvine.math.z.Z;
import irvine.oeis.Sequence0;
import irvine.util.array.DynamicIntArray;

/**
 * A402125 allocated for Alper Ferudun.
 * @author Sean A. Irvine
 */
public class A402125 extends Sequence0 {

  private final List<Integer> mDeck = new LinkedList<>();
  private final DynamicIntArray mLast = new DynamicIntArray();
  private int mN = 0;

  /** Construct the sequence. */
  public A402125() {
    mDeck.add(1);
  }

  @Override
  public Z next() {
    ++mN;
    // Add the next new card
    mDeck.add(mN + 1);
    // Remove the top card.
    final int x = mDeck.remove(0);
    // Reinsert according to elapsed age
    final int pos = mN - mLast.get(x);
    mDeck.add(pos, x);
    mLast.set(x, mN);
    return Z.valueOf(x);
  }
}
