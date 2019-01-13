package irvine.util.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Locale;
import java.util.Random;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class HexadecimalInputStreamTest extends AbstractFilterInputStreamTest {

  @Override
  public InputStream getInputStream(final InputStream s) {
    return new HexadecimalInputStream(s);
  }

  @Override
  public OutputStream getOutputStream(final OutputStream s) {
    return new HexadecimalOutputStream(s);
  }

  @Override
  public byte[] getTestStream() {
    return "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA".getBytes();
  }

  public void testFullGamutUC() throws IOException {
    final byte[] s = new byte[256];
    for (int i = 0; i < s.length; ++i) {
      s[i] = (byte) (255 - i);
    }
    final ByteArrayOutputStream os = new ByteArrayOutputStream();
    try {
      try (final HexadecimalOutputStream bos = new HexadecimalOutputStream(os)) {
        bos.write(s);
      }
    } finally {
      os.close();
    }
    try (final HexadecimalInputStream is = new HexadecimalInputStream(new ByteArrayInputStream(os.toString().toUpperCase(Locale.getDefault()).getBytes()))) {
      for (int i = 0; i < s.length; ++i) {
        assertEquals("i=" + i, s[i], (byte) is.read());
      }
      assertEquals(-1, is.read());
    }
  }

  public void testFullGamut() throws IOException {
    final byte[] s = new byte[256];
    for (int i = 0; i < s.length; ++i) {
      s[i] = (byte) (255 - i);
    }
    final ByteArrayOutputStream os = new ByteArrayOutputStream();
    try {
      try (final HexadecimalOutputStream bos = new HexadecimalOutputStream(os)) {
        bos.write(s);
      }
    } finally {
      os.close();
    }
    try (final HexadecimalInputStream is = new HexadecimalInputStream(new ByteArrayInputStream(os.toByteArray()))) {
      for (int i = 0; i < s.length; ++i) {
        assertEquals("i=" + i, s[i], (byte) is.read());
      }
      assertEquals(-1, is.read());
    }
  }

  public void testFullGamutWithSkip() throws IOException {
    final byte[] s = new byte[256];
    for (int i = 0; i < s.length; ++i) {
      s[i] = (byte) (255 - i);
    }
    final ByteArrayOutputStream os = new ByteArrayOutputStream();
    try {
      try (final HexadecimalOutputStream bos = new HexadecimalOutputStream(os)) {
        bos.write(s);
      }
    } finally {
      os.close();
    }
    try (final HexadecimalInputStream is = new HexadecimalInputStream(new ByteArrayInputStream(os.toByteArray()))) {
      assertEquals(0, is.skip(0));
      assertEquals(0, is.skip(-1));
      assertEquals(259, is.available());
      assertEquals(128, is.skip(128));
      assertEquals(130, is.available());
      for (int i = 128; i < s.length; ++i) {
        assertEquals("i=" + i, s[i], (byte) is.read());
      }
      assertEquals(0, is.available());
      assertEquals(-1, is.read());
      assertEquals(0, is.available());
    }
  }

  public void testBigSkip() throws IOException {
    final byte[] s = new byte[256];
    for (int i = 0; i < s.length; ++i) {
      s[i] = (byte) (255 - i);
    }
    final ByteArrayOutputStream os = new ByteArrayOutputStream();
    try {
      try (final HexadecimalOutputStream bos = new HexadecimalOutputStream(os)) {
        bos.write(s);
      }
    } finally {
      os.close();
    }
    try (final HexadecimalInputStream is = new HexadecimalInputStream(new ByteArrayInputStream(os.toByteArray()))) {
      assertEquals(259, is.available());
      assertEquals(256, is.skip(257));
      assertEquals(0, is.available());
      assertEquals(-1, is.read());
      assertEquals(0, is.available());
    }
  }

  public void testDecode() {
    final Random rnd = new Random();
    for (int j = 0; j < 3; ++j) {
      final byte[] q = new byte[rnd.nextInt(1000)];
      rnd.nextBytes(q);
      final byte[] r = HexadecimalInputStream.decode(HexadecimalOutputStream.encode(q, rnd.nextInt(100) + 1));
      assertEquals(q.length, r.length);
      for (int i = 0; i < q.length; ++i) {
        assertEquals(i + "/" + q.length, q[i], r[i]);
      }
    }
  }

  public void testDecode2() {
    try {
      HexadecimalInputStream.decode("F");
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("java.io.IOException: Last doublet ended after one symbol.", e.getMessage()); // ok
    }
  }

  public void testDecode2b() {
    try {
      HexadecimalInputStream.decode(" \t\n\rF");
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("java.io.IOException: Last doublet ended after one symbol.", e.getMessage()); // ok
    }
  }

  public void testDecode3() {
    try {
      HexadecimalInputStream.decode("EG");
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

  public void testDecode4() {
    try {
      HexadecimalInputStream.decode("E G");
      fail();
    } catch (final IllegalArgumentException e) {
      // ok
    }
  }

}
