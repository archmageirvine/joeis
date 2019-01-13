package irvine.util;

import irvine.TestUtils;
import junit.framework.TestCase;

import java.awt.GraphicsEnvironment;
import java.awt.Label;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class KeyboardTest extends TestCase {

  public void testNull() {
    try {
      new Keyboard(null);
      fail();
    } catch (final NullPointerException e) {
      // ok
    }
  }

  public void testMinimal() {
    // uses some nasty reflection and requires a head
    if (!GraphicsEnvironment.isHeadless()) {
      final Keyboard k = new Keyboard(new Label());
      k.consume('x');
      boolean[] c = (boolean[]) TestUtils.getField("mConsume", k);
      assertEquals(65536, c.length);
      for (int i = 0; i < c.length; ++i) {
        assertEquals(i == 'x', c[i]);
      }
      k.consume(new int[] {'j', 'x', 'z'});
      c = (boolean[]) TestUtils.getField("mConsume", k);
      for (int i = 0; i < c.length; ++i) {
        assertEquals(i == 'x' || i == 'j' || i == 'z', c[i]);
      }
      k.unconsume(new int[] {'j', 'x', 'z'});
      c = (boolean[]) TestUtils.getField("mConsume", k);
      for (final boolean aC : c) {
        assertFalse(aC);
      }
      c = (boolean[]) TestUtils.getField("mPressed", k);
      assertEquals(65536, c.length);
      for (int i = 0; i < c.length; ++i) {
        assertFalse(c[i]);
        assertFalse(k.isPressed(i));
      }
      assertFalse(k.isPressed(new int[] {'x', 'y', 'z'}));
      c['x'] = true;
      assertTrue(k.isPressed(new int[] {'x', 'y', 'z'}));
    }
  }
}
