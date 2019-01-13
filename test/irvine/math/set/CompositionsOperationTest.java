package irvine.math.set;

import irvine.math.api.Function;
import irvine.math.api.Operation;
import irvine.math.api.Set;
import irvine.math.z.Z;

import java.util.Arrays;
import java.util.Iterator;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class CompositionsOperationTest extends TestCase {

  public void testDurbin4p1() {
    final FiniteSet<String> s = new FiniteSet<>("a", "b");
    final Operation<Function<String, String>> o = new CompositionsOperation<>(s);
    assertTrue(o.isAssociative());
    final Set<Function<String, String>> fn = o.codomain();
    assertEquals(Z.FOUR, fn.size());
    final Iterator<Function<String, String>> it = fn.iterator();
    assertTrue(it.hasNext());
    final Function<String, String> pi = it.next();
    assertTrue(it.hasNext());
    final Function<String, String> rho = it.next();
    assertTrue(it.hasNext());
    final Function<String, String> sigma = it.next();
    assertTrue(it.hasNext());
    final Function<String, String> tau = it.next();
    assertFalse(it.hasNext());
    assertEquals("a", pi.image("a"));
    assertEquals("a", pi.image("b"));
    assertEquals("a", rho.image("a"));
    assertEquals("b", rho.image("b"));
    assertEquals("b", sigma.image("a"));
    assertEquals("a", sigma.image("b"));
    assertEquals("b", tau.image("a"));
    assertEquals("b", tau.image("b"));
    final Function<String, String> rhoCircTau = Composition.compose(tau, rho);
    assertEquals("b", rhoCircTau.image("a"));
    assertEquals("b", rhoCircTau.image("b"));
    assertEquals(tau, rhoCircTau);
    final Function<String, String> sigmaCircTau = Composition.compose(tau, sigma);
    assertEquals(pi, sigmaCircTau);
    // Construct an entire Cayley table, see Problem 4p1(a) in Durbin
    final String[][] names = new String[4][4];
    int j = 0;
    for (final Iterator<Function<String, String>> alpha = fn.iterator(); alpha.hasNext(); ++j) {
      final Function<String, String> a = alpha.next();
      int k = 0;
      for (final Iterator<Function<String, String>> beta = fn.iterator(); beta.hasNext(); ++k) {
        final Function<String, String> b = beta.next();
        final Function<String, String> c = Composition.compose(a, b);
        final Function<String, String> d = o.op(a, b);
        assertEquals(c, d);
        if (c.equals(pi)) {
          names[k][j] = "pi";
        } else if (c.equals(rho)) {
          names[k][j] = "rho";
        } else if (c.equals(sigma)) {
          names[k][j] = "sigma";
        } else if (c.equals(tau)) {
          names[k][j] = "tau";
        } else {
          fail();
        }
      }
    }
    assertEquals("[pi, pi, pi, pi]", Arrays.toString(names[0]));
    assertEquals("[pi, rho, sigma, tau]", Arrays.toString(names[1]));
    assertEquals("[tau, sigma, rho, pi]", Arrays.toString(names[2]));
    assertEquals("[tau, tau, tau, tau]", Arrays.toString(names[3]));
    assertFalse(o.isIdentity(pi));
    assertTrue(o.isIdentity(rho));
    assertFalse(o.isIdentity(sigma));
    assertFalse(o.isIdentity(tau));
    assertFalse(o.isCommutative());
    assertFalse(pi.isInvertible());
    assertTrue(rho.isInvertible());
    assertTrue(sigma.isInvertible());
    assertFalse(tau.isInvertible());
  }

}
