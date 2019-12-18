package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class NorwegianTest extends TestCase {

  public void testIntToText() {
    assertEquals("null", Norwegian.SINGLETON.toText(0));
    assertEquals("\u00e9n", Norwegian.SINGLETON.toText(1));
    assertEquals("to", Norwegian.SINGLETON.toText(2));
    assertEquals("tre", Norwegian.SINGLETON.toText(3));
    assertEquals("ti", Norwegian.SINGLETON.toText(10));
    assertEquals("elleve", Norwegian.SINGLETON.toText(11));
    assertEquals("tjue", Norwegian.SINGLETON.toText(20));
    assertEquals("tjue\u00e9n", Norwegian.SINGLETON.toText(21));
    assertEquals("hundre", Norwegian.SINGLETON.toText(100));
    assertEquals("hundre og \u00e9n", Norwegian.SINGLETON.toText(101));
    assertEquals("hundre og tjuefem", Norwegian.SINGLETON.toText(125));
    assertEquals("to hundre", Norwegian.SINGLETON.toText(200));
    assertEquals("to hundre og \u00e9n", Norwegian.SINGLETON.toText(201));
    assertEquals("to hundre og to", Norwegian.SINGLETON.toText(202));
    assertEquals("to hundre og f\u00f8rtitre", Norwegian.SINGLETON.toText(243));
    assertEquals("tusen", Norwegian.SINGLETON.toText(1000));
    assertEquals("to tusen", Norwegian.SINGLETON.toText(2000));
    assertEquals("to tusen fem hundre", Norwegian.SINGLETON.toText(2500));
    assertEquals("fire tusen to hundre og tjuefire", Norwegian.SINGLETON.toText(4224));
  }
}
