package irvine.util.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Random;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Base64InputStreamTest extends AbstractFilterInputStreamTest {

  @Override
  public InputStream getInputStream(final InputStream s) {
    return new Base64InputStream(s);
  }

  @Override
  public OutputStream getOutputStream(final OutputStream s) {
    return new Base64OutputStream(s);
  }

  @Override
  public byte[] getTestStream() {
    return "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAVVVVDSDEFEFDFSDFSDRDGHGJGJ=".getBytes();
  }

  public void testFullGamut() throws IOException {
    final byte[] s = new byte[256];
    for (int i = 0; i < s.length; ++i) {
      s[i] = (byte) (255 - i);
    }
    final ByteArrayOutputStream os = new ByteArrayOutputStream();
    try {
      try (final Base64OutputStream bos = new Base64OutputStream(os)) {
        bos.write(s);
      }
    } finally {
      os.close();
    }
    try (final Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(os.toByteArray()))) {
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
      try (final Base64OutputStream bos = new Base64OutputStream(os)) {
        bos.write(s);
      }
    } finally {
      os.close();
    }
    try (final Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(os.toByteArray()))) {
      assertEquals(0, is.skip(0));
      assertEquals(0, is.skip(-1));
      assertEquals(1, is.available());
      assertEquals(128, is.skip(128));
      assertEquals(1, is.available());
      for (int i = 128; i < s.length; ++i) {
        assertEquals("i=" + i, s[i], (byte) is.read());
      }
      assertEquals(1, is.available());
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
      try (final Base64OutputStream bos = new Base64OutputStream(os)) {
        bos.write(s);
      }
    } finally {
      os.close();
    }
    try (final Base64InputStream is = new Base64InputStream(new ByteArrayInputStream(os.toByteArray()))) {
      assertEquals(1, is.available());
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
      final byte[] r = Base64InputStream.decode(Base64OutputStream.encode(q, rnd.nextInt(100) + 1));
      assertEquals(q.length, r.length);
      for (int i = 0; i < q.length; ++i) {
        assertEquals(i + "/" + q.length, q[i], r[i]);
      }
    }
  }

  public void testDecode2() {
    final Random rnd = new Random();
    for (int j = 0; j < 3; ++j) {
      final byte[] q = new byte[rnd.nextInt(1000)];
      rnd.nextBytes(q);
      final byte[] r = Base64InputStream.decode(">" + Base64OutputStream.encode(q, rnd.nextInt(100) + 1));
      assertEquals(q.length, r.length);
      for (int i = 0; i < q.length; ++i) {
        assertEquals(i + "/" + q.length, q[i], r[i]);
      }
    }
  }

}
