package irvine.math.set;

import irvine.math.api.Function;
import irvine.math.z.Z;
import irvine.util.Pair;

import java.util.Arrays;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class InverseTest extends TestCase {

  public void testDurbin2p8() {
    final FiniteSet<Integer> s = new FiniteSet<>(1, 2, 3);
    final FiniteSet<String> t = new FiniteSet<>("a", "b", "c");
    final FiniteFunction<Integer, String> beta = new FiniteFunction<>(s, t, Arrays.asList(new Pair<>(1, "b"), new Pair<>(2, "c"), new Pair<>(3, "a")));
    final Function<String, Integer> inv = Inverse.inverse(beta);
    assertEquals(t, inv.domain());
    assertEquals(s, inv.codomain());
    assertEquals(s, inv.image());
    assertEquals(3, inv.image("a").intValue());
    assertEquals(1, inv.image("b").intValue());
    assertEquals(2, inv.image("c").intValue());
    assertTrue(inv.isOneToOne());
    assertTrue(inv.isOnto());
  }

  public void testInfinite() {
    final IntegerFunction f = new IntegerFunction(true, true) {
      @Override
      public Z image(final Z x) {
        return x;
      }
    };
    final Function<Z, Z> inv = Inverse.inverse(f);
    assertEquals(Z.ONE, inv.image(Z.ONE));
    assertEquals(Z.FIVE, inv.image(Z.FIVE));
  }
}
