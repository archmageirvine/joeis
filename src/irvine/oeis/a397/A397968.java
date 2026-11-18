package irvine.oeis.a397;

import java.util.function.Function;

import irvine.math.graph.UnlabeledReducibleDigraphs;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A397968 Number of unlabeled reducible flow graphs on n nodes with a distinguished entry.
 * @author Gregory Morse
 */
public class A397968 extends CachedSequence {

  private static Function<Integer, Z> count() {
    final UnlabeledReducibleDigraphs graphs = new UnlabeledReducibleDigraphs();
    return n -> graphs.rooted(n, false, false);
  }

  /** Construct the sequence. */
  public A397968() {
    super(1, Integer.class, count());
  }
}
