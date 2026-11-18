package irvine.oeis.a399;

import java.util.function.Function;

import irvine.math.graph.UnlabeledReducibleDigraphs;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A399036 Number of unlabeled reducible flow graphs with n nodes whose entry is a global source (in-degree 0, reaches every node), self-loops disallowed.
 * @author Gregory Morse
 */
public class A399036 extends CachedSequence {

  private static Function<Integer, Z> count() {
    final UnlabeledReducibleDigraphs graphs = new UnlabeledReducibleDigraphs();
    return n -> graphs.singleSource(n, false, false);
  }

  /** Construct the sequence. */
  public A399036() {
    super(1, Integer.class, count());
  }
}
