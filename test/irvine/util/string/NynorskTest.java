package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class NynorskTest extends TestCase {

  public void testIntToText() {
    assertEquals("null", Nynorsk.SINGLETON.toText(0));
    assertEquals("\u00e9in", Nynorsk.SINGLETON.toText(1));
    assertEquals("to", Nynorsk.SINGLETON.toText(2));
    assertEquals("tre", Nynorsk.SINGLETON.toText(3));
    assertEquals("ti", Nynorsk.SINGLETON.toText(10));
    assertEquals("elleve", Nynorsk.SINGLETON.toText(11));
    assertEquals("tjue", Nynorsk.SINGLETON.toText(20));
    assertEquals("tjue\u00e9in", Nynorsk.SINGLETON.toText(21));
    assertEquals("hundre", Nynorsk.SINGLETON.toText(100));
    assertEquals("hundre og \u00e9in", Nynorsk.SINGLETON.toText(101));
    assertEquals("hundre og tjuefem", Nynorsk.SINGLETON.toText(125));
    assertEquals("to hundre", Nynorsk.SINGLETON.toText(200));
    assertEquals("to hundre og \u00e9in", Nynorsk.SINGLETON.toText(201));
    assertEquals("to hundre og to", Nynorsk.SINGLETON.toText(202));
    assertEquals("to hundre og f\u00f8rtitre", Nynorsk.SINGLETON.toText(243));
    assertEquals("tusen", Nynorsk.SINGLETON.toText(1000));
    assertEquals("to tusen", Nynorsk.SINGLETON.toText(2000));
    assertEquals("to tusen fem hundre", Nynorsk.SINGLETON.toText(2500));
    assertEquals("fire tusen to hundre og tjuefire", Nynorsk.SINGLETON.toText(4224));
  }
}
