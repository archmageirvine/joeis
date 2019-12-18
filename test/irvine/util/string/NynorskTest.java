package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class NynorskTest extends TestCase {

  public void testIntToText() {
    assertEquals("null", Nynorsk.toNorwegian(0));
    assertEquals("\u00e9in", Nynorsk.toNorwegian(1));
    assertEquals("to", Nynorsk.toNorwegian(2));
    assertEquals("tre", Nynorsk.toNorwegian(3));
    assertEquals("ti", Nynorsk.toNorwegian(10));
    assertEquals("elleve", Nynorsk.toNorwegian(11));
    assertEquals("tjue", Nynorsk.toNorwegian(20));
    assertEquals("tjue\u00e9in", Nynorsk.toNorwegian(21));
    assertEquals("hundre", Nynorsk.toNorwegian(100));
    assertEquals("hundre og \u00e9in", Nynorsk.toNorwegian(101));
    assertEquals("hundre og tjuefem", Nynorsk.toNorwegian(125));
    assertEquals("to hundre", Nynorsk.toNorwegian(200));
    assertEquals("to hundre og \u00e9in", Nynorsk.toNorwegian(201));
    assertEquals("to hundre og to", Nynorsk.toNorwegian(202));
    assertEquals("to hundre og f\u00f8rtitre", Nynorsk.toNorwegian(243));
    assertEquals("tusen", Nynorsk.toNorwegian(1000));
    assertEquals("to tusen", Nynorsk.toNorwegian(2000));
    assertEquals("to tusen fem hundre", Nynorsk.toNorwegian(2500));
    assertEquals("fire tusen to hundre og tjuefire", Nynorsk.toNorwegian(4224));
  }
}
