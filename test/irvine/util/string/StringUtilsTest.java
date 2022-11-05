package irvine.util.string;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import junit.framework.TestCase;

/**
 * Test the corresponding class.
 * @author Sean A. Irvine
 */
public class StringUtilsTest extends TestCase {

  public void testIsHexadecimal() {
    assertTrue(StringUtils.isHexadecimal("0xA"));
    assertTrue(StringUtils.isHexadecimal("0xa"));
    assertTrue(StringUtils.isHexadecimal("0xaL"));
    assertTrue(StringUtils.isHexadecimal("0xAl"));
    assertTrue(StringUtils.isHexadecimal("0x0"));
    assertTrue(StringUtils.isHexadecimal("0XA"));
    assertTrue(StringUtils.isHexadecimal("0Xdeadbeef"));
    assertTrue(StringUtils.isHexadecimal("0x0123423737857236427438668234258646234286348325438245"));
    assertFalse(StringUtils.isHexadecimal("A"));
    assertFalse(StringUtils.isHexadecimal("DEADBEEF"));
    assertFalse(StringUtils.isHexadecimal("0X"));
    assertFalse(StringUtils.isHexadecimal("0x"));
    assertFalse(StringUtils.isHexadecimal("xA"));
    assertFalse(StringUtils.isHexadecimal("A23L"));
  }
  
  public void testMessage() {
    final PrintStream out = System.out;
    try {
      final ByteArrayOutputStream bos = new ByteArrayOutputStream();
      try (final PrintStream ps = new PrintStream(bos)) {
        System.setOut(ps);
        StringUtils.message("hi");
      }
      final String s = bos.toString();
      assertTrue(s, s.endsWith(" hi" + System.lineSeparator()));
      assertTrue(s.startsWith("20"));
    } finally {
      System.setOut(out);
    }
  }

  public void testWarning() {
    final PrintStream err = System.err;
    try {
      final ByteArrayOutputStream bos = new ByteArrayOutputStream();
      try (final PrintStream ps = new PrintStream(bos)) {
        System.setErr(ps);
        StringUtils.warning("hi");
      }
      final String s = bos.toString();
      assertTrue(s, s.endsWith(" hi" + System.lineSeparator()));
      assertTrue(s.startsWith("20"));
    } finally {
      System.setErr(err);
    }
  }

  public void testSyndrome() {
    assertEquals(0, StringUtils.syndrome(""));
    assertEquals(0, StringUtils.syndrome(" "));
    assertEquals(1, StringUtils.syndrome("a"));
    assertEquals(1, StringUtils.syndrome("A"));
    assertEquals(2, StringUtils.syndrome("B"));
    assertEquals(3, StringUtils.syndrome("ba"));
    assertEquals(1 << 25, StringUtils.syndrome("z"));
    assertEquals((1 << 26) - 1, StringUtils.syndrome("abcdefghijklmnopqrstuvwxyz"));
  }

  public void testIs26Upper() {
    assertTrue(StringUtils.is26Upper(""));
    assertTrue(StringUtils.is26Upper("A"));
    assertTrue(StringUtils.is26Upper("AZ"));
    assertTrue(StringUtils.is26Upper("ZYXWUVCBTHSYXA"));
    assertFalse(StringUtils.is26Upper(" "));
    assertFalse(StringUtils.is26Upper("a"));
    assertFalse(StringUtils.is26Upper("AaA"));
    assertFalse(StringUtils.is26Upper("'E"));
    assertFalse(StringUtils.is26Upper("E?"));
  }

  public void testRep() {
    assertEquals("", StringUtils.rep('#', 0));
    assertEquals("#", StringUtils.rep('#', 1));
    assertEquals("#####", StringUtils.rep('#', 5));
  }
}
