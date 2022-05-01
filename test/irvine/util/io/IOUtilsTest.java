package irvine.util.io;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.net.MalformedURLException;
import java.net.URL;

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
    testReadAll(EMPTY);
  }

  public void testString() throws IOException {
    testReadAll(BYTES);
  }

  public void testReadAll(final byte[] s) throws IOException {
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

  public void testReadDataBogusIn() {
    try {
      IOUtils.readData((URL) null);
      fail("Accepted null");
    } catch (final IOException e) {
      fail("IO");
    } catch (final NullPointerException e) {
      // okay
    }
    try {
      IOUtils.readData((InputStream) null);
      fail("Accepted null");
    } catch (final IOException e) {
      fail("IO");
    } catch (final NullPointerException e) {
      // okay
    }
  }


  public void testReadData() {
    final String s = "Hobbits live in small holes in the ground";
    try {
      final byte[] r = IOUtils.readData(new ByteArrayInputStream(s.getBytes()));
      assertTrue(r != null);
      assertEquals(s, new String(r));
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }


  public void testReadDataEmpty() {
    final String s = "";
    try {
      final byte[] r = IOUtils.readData(new ByteArrayInputStream(s.getBytes()));
      assertTrue(r != null);
      assertEquals(s, new String(r));
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }


  public void testReadDataZeroLength() {
    try {
      final byte[] r = IOUtils.readData(new ByteArrayInputStream(new byte[0]));
      assertTrue(r != null);
      assertEquals(0, r.length);
    } catch (final IOException e) {
      fail("IO: " + e.getMessage());
    }
  }


  public void testReadDataViaURL() throws IOException {
    final File f = File.createTempFile("junit", "test");
    f.deleteOnExit();
    try {
      try (FileOutputStream os = new FileOutputStream(f)) {
        os.write('0');
      }
      final byte[] r = IOUtils.readData(f.toURI().toURL());
      assertTrue(r != null);
      assertEquals("0", new String(r));
      assertEquals("0", IOUtils.readAll(f.toURI().toURL()));
    } finally {
      assertTrue(f.delete());
    }
  }

  @SuppressWarnings("deprecation")
  public void testDecodeUTF8() {
    final boolean linux = "Linux".equals(System.getProperty("os.name"));
    try {
      for (char c = 0; c < 1024; ++c) {
        if (c != 0 && c != '+' && (linux || c != ' ')) { // special characters
          // windows can't handle ' ' as a file name, wants to make it a directory
          final File f = new File(String.valueOf(c));
          final String res = IOUtils.decodeUTF8(f.toURI().toURL().toString());
          assertEquals("incorrect url decoding: " + c + "(" + ((int) c) + "): ", f.toURL().toString(), res);
        }
      }
    } catch (final MalformedURLException murle) {
      fail(murle.getMessage());
    }
  }


  public void testDecodeEncodeUTF8() {
    final String a = "some text with % and // and $? characters";
    assertEquals(a, IOUtils.decodeUTF8(IOUtils.encodeUTF8(a)));
  }

  public void testGetURLFile() throws Exception {
    final String name = "asdf%5CStu2.xml";
    final File f = new File(name).getCanonicalFile();
    final URL url = IOUtils.getURL(f);
    final File f2 = new File(url.toURI());
    if (!f.equals(f2)) {
      System.out.println("Fails on 1.6beta JVM (regression bug with 1.5)");
    }
    //    assertEquals("Fails on 1.6beta JVM (regression bug with 1.5)", f, f2);
  }


  public void testGetURL() throws Exception {
    final File f = File.createTempFile("junit", "test");
    f.deleteOnExit();
    final URL url = IOUtils.getURLFromAny(f.toString());
    assertEquals(f.toURI().toURL().toString(), url.toString());
    assertTrue(f.delete());

    URL url2 = IOUtils.getURLFromAny(url.toString());
    assertEquals(url, url2);

    url2 = IOUtils.getURL(url.toString());
    assertEquals(url, url2);

    url2 = IOUtils.getURL(null, url.toString());
    assertEquals(url, url2);

    url2 = IOUtils.getURL(f.toURI());
    assertEquals(url, url2);
  }

  public void testRegisteredJavaProtocol() throws Exception {
    final URL u = IOUtils.getURL("java:irvine/util/io/IOUtilsTest.class");
    assertNotNull(u);
    assertEquals("irvine/util/io/IOUtilsTest.class", u.getPath());
    assertEquals("java", u.getProtocol());
  }

  public void testHandlersEnabled() {
    final CustomURLStreamHandlerFactory handler = CustomURLStreamHandlerFactory.getInstance();
    assertNotNull(handler.createURLStreamHandler("java"));
    assertNull(handler.createURLStreamHandler("fart"));
  }

  public void testMalformed() {
    try {
      IOUtils.getURL(null, ":::");
      fail();
    } catch (final MalformedURLException e) {
      assertEquals("Malformed URI: :::", e.getMessage());
    }
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

