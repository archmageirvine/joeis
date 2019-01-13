package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class HtmlEscapeFilterTest extends TestCase {

  public void testBoundaryCases() {
    assertEquals(null, HtmlEscapeFilter.replace(null));
    assertEquals("", HtmlEscapeFilter.replace(""));
    assertEquals(" ", HtmlEscapeFilter.replace(" "));
    assertEquals("  ", HtmlEscapeFilter.replace("  "));
    assertEquals("@", HtmlEscapeFilter.replace("@"));
    assertEquals("A", HtmlEscapeFilter.replace("A"));
    assertEquals("&", HtmlEscapeFilter.replace("&"));
    assertEquals("&;", HtmlEscapeFilter.replace("&;"));
    assertEquals("&Q;", HtmlEscapeFilter.replace("&Q;"));
    assertEquals("<", HtmlEscapeFilter.replace("&lt;"));
    assertEquals(">", HtmlEscapeFilter.replace("&gt;"));
    assertEquals("&gt", HtmlEscapeFilter.replace("&gt"));
    assertEquals("X>Y", HtmlEscapeFilter.replace("X&gt;Y"));
    assertEquals("X&xxzzy;Y", HtmlEscapeFilter.replace("X&xxzzy;Y"));
    assertEquals("&", HtmlEscapeFilter.replace("&amp;"));
    assertEquals("Q&", HtmlEscapeFilter.replace("Q&amp;"));
    assertEquals("\"", HtmlEscapeFilter.replace("&quot;"));
    assertEquals("&<", HtmlEscapeFilter.replace("&amp;&lt;"));
    assertEquals("&<", HtmlEscapeFilter.replace("&amp;<"));
    assertEquals("&<", HtmlEscapeFilter.replace("&&lt;"));
    assertEquals(">>", HtmlEscapeFilter.replace("&gt;&gt;"));
    assertEquals("Hello >", HtmlEscapeFilter.replace("Hello &gt;"));
    assertEquals("Simon & Garfunkel", HtmlEscapeFilter.replace("Simon &amp; Garfunkel"));
    assertEquals("\u00E9", HtmlEscapeFilter.replace("&eacute;"));
    assertEquals(62, HtmlEscapeFilter.replace("ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789").length());
  }

  public void testNumerics() {
    assertEquals(" ", HtmlEscapeFilter.replace("&#32;"));
    assertEquals("A", HtmlEscapeFilter.replace("&#65;"));
    assertEquals("e", HtmlEscapeFilter.replace("&#101;"));
    assertEquals("\u00DF", HtmlEscapeFilter.replace("&#223;"));
    assertEquals("XeY", HtmlEscapeFilter.replace("X&#101;Y"));
    assertEquals("&e&", HtmlEscapeFilter.replace("&&#101;&"));
    assertEquals("&e;", HtmlEscapeFilter.replace("&&#101;;"));
    assertEquals("&#", HtmlEscapeFilter.replace("&#"));
    assertEquals("&#;", HtmlEscapeFilter.replace("&#;"));
    assertEquals("&#A;", HtmlEscapeFilter.replace("&#A;"));
    assertEquals("&#700;", HtmlEscapeFilter.replace("&#700;"));
  }

  public void testMicrosoftSpecials() {
    assertEquals("OE lig", "\u0152", HtmlEscapeFilter.replace("&#140;"));
    assertEquals("TM symbol", "\u2122", HtmlEscapeFilter.replace("&#153;"));
    assertEquals("invalid", "\u0081", HtmlEscapeFilter.replace("&#129;"));
    assertEquals("invalid-2", "\u0080", HtmlEscapeFilter.replace("&#128;"));
    assertEquals("Y uml", "\u0178", HtmlEscapeFilter.replace("&#159;"));
  }
}
