package irvine.oeis.a398;

import java.util.function.Function;

import irvine.math.graph.UnlabeledReducibleDigraphs;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A398796 Number of unlabeled reducible flow graphs on n nodes with self-loops allowed and a distinguished entry.
 * @author Gregory Morse
 */
public class A398796 extends CachedSequence {

  private static Function<Integer, Z> count() {
    final UnlabeledReducibleDigraphs graphs = new UnlabeledReducibleDigraphs();
    return n -> graphs.rooted(n, false, true);
  }

  /** Construct the sequence. */
  public A398796() {
    super(1, Integer.class, count());
  }
}
