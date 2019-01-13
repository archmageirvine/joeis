package irvine.math.group;

import irvine.math.z.Z;
import junit.framework.TestCase;

import java.util.HashSet;
import java.util.NoSuchElementException;


/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class ZeroSkippingIteratorTest extends TestCase {

  public void test() {
    final HashSet<Z> set = new HashSet<>();
    set.add(Z.ZERO);
    set.add(Z.ONE);
    set.add(Z.TWO);
    final ZeroSkippingIterator<Z> it = new ZeroSkippingIterator<>(set.iterator(), Z.ZERO);
    assertTrue(it.hasNext());
    assertTrue(it.hasNext());
    final Z a = it.next();
    assertTrue(it.hasNext());
    final Z b = it.next();
    assertFalse(it.hasNext());
    try {
      it.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
    if (a.equals(Z.ONE)) {
      assertEquals(Z.TWO, b);
    } else {
      assertEquals(Z.TWO, a);
      assertEquals(Z.ONE, b);
    }
  }

}
