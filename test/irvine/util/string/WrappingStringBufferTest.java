package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class WrappingStringBufferTest extends TestCase {




  private static final String LS = System.lineSeparator();

  public void test() {
    final WrappingStringBuffer b = new WrappingStringBuffer();
    assertEquals("", b.toString());
    assertEquals(b, b.append("hi"));
    assertEquals("hi", b.toString());
    assertEquals(b, b.append(" there peasant"));
    assertEquals("hi there peasant", b.toString());
    try {
      b.setWrapWidth(-1);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Wrap width must be positive.", e.getMessage());
    }
    b.setWrapWidth(10);
    assertEquals("hi there peasant", b.toString());
    assertEquals("hi there peasant a a a a a a a a  a a aa a a a a a a a a a a a a a a a aa a a a a a a aa a a a a a a a a a a a a a a a a a aa  aa a a a a aaa a a a a aa a a a a a a a aa  ", b.wrapText(" a a a a a a a a  a a aa a a a a a a a a a a a a a a a aa a a a a a a aa a a a a a a a a a a a a a a a a a aa  aa a a a a aaa a a a a aa a a a a a a a aa  ").toString());
    assertEquals(b, b.append('z'));
    assertEquals("hi there peasant a a a a a a a a  a a aa a a a a a a a a a a a a a a a aa a a a a a a aa a a a a a a a a a a a a a a a a a aa  aa a a a a aaa a a a a aa a a a a a a a aa  z", b.toString());
  }

  public void testInitial() {
    assertEquals("hi", new WrappingStringBuffer("hi").toString());
    assertEquals(" a a a a a a a a  a a aa a a a a a a a a a a a a a a a aa a a a a a a aa a a a a a a a a a a a a a a a a a aa  aa a a a a aaa a a a a aa a a a a a a a aa  ", new WrappingStringBuffer(" a a a a a a a a  a a aa a a a a a a a a a a a a a a a aa a a a a a a aa a a a a a a a a a a a a a a a a a aa  aa a a a a aaa a a a a aa a a a a a a a aa  ").toString());
  }

  public void testWrapText() {
    final WrappingStringBuffer b = new WrappingStringBuffer();
    b.setWrapWidth(70);
    try {
      b.wrapText("hello\nthere");
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Input string cannot contain line breaks.", e.getMessage());
    }
    assertEquals(b, b.wrapText("hello"));
    final String s = b.wrapText(" a a a a a a a a  a a aa a a a a a a a a a a a a a a a aa a a a a a a aa a a a a a a a a a a a a a a a a a aa  aa a a a a aaa a a a a aa a a a a a a a aa  ").toString();
    assertEquals(s, "hello a a a a a a a a  a a aa a a a a a a a a a a a a a a a aa a a a" + LS + "a a a aa a a a a a a a a a a a a a a a a a aa  aa a a a a aaa a a a a" + LS + "aa a a a a a a a aa  ", s);
  }

  public void testWrapText2() {
    final WrappingStringBuffer b = new WrappingStringBuffer();
    b.setWrapWidth(70);
    b.setWrapIndent("POX");
    try {
      b.wrapText("hello\nthere");
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals(b, b.wrapText("hello"));
    assertEquals(b, b.wrapText(" a a a a a a a a  a a aa a a a a a a a a a a a a a a a aa a a a a a a aa a a a a a a a a a a a a a a a a a aa  aa a a a a aaa a a a a aa a a a a a a a aa  "));
    final String s = b.toString();
    assertEquals(s, "hello a a a a a a a a  a a aa a a a a a a a a a a a a a a a aa a a a" + LS + "POXa a a aa a a a a a a a a a a a a a a a a a aa  aa a a a a aaa a a" + LS + "POXa a aa a a a a a a a aa  ", s);
  }

  public void testWrapText3() {
    final WrappingStringBuffer b = new WrappingStringBuffer();
    b.setWrapWidth(70);
    b.setWrapIndent(5);
    try {
      b.wrapText("hello\nthere");
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
    assertEquals(b, b.wrapText("hello"));
    final String s = b.wrapText(" a a a a a a a a  a a aa a a a a a a a a a a a a a a a aa a a a a a a aa a a a a a a a a a a a a a a a a a aa  aa a a a a aaa a a a a aa a a a a a a a aa  ").toString();
    assertEquals(s, "hello a a a a a a a a  a a aa a a a a a a a a a a a a a a a aa a a a" + LS + "     a a a aa a a a a a a a a a a a a a a a a a aa  aa a a a a aaa a" + LS + "     a a a aa a a a a a a a aa  ", s);
  }

  public void testBorderlinePrefix() {
    final WrappingStringBuffer b = new WrappingStringBuffer();
    assertEquals(b, b.wrapText(""));
    assertEquals(b, b.wrapWord(""));
    b.setWrapWidth(40);
    b.setWrapIndent(20);
    assertEquals(b, b.wrapText("hello there my friend, squeamish ossifrage"));
    assertEquals("hello there my friend, squeamish" + LS + "                    ossifrage", b.toString());
    assertEquals(b, b.wrapText(""));
    assertEquals(b, b.wrapWord(""));
    assertEquals("hello there my friend, squeamish" + LS + "                    ossifrage", b.toString());
  }

  public void testBorderlinePrefix2() {
    final WrappingStringBuffer b = new WrappingStringBuffer();
    assertEquals(b, b.wrapText(""));
    assertEquals(b, b.wrapWord(""));
    b.setWrapWidth(40);
    b.setWrapIndent(21);
    assertEquals(b, b.wrapText("hello there my friend, squeamish ossifrage"));
    assertEquals(b, b.wrapText(""));
    assertEquals("hello there my friend, squeamish ossifrage", b.toString());
  }

  public void testBorderlinePrefix3() {
    final WrappingStringBuffer b = new WrappingStringBuffer();
    assertEquals(b, b.wrapText(""));
    assertEquals(b, b.wrapWord(""));
    b.setWrapWidth(40);
    b.setWrapIndent(21);
    assertEquals(b, b.wrapText("hello there my friend, squeamish"));
    assertEquals(b, b.wrapWord(" ossifrage"));
    assertEquals("hello there my friend, squeamish ossifrage", b.toString());
    assertEquals(b, b.wrapText(""));
    assertEquals("hello there my friend, squeamish ossifrage", b.toString());
  }

  public void testBorderlinePrefix4() {
    final WrappingStringBuffer b = new WrappingStringBuffer();
    assertEquals(b, b.wrapText(""));
    assertEquals(b, b.wrapWord(""));
    b.setWrapWidth(40);
    b.setWrapIndent(20);
    assertEquals(b, b.wrapText("hello there my friend, squeamish"));
    assertEquals(b, b.wrapWord(" ossifrage"));
    assertEquals("hello there my friend, squeamish" + LS + "                    ossifrage", b.toString());
  }

  public void testBorderlinePrefix5() {
    final WrappingStringBuffer b = new WrappingStringBuffer();
    assertEquals(b, b.wrapText(""));
    assertEquals(b, b.wrapWord(""));
    b.setWrapWidth(40);
    b.setWrapIndent(20);
    assertEquals(b, b.wrapText("hello there my friend, squeamish"));
    assertEquals(b, b.wrapWord("ossifrage"));
    assertEquals("hello there my friend, squeamish" + LS + "                    ossifrage", b.toString());
  }

  public void testException() {
    final WrappingStringBuffer b = new WrappingStringBuffer();
    try {
      b.wrapText("hello\nthere");
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testEnd0() {
    final WrappingStringBuffer b = new WrappingStringBuffer();
    b.setWrapWidth(40);
    b.wrapText("0123456789012345678901234567890123456789");
    b.wrapText("a");
    assertEquals("0123456789012345678901234567890123456789" + LS + "a", b.toString());
  }
}
