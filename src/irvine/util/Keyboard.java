package irvine.util;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 * Simple keyboard management for games.  Provides a way to test if a given key
 * is currently depressed on the keyboard.  Keys can optionally be consumed to
 * prevent them propagating to other handlers.  Key values outside the standard
 * range may cause various exceptions.
 *
 * @author Sean A. Irvine
 */
public class Keyboard {

  /** Keys consumed by this object. */
  private final boolean[] mConsume = new boolean[65536];
  /** Records which keys are currently pressed. */
  private final boolean[] mPressed = new boolean[65536];

  /**
   * Construct a new keyboard instance on a given component.
   *
   * @param comp component
   * @exception NullPointerException if <code>comp</code> is null.
   */
  public Keyboard(final Component comp) {
    // hide the actual key listener
    comp.addKeyListener(new KeyListener() {
        @Override
        public void keyPressed(final KeyEvent e) {
          final int keyCode = e.getKeyCode();
          mPressed[keyCode] = true;
          if (mConsume[keyCode]) {
            e.consume();
          }
        }

        @Override
        public void keyReleased(final KeyEvent e) {
          final int keyCode = e.getKeyCode();
          mPressed[keyCode] = false;
          if (mConsume[keyCode]) {
            e.consume();
          }
        }

        @Override
        public void keyTyped(final KeyEvent e) {
          final int keyCode = e.getKeyCode();
          if (mConsume[keyCode]) {
            e.consume();
          }
        }
      });
  }

  /**
   * Mark a key to be consumed by this Keyboard object.
   *
   * @param key key to consume
   */
  public void consume(final int key) {
    mConsume[key] = true;
  }

  /**
   * Mark an array of keys to be consumed.
   *
   * @param keys keys to consume
   */
  public void consume(final int[] keys) {
    for (final int k : keys) {
      consume(k);
    }
  }

  /**
   * Mark a key to be not consumed by this Keyboard object.  Calling this with
   * keys not already consumed has no effect.
   *
   * @param key key to not consume
   */
  public void unconsume(final int key) {
    mConsume[key] = false;
  }

  /**
   * Mark an array of keys to be not consumed.
   *
   * @param keys keys to not consume
   */
  public void unconsume(final int[] keys) {
    for (final int k : keys) {
      unconsume(k);
    }
  }

  /**
   * Test if a given key is currently held down on the keyboard.  Does not
   * remember keys that have been pressed and released since the last call
   * to this method.
   *
   * @param key key to test
   * @return true if key is currently pressed
   */
  public boolean isPressed(final int key) {
    return mPressed[key];
  }

  /**
   * Test if any of the listed keys is currently depressed.
   *
   * @param keys array of keys to test
   * @return true if any of them are pressed
   */
  public boolean isPressed(final int[] keys) {
    for (final int k : keys) {
      if (isPressed(k)) {
        return true;
      }
    }
    return false;
  }

}
