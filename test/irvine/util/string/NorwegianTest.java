package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class NorwegianTest extends TestCase {

  public void testIntToText() {
    assertEquals("null", Norwegian.toNorwegian(0));
    assertEquals("\u00e9n", Norwegian.toNorwegian(1));
    assertEquals("to", Norwegian.toNorwegian(2));
    assertEquals("tre", Norwegian.toNorwegian(3));
    assertEquals("ti", Norwegian.toNorwegian(10));
    assertEquals("elleve", Norwegian.toNorwegian(11));
    assertEquals("tjue", Norwegian.toNorwegian(20));
    assertEquals("tjue\u00e9n", Norwegian.toNorwegian(21));
    assertEquals("hundre", Norwegian.toNorwegian(100));
    assertEquals("hundre og \u00e9n", Norwegian.toNorwegian(101));
    assertEquals("hundre og tjuefem", Norwegian.toNorwegian(125));
    assertEquals("to hundre", Norwegian.toNorwegian(200));
    assertEquals("to hundre og \u00e9n", Norwegian.toNorwegian(201));
    assertEquals("to hundre og to", Norwegian.toNorwegian(202));
    assertEquals("to hundre og f\u00f8rtitre", Norwegian.toNorwegian(243));
    assertEquals("tusen", Norwegian.toNorwegian(1000));
    assertEquals("to tusen", Norwegian.toNorwegian(2000));
    assertEquals("to tusen fem hundre", Norwegian.toNorwegian(2500));
    assertEquals("fire tusen to hundre og tjuefire", Norwegian.toNorwegian(4224));
  }
}
