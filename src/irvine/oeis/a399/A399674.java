package irvine.oeis.a399;

import java.util.function.Function;

import irvine.math.graph.UnlabeledReducibleDigraphs;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A399674 Number of reducible flow graphs on n unlabeled nodes with self-loops allowed and distinguished entry r and exit t (r = t if n = 1, else r != t), counted up to isomorphism fixing r and t.
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
