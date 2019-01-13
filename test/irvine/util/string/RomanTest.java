package irvine.util.string;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class RomanTest extends TestCase {

  public void testRomanToInt() {
    assertEquals(0, Roman.parse(""));
    assertEquals(1, Roman.parse("I"));
    assertEquals(1, Roman.parse("i"));
    assertEquals(2, Roman.parse("iI"));
    assertEquals(3, Roman.parse("III"));
    assertEquals(4, Roman.parse("IIII"));
    assertEquals(4, Roman.parse("IV"));
    assertEquals(5, Roman.parse("IIIII"));
    assertEquals(5, Roman.parse("V"));
    assertEquals(6, Roman.parse("VI"));
    assertEquals(7, Roman.parse("VII"));
    assertEquals(8, Roman.parse("VIII"));
    assertEquals(9, Roman.parse("IX"));
    assertEquals(10, Roman.parse("X"));
    assertEquals(10, Roman.parse("VV"));
    assertEquals(15, Roman.parse("XV"));
    assertEquals(16, Roman.parse("XVI"));
    assertEquals(50, Roman.parse("L"));
    assertEquals(100, Roman.parse("C"));
    assertEquals(500, Roman.parse("D"));
    assertEquals(1000, Roman.parse("M"));
    assertEquals(904, Roman.parse("CMIV"));
    assertEquals(4873, Roman.parse("MMMMDCCCLXXIII"));
    try {
      Roman.parse("MK");
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testIntToRoman() {
    assertEquals("I", Roman.roman(1));
    assertEquals("II", Roman.roman(2));
    assertEquals("III", Roman.roman(3));
    assertEquals("IV", Roman.roman(4));
    assertEquals("V", Roman.roman(5));
    assertEquals("VI", Roman.roman(6));
    assertEquals("VII", Roman.roman(7));
    assertEquals("VIII", Roman.roman(8));
    assertEquals("IX", Roman.roman(9));
    assertEquals("X", Roman.roman(10));
    assertEquals("XX", Roman.roman(20));
    assertEquals("XXV", Roman.roman(25));
    assertEquals("L", Roman.roman(50));
    assertEquals("C", Roman.roman(100));
    assertEquals("D", Roman.roman(500));
    assertEquals("MMMMDCCCLXXIII", Roman.roman(4873));
  }
}
