package irvine.oeis.a400;

import java.util.HashSet;
import java.util.LinkedList;

import irvine.oeis.ParallelPermutationSequence;

/**
 * A400411 allocated for Daniel Okwor.
 * @author Sean A. Irvine
 */
public class A400411 extends ParallelPermutationSequence {

  /** Construct the sequence. */
  public A400411() {
    super(1);
  }

  @Override
  protected long count(final int[] p) {
    // Set up players
    final LinkedList<Integer> a = new LinkedList<>();
    final LinkedList<Integer> b = new LinkedList<>();
    final int split = (p.length + 1) / 2;
    for (int k = 0; k < p.length; ++k) {
      if (k < split) {
        a.add(p[k]);
      } else {
        b.add(p[k]);
      }
    }
    final HashSet<String> seen = new HashSet<>();
    while (!a.isEmpty() && !b.isEmpty()) {
      if (!seen.add(a.toString() + b)) {
        return 1; // identical state reached, game does not terminate
      }
      final int ta = a.pollFirst();
      final int tb = b.pollFirst();
      if (ta > tb) {
        a.add(ta);
        a.add(tb);
      } else {
        b.add(tb);
        b.add(ta);
      }
    }
    return 0; // game terminates
  }
}
