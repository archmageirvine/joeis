package irvine.oeis.a399;

import java.util.function.Function;

import irvine.math.graph.UnlabeledReducibleDigraphs;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A399875 Number of unlabeled reducible flow graphs with n nodes containing a global source and a global sink, self-loops disallowed.
 * @author Gregory Morse
 */
public class A399875 extends CachedSequence {

  private static Function<Integer, Z> count() {
    final UnlabeledReducibleDigraphs graphs = new UnlabeledReducibleDigraphs();
    return n -> graphs.singleSource(n, true, false);
  }

  /** Construct the sequence. */
  public A399875() {
    super(1, Integer.class, count());
  }
}
