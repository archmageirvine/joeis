package irvine.math.set;

import irvine.math.api.Function;
import irvine.math.z.Integers;
import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class CompositionTest extends TestCase {

  static IntegerFunction gamma() {
    return new IntegerFunction(true, true) {
        @Override
        public Z image(final Z n) {
          return n.square();
        }
      };
  }

  public void testDurbin2p1() {
    final IntegerFunction alpha = IntegerFunctionTest.alpha();
    final Function<Z, Z> comp = Composition.compose(alpha, alpha);
    assertEquals(Integers.SINGLETON, comp.domain());
    assertEquals(Integers.SINGLETON, comp.codomain());
    assertEquals(Z.ZERO, comp.image(Z.ZERO));
    assertEquals(Z.FOUR, comp.image(Z.ONE));
    assertEquals(Z.EIGHT, comp.image(Z.TWO));
    assertTrue(comp.isOneToOne());
    assertFalse(comp.isOnto());
  }

  public void testDurbin2p2() {
    final IntegerFunction alpha = IntegerFunctionTest.alpha();
    final IntegerFunction gamma = gamma();
    final Function<Z, Z> comp = Composition.compose(alpha, gamma);
    assertEquals(Integers.SINGLETON, comp.domain());
    assertEquals(Integers.SINGLETON, comp.codomain());
    assertEquals(Z.ZERO, comp.image(Z.ZERO));
    assertEquals(Z.FOUR, comp.image(Z.ONE));
    assertEquals(Z.FOUR, comp.image(Z.NEG_ONE));
    assertEquals(Z.valueOf(16), comp.image(Z.TWO));
    assertTrue(comp.isOneToOne());
    assertFalse(comp.isOnto());
  }

  public void testDurbin2p3() {
    final IntegerFunction alpha = IntegerFunctionTest.alpha();
    final IntegerFunction beta = IntegerFunctionTest.beta();
    final Function<Z, Z> comp = Composition.compose(beta, alpha);
    assertEquals(Integers.SINGLETON, comp.domain());
    assertEquals(Integers.SINGLETON, comp.codomain());
    assertEquals(Z.TWO, comp.image(Z.ZERO));
    assertEquals(Z.FOUR, comp.image(Z.ONE));
    assertEquals(Z.ZERO, comp.image(Z.NEG_ONE));
    assertEquals(Z.SIX, comp.image(Z.TWO));
    assertTrue(comp.isOneToOne());
    assertFalse(comp.isOnto());
  }

  public void testDurbin2p4() {
    final IntegerFunction beta = IntegerFunctionTest.beta();
    final Function<Z, Z> comp = Composition.compose(beta, beta);
    assertEquals(Integers.SINGLETON, comp.domain());
    assertEquals(Integers.SINGLETON, comp.codomain());
    assertEquals(Z.TWO, comp.image(Z.ZERO));
    assertEquals(Z.THREE, comp.image(Z.ONE));
    assertEquals(Z.ONE, comp.image(Z.NEG_ONE));
    assertTrue(comp.isOneToOne());
    assertTrue(comp.isOnto());
  }

  public void testDurbin2p7() {
    final IntegerFunction beta = IntegerFunctionTest.beta();
    final Function<Z, Z> identity = Integers.SINGLETON.identityFunction();
    assertTrue(beta == Composition.compose(beta, identity));
    assertTrue(beta == Composition.compose(identity, beta));
  }

  private static IntegerFunction delta() {
    return new IntegerFunction(false, false) {
      @Override
      public Z image(final Z n) {
        return n.multiply2();
      }
    };
  }

  public void testNotOneToOne() {
    final IntegerFunction beta = IntegerFunctionTest.beta();
    final Function<Z, Z> comp = Composition.compose(beta, delta());
    assertFalse(comp.isOneToOne());
    assertFalse(comp.isOnto());
  }

}
