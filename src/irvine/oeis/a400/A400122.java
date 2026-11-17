package irvine.oeis.a400;

import java.util.function.Function;

import irvine.math.graph.UnlabeledReducibleDigraphs;
import irvine.math.z.Z;
import irvine.oeis.CachedSequence;

/**
 * A400122 Number of unlabeled reducible flow graphs with n nodes containing a global source and a global sink, self-loops allowed.
 * @author Gregory Morse
 */
public class A400122 extends CachedSequence {

  private static Function<Integer, Z> count() {
    final UnlabeledReducibleDigraphs graphs = new UnlabeledReducibleDigraphs();
    return n -> graphs.singleSource(n, true, true);
  }

  /** Construct the sequence. */
  public A400122() {
    super(1, Integer.class, count());
  }
}
