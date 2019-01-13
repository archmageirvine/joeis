package irvine.math.diophantine;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;

import irvine.math.z.Z;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class StaticIteratorsTest extends TestCase {

  public void test() {
    final Iterator<List<Z>> i = StaticIterators.NO_SOLUTION;
    assertNotNull(i);
    assertFalse(i.hasNext());
    assertFalse(i.hasNext());
    try {
      i.next();
      fail();
    } catch (final NoSuchElementException e) {
      // ok
    }
    try {
      i.remove();
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }
}

