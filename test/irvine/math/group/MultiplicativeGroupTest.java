package irvine.math.group;

import irvine.math.api.Group;
import irvine.math.q.Rationals;
import junit.framework.TestCase;
import irvine.math.q.Q;
import java.util.Iterator;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MultiplicativeGroupTest extends TestCase {

  public void testRationals() {
    final Group<Q> ratMul = Rationals.SINGLETON.multiplicativeGroup();
    assertNull(ratMul.size());
    assertFalse(ratMul.contains(Q.ZERO));
    assertTrue(ratMul.contains(Q.ONE));
    assertEquals(Q.ONE, ratMul.add(Q.ONE, Q.ONE));
    assertEquals(new Q(1, 6), ratMul.add(Q.HALF, Q.ONE_THIRD));
    assertTrue(ratMul.isAbelian());
    final Iterator<Q> it = ratMul.iterator();
    assertTrue(it.hasNext());
    assertEquals(Q.ONE, it.next());
    assertTrue(it.hasNext());
    assertEquals(Q.HALF, ratMul.negate(Q.TWO));
    assertEquals("mult(\\Q)", ratMul.toString());
  }
}
