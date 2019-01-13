package irvine.util;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class DummyIteratorTest extends TestCase {

  public void testPair() {
    final AbstractIterator<String> it = new AbstractIterator<String>() {
      @Override
      public boolean hasNext() {
        return false;
      }

      @Override
      public String next() {
        return null;
      }
    };
    try {
      it.remove();
      fail();
    } catch (final UnsupportedOperationException e) {
      // ok
    }
  }
}

