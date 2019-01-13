package irvine.util.io;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class MappingInputStreamTest extends AbstractFilterInputStreamTest {

  @Override
  public InputStream getInputStream(final InputStream s) {
    return new MappingInputStream(s, MappingInputStream.reducedEnglishMap(), false);
  }

  @Override
  public OutputStream getOutputStream(final OutputStream s) {
    return null;
  }

  @Override
  public byte[] getTestStream() {
    return "A man sAid HELLO".getBytes();
  }

  public void testBadCons() throws IOException {
    try (final ByteArrayInputStream bis = new ByteArrayInputStream(new byte[0])) {
      try {
        new MappingInputStream(bis, null, false);
        fail();
      } catch (final NullPointerException e) {
        // ok
      }
      try {
        new MappingInputStream(bis, new byte[0], false);
        fail();
      } catch (final IllegalArgumentException e) {
        assertEquals("Map not 256 entries long.", e.getMessage());
      }
    }
  }

  public void testSpaceComp() throws IOException {
    try (final ByteArrayInputStream bis = new ByteArrayInputStream("hi ',.,./[]{}+_-=~`!  \t \n\n&$^%@#$%#  the remate".getBytes());
        final MappingInputStream mis = new MappingInputStream(bis, MappingInputStream.reducedEnglishMap(), true)) {
      assertEquals('h', mis.read());
      assertEquals('i', mis.read());
      assertEquals(' ', mis.read());
      assertEquals('t', mis.read());
      assertEquals('h', mis.read());
      assertEquals('e', mis.read());
      assertEquals(' ', mis.read());
      assertEquals('r', mis.read());
      assertEquals('e', mis.read());
      assertEquals(2, mis.skip(2));
      assertEquals('t', mis.read());
      assertEquals('e', mis.read());
      assertEquals(-1, mis.read());
    }
  }

  public void testReadBlock() throws IOException {
    try (final ByteArrayInputStream bis = new ByteArrayInputStream("hi  the remate".getBytes());
        final MappingInputStream mis = new MappingInputStream(bis, MappingInputStream.reducedEnglishMap(), true)) {
      final byte[] z = new byte[10];
      Arrays.fill(z, (byte) 1);
      assertEquals(3, mis.read(z, 3, 3));
      assertEquals(1, z[0]);
      assertEquals(1, z[1]);
      assertEquals(1, z[2]);
      assertEquals('h', z[3]);
      assertEquals('i', z[4]);
      assertEquals(' ', z[5]);
      assertEquals(1, z[6]);
      assertEquals(11, mis.available());
      assertEquals(1, z[7]);
      assertEquals(1, z[8]);
      assertEquals(1, z[9]);
      assertEquals(10, mis.skip(1000));
    }
  }

  public void testReducedMap() {
    final byte[] m = MappingInputStream.reducedEnglishMap();
    assertEquals(256, m.length);
    assertEquals(32, m[0]);
    assertEquals(32, m[255]);
    assertEquals(32, m[64]);
    assertEquals('a', m[65]);
    assertEquals('z', m[90]);
    assertEquals(32, m[91]);
    assertEquals(32, m[32]);
    assertEquals(32, m[47]);
    assertEquals('0', m[48]);
    assertEquals('9', m[57]);
    assertEquals(32, m[58]);
    assertEquals(32, m[96]);
    assertEquals('a', m[97]);
    assertEquals('z', m[122]);
    for (int i = 123; i < m.length; ++i) {
      assertEquals(32, m[i]);
    }
  }
}
