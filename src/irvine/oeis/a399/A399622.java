package irvine.oeis.a399;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import irvine.factor.factor.Jaguar;
import irvine.factor.util.FactorSequence;
import irvine.math.function.Functions;
import irvine.math.z.Z;
import irvine.oeis.Sequence;
import irvine.oeis.Sequence1;
import irvine.oeis.TwoParameterFormSequence;

/**
 * A399622 allocated for Bruno Paiva Viana.
 * @author Sean
 */
public class A399622 extends Sequence1 {

  private final Sequence mSemiprimes = new TwoParameterFormSequence(1, 4, 5, (x, y) -> x >= y ? null : Functions.PRIME.z(x).multiply(Functions.PRIME.z(y))) {
    @Override
    protected boolean accept(final long x, final long y, final Z n, final Z prev) {
      mX = x;
      mY = y;
      return super.accept(x, y, n, prev);
    }
  };
  private final HashMap<Z, List<Z>> mGraph = new HashMap<>();
  private long mX;
  private long mY;

  private boolean is(final Z n) {
    final FactorSequence fs = Jaguar.factor(n);
    return fs.omega() == 2 && fs.bigOmega() == 2 && fs.toZArray()[0].compareTo(Z.FIVE) > 0;
  }

  private boolean search(final Z start, final Z current, final int length, final HashSet<Z> used) {
    final int c = current.compareTo(start);
    if (c > 0) {
      return false; // start will not be smallest
    }
    if (length >= 3 && c == 0) {
      return true;
    }
    for (final Z next : mGraph.get(current)) {
      if (used.add(next)) {
        if (search(start, next, length + 1, used)) {
          return true;
        }
        used.remove(next);
      }
    }
    return false;
  }

  @Override
  public Z next() {
    while (true) {
      final Z s = mSemiprimes.next();
      final long p = Functions.PRIME.l(mX);
      final long q = Functions.PRIME.l(mY);

      // Update graph with new vertex
      final ArrayList<Z> edges = new ArrayList<>();
      mGraph.put(s, edges);
      final Z e0 = s.subtract(p + q);
      if (mGraph.containsKey(e0)) {
        edges.add(e0);
      }
      final Z e1 = s.subtract(q - p);
      if (mGraph.containsKey(e1)) {
        edges.add(e1);
      }
      // Larger edges can be relevant in the future
      final Z e2 = s.add(p + q);
      if (is(e2)) {
        edges.add(e2);
      }
      final Z e3 = s.add(q - p);
      if (is(e3)) {
        edges.add(e3);
      }

      // Search for cycle
      if (search(s, s, 0, new HashSet<>())) {
        return s;
      }
    }
  }
}

