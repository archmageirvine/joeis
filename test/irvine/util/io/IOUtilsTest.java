package irvine.util.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Len Trigg
 * @author Sean A. Irvine
 */
public class IOUtilsTest extends TestCase {

  private static final String STRING = "yollywock";

  private static final byte[] BYTES = STRING.getBytes();

  private static final byte[] EMPTY = new byte[0];

  public void testEmpty() throws IOException {
    checkRealAll(EMPTY);
  }

  public void testString() throws IOException {
    checkRealAll(BYTES);
  }

  public void checkRealAll(final byte[] s) throws IOException {
    try (final InputStream in = new ByteArrayInputStream(s)) {
      final String res = IOUtils.readAll(in);
      final byte[] bres = res.getBytes();
      assertEquals(s.length, bres.length);
      for (int i = 0; i < s.length; ++i) {
        assertEquals(s[i], bres[i]);
      }
    }
  }

  public void testReadAllReader() throws IOException {
    try (final Reader in = new InputStreamReader(new ByteArrayInputStream(new byte[] {3, 4}))) {
      final String res = IOUtils.readAll(in);
      final byte[] bres = res.getBytes();
      assertEquals(2, bres.length);
      assertEquals(3, bres[0]);
      assertEquals(4, bres[1]);
    }
  }

  private static class MyStream extends InputStreamReader {
    MyStream(final InputStream is) {
      super(is);
    }
    @Override
    public int read(final char[] c) {
      return 0;
    }
  }

  public void testReadAllReaderWithZeroReturn() {
    try (final Reader in = new MyStream(new ByteArrayInputStream(new byte[2]))) {
      IOUtils.readAll(in);
      fail();
    } catch (final IOException e) {
      assertEquals("Read was 0 bytes", e.getMessage());
    }
  }

  public void testDecodeEncodeUTF8() {
    final String a = "some text with % and // and $? characters";
    assertEquals(a, IOUtils.decodeUTF8(IOUtils.encodeUTF8(a)));
  }

  public void testGetExtension() {
    assertNull(IOUtils.getExtension(null));
    assertEquals("", IOUtils.getExtension(new File("hi")));
    assertEquals("txt", IOUtils.getExtension(new File("hi.txt")));
    assertEquals("txt", IOUtils.getExtension(new File("hi.TXT")));
  }

  public void testDeleteAllBad() {
    assertTrue(IOUtils.deleteAll(new File("there-is-no-file-called-this-i-hope")));
  }

  public void testAscii() throws IOException {
    try (final ByteArrayInputStream is = new ByteArrayInputStream(new byte[] {'h', 'e', 'l', 'l', 'o', ' ', '~', '\n'})) {
      assertEquals(-1, IOUtils.isNonAscii(is));
    }
    try (final ByteArrayInputStream is = new ByteArrayInputStream(new byte[] {'h', 'e', 'l', 0, 'o', ' ', '~', '\n'})) {
      assertEquals(0, IOUtils.isNonAscii(is));
    }
    try (final ByteArrayInputStream is = new ByteArrayInputStream(new byte[] {'h', 'e', 'l', '~' + 1, 'o', ' ', '~', '\n'})) {
      assertEquals(127, IOUtils.isNonAscii(is));
    }
  }

  public void testWriteInt() throws IOException {
    final ByteArrayOutputStream bos = new ByteArrayOutputStream();
    IOUtils.writeInt(bos, 0x12345678);
    bos.flush();
    final byte[] actual = bos.toByteArray();
    assertEquals(4, actual.length);
    assertEquals(0x78, actual[0]);
    assertEquals(0x56, actual[1]);
    assertEquals(0x34, actual[2]);
    assertEquals(0x12, actual[3]);
  }

  public void testWriteLong() throws IOException {
    final ByteArrayOutputStream bos = new ByteArrayOutputStream();
    IOUtils.writeLong(bos, 0x123456789ABCDEF0L);
    bos.flush();
    final byte[] actual = bos.toByteArray();
    assertEquals(8, actual.length);
    assertEquals((byte) 0xF0, actual[0]);
    assertEquals((byte) 0xDE, actual[1]);
    assertEquals((byte) 0xBC, actual[2]);
    assertEquals((byte) 0x9A, actual[3]);
    assertEquals(0x78, actual[4]);
    assertEquals(0x56, actual[5]);
    assertEquals(0x34, actual[6]);
    assertEquals(0x12, actual[7]);
  }
}

