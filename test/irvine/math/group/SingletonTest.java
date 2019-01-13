package irvine.math.group;

import irvine.math.polynomial.CycleIndex;
import irvine.math.z.Z;
import junit.framework.TestCase;

import java.util.Iterator;
import java.util.NoSuchElementException;
import java.util.Random;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SingletonTest extends TestCase {

  public void testNull() {
    final Singleton<Object> i = new Singleton<>(null);
    assertEquals(Z.ONE, i.size());
    assertTrue(i.contains(null));
    assertTrue(i.isAbelian());
    assertEquals("{null}", i.toString());
    assertFalse(i.contains(new Object()));
    assertNull(i.zero());
    assertNull(i.add(null, null));
    assertNull(i.negate(null));
    final Iterator<Object> it = i.iterator();
    assertTrue(it.hasNext());
    assertNull(it.next());
    assertFalse(it.hasNext());
    try {
      i.add(null, new Object());
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.add(new Object(), null);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.negate(new Object());
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      it.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
  }

  public void testRandom() {
    final Random r = new Random();
    final Singleton<Random> i = new Singleton<>(r);
    assertEquals(Z.ONE, i.size());
    assertTrue(i.contains(r));
    assertFalse(i.contains(null));
    assertFalse(i.contains(new Random()));
    assertEquals(r, i.zero());
    assertEquals(r, i.add(r, r));
    assertEquals(r, i.negate(r));
    final Iterator<Random> it = i.iterator();
    assertTrue(it.hasNext());
    assertEquals(r, it.next());
    assertFalse(it.hasNext());
    try {
      it.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
    try {
      i.add(r, new Random());
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.add(new Random(), null);
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    try {
      i.negate(new Random());
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals("Z(S1) = x_1", i.cycleIndex().toString());
  }
  
  public void testCycleIndex() {
    final Singleton<Object> i = new Singleton<>(new Object());
    final CycleIndex ci = i.cycleIndex();
    assertEquals("Z(S1) = x_1", ci.toString());
    assertEquals("Z(S1)", ci.getName());
  }
}
