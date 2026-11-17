package irvine.oeis.a399;

import java.util.function.Function;

import irvine.math.graph.UnlabeledReducibleDigraphs;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A399674 Number of unlabeled reducible flow graphs on n nodes with self-loops allowed and distinguished entry and exit nodes.
 * @author Gregory Morse
 */
public class A399674 extends CachedSequence {

  private static Function<Integer, Z> count() {
    final UnlabeledReducibleDigraphs graphs = new UnlabeledReducibleDigraphs();
    return n -> graphs.rooted(n, true, true);
  }

  /** Construct the sequence. */
  public A399674() {
    super(1, Integer.class, count());
  }
}
