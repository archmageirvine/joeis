package irvine.math.cr;

import junit.framework.TestCase;
import irvine.math.q.Q;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class ConvergentsTest extends TestCase {

  public void testPi() {
    final Convergents cf = new Convergents(CR.PI);
    assertTrue(cf.hasNext());
    assertEquals(Q.THREE, cf.next());
    assertTrue(cf.hasNext());
    assertEquals(new Q(22, 7), cf.next());
    assertTrue(cf.hasNext());
    assertEquals(new Q(333, 106), cf.next());
    assertTrue(cf.hasNext());
    assertEquals(new Q(355, 113), cf.next());
    assertTrue(cf.hasNext());
  }

  public void testFinite() {
    final Convergents cf = new Convergents(CR.valueOf(3245).divide(CR.valueOf(1000)));
    assertTrue(cf.hasNext());
    assertEquals(Q.THREE, cf.next());
    assertTrue(cf.hasNext());
    assertEquals(new Q(13, 4), cf.next());
    assertTrue(cf.hasNext());
    assertEquals(new Q(159, 49), cf.next());
    assertTrue(cf.hasNext());
    assertEquals(new Q(649, 200), cf.next());
    assertFalse(cf.hasNext());
  }
}
