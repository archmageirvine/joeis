package irvine.oeis.a399;

import java.util.function.Function;

import irvine.math.graph.UnlabeledReducibleDigraphs;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A399037 Number of strongly connected digraphs on n unlabeled nodes with a distinguished node at which they are reducible as a flow graph, counted up to isomorphism fixing that node.
 * @author Gregory Morse
 */
public class A399037 extends CachedSequence {

  private static Function<Integer, Z> count() {
    final UnlabeledReducibleDigraphs graphs = new UnlabeledReducibleDigraphs();
    return n -> graphs.strong(n);
  }

  /** Construct the sequence. */
  public A399037() {
    super(1, Integer.class, count());
  }
}
