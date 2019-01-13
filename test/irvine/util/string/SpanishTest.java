package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class SpanishTest extends TestCase {

  public void testIntToText() {
    assertEquals("cero", Spanish.toSpanish(0));
    assertEquals("uno", Spanish.toSpanish(1));
    assertEquals("dos", Spanish.toSpanish(2));
    assertEquals("veintinueve", Spanish.toSpanish(29));
    assertEquals("treinta", Spanish.toSpanish(30));
    assertEquals("treinta y tres", Spanish.toSpanish(33));
    assertEquals("cuarenta y dos", Spanish.toSpanish(42));
    assertEquals("cien", Spanish.toSpanish(100));
    assertEquals("ciento uno", Spanish.toSpanish(101));
    assertEquals("doscientos once", Spanish.toSpanish(211));
    assertEquals("doscientos setenta y seis", Spanish.toSpanish(276));
    assertEquals("quinientos", Spanish.toSpanish(500));
    assertEquals("mil", Spanish.toSpanish(1000));
    assertEquals("mil once", Spanish.toSpanish(1011));
    assertEquals("mil ciento once", Spanish.toSpanish(1111));
    assertEquals("dos mil", Spanish.toSpanish(2000));
  }
}
