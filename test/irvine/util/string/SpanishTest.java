package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SpanishTest extends TestCase {

  public void testIntToText() {
    assertEquals("cero", Spanish.SINGLETON.toText(0));
    assertEquals("uno", Spanish.SINGLETON.toText(1));
    assertEquals("dos", Spanish.SINGLETON.toText(2));
    assertEquals("veintinueve", Spanish.SINGLETON.toText(29));
    assertEquals("treinta", Spanish.SINGLETON.toText(30));
    assertEquals("treinta y tres", Spanish.SINGLETON.toText(33));
    assertEquals("cuarenta y dos", Spanish.SINGLETON.toText(42));
    assertEquals("cien", Spanish.SINGLETON.toText(100));
    assertEquals("ciento uno", Spanish.SINGLETON.toText(101));
    assertEquals("doscientos once", Spanish.SINGLETON.toText(211));
    assertEquals("doscientos setenta y seis", Spanish.SINGLETON.toText(276));
    assertEquals("quinientos", Spanish.SINGLETON.toText(500));
    assertEquals("mil", Spanish.SINGLETON.toText(1000));
    assertEquals("mil once", Spanish.SINGLETON.toText(1011));
    assertEquals("mil ciento once", Spanish.SINGLETON.toText(1111));
    assertEquals("dos mil", Spanish.SINGLETON.toText(2000));
  }
}
