package irvine.oeis.a398;

import java.util.function.Function;

import irvine.math.graph.UnlabeledReducibleDigraphs;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A398798 Number of reducible flow graphs on n unlabeled nodes with distinguished entry r and exit t reachable from every node (r = t if n = 1, else r != t), counted up to isomorphism fixing r and t.
 * @author Gregory Morse
 */
public class A398798 extends CachedSequence {

  private static Function<Integer, Z> count() {
    final UnlabeledReducibleDigraphs graphs = new UnlabeledReducibleDigraphs();
    return n -> graphs.rooted(n, true, false);
  }

  /** Construct the sequence. */
  public A398798() {
    super(1, Integer.class, count());
  }
}
