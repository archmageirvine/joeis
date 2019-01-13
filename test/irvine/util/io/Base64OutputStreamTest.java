package irvine.util.io;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Arrays;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class Base64OutputStreamTest extends AbstractFilterOutputStreamTest {

  private static final String LS = System.lineSeparator();

  @Override
  public OutputStream getOutputStream(final OutputStream s) {
    return new Base64OutputStream(s);
  }

  @Override
  public byte[] getTestStream() {
    return new byte[0];
  }

  public void testBadCons() {
    try {
      new Base64OutputStream(new ByteArrayOutputStream(), 0);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Bad cols.", e.getMessage());
    }
    try {
      new Base64OutputStream(new ByteArrayOutputStream(), -1);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Bad cols.", e.getMessage());
    }
  }

  public void encode(final byte[] source, final int w, final String expect) {
    final String actual = Base64OutputStream.encode(source, w);
    assertEquals(expect, expect, actual);
  }

  public void test() {
    encode(new byte[0], 1, LS);
    encode(new byte[0], 100, LS);
    encode(new byte[] {0}, 100, "AA==" + LS);
    encode(new byte[] {1}, 100, "AQ==" + LS);
    encode(new byte[] {65}, 100, "QQ==" + LS);
    encode(new byte[] {-1}, 100, "/w==" + LS);
    encode(new byte[] {127}, 100, "fw==" + LS);
    encode(new byte[] {-127}, 100, "gQ==" + LS);
    encode(new byte[30], 100, "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + LS);
    encode(new byte[] {-42, 42}, 100, "1io=" + LS);
    final byte[] s = new byte[29];
    Arrays.fill(s, (byte) 17);
    encode(s, 100, "ERERERERERERERERERERERERERERERERERERERE=" + LS);
    encode(s, 17, "ERERERERERERERERE" + LS + "RERERERERERERERER" + LS + "ERERE=" + LS);
    assertEquals(76, Base64OutputStream.DEFAULT_COLS);
  }

  public void testDefault() throws IOException {
    final ByteArrayOutputStream os = new ByteArrayOutputStream();
    try {
      final byte[] s = new byte[100];
      try (final Base64OutputStream bos = new Base64OutputStream(os)) {
        bos.write(s);
      }
    } finally {
      os.close();
    }
    assertEquals("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA" + LS + "AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA==" + LS, os.toString());
  }

  public void testOffset() throws IOException {
    final ByteArrayOutputStream os = new ByteArrayOutputStream();
    try {
      final byte[] s = new byte[100];
      for (int i = 0; i < s.length; ++i) {
        s[i] = (byte) i;
      }
      try (final Base64OutputStream bos = new Base64OutputStream(os)) {
        bos.write(s, 3, 93);
      }
    } finally {
      os.close();
    }
    assertEquals("AwQFBgcICQoLDA0ODxAREhMUFRYXGBkaGxwdHh8gISIjJCUmJygpKissLS4vMDEyMzQ1Njc4OTo7" + LS + "PD0+P0BBQkNERUZHSElKS0xNTk9QUVJTVFVWV1hZWltcXV5f" + LS, os.toString());
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
    assertEquals("//79/Pv6+fj39vX08/Lx8O/u7ezr6uno5+bl5OPi4eDf3t3c29rZ2NfW1dTT0tHQz87NzMvKycjH" + LS + "xsXEw8LBwL++vby7urm4t7a1tLOysbCvrq2sq6qpqKempaSjoqGgn56dnJuamZiXlpWUk5KRkI+O" + LS + "jYyLiomIh4aFhIOCgYB/fn18e3p5eHd2dXRzcnFwb25tbGtqaWhnZmVkY2JhYF9eXVxbWllYV1ZV" + LS + "VFNSUVBPTk1MS0pJSEdGRURDQkFAPz49PDs6OTg3NjU0MzIxMC8uLSwrKikoJyYlJCMiISAfHh0c" + LS + "GxoZGBcWFRQTEhEQDw4NDAsKCQgHBgUEAwIBAA==" + LS, os.toString());
  }

  public void testFullGamut2() throws IOException {
    final byte[] s = new byte[256];
    for (int i = 0; i < s.length; ++i) {
      s[i] = (byte) i;
    }
    final ByteArrayOutputStream os = new ByteArrayOutputStream();
    try {
      try (final Base64OutputStream bos = new Base64OutputStream(os, 48)) {
        bos.write(s);
      }
    } finally {
      os.close();
    }
    assertEquals("AAECAwQFBgcICQoLDA0ODxAREhMUFRYXGBkaGxwdHh8gISIj" + LS + "JCUmJygpKissLS4vMDEyMzQ1Njc4OTo7PD0+P0BBQkNERUZH" + LS + "SElKS0xNTk9QUVJTVFVWV1hZWltcXV5fYGFiY2RlZmdoaWpr" + LS + "bG1ub3BxcnN0dXZ3eHl6e3x9fn+AgYKDhIWGh4iJiouMjY6P" + LS + "kJGSk5SVlpeYmZqbnJ2en6ChoqOkpaanqKmqq6ytrq+wsbKz" + LS + "tLW2t7i5uru8vb6/wMHCw8TFxsfIycrLzM3Oz9DR0tPU1dbX" + LS + "2Nna29zd3t/g4eLj5OXm5+jp6uvs7e7v8PHy8/T19vf4+fr7" + LS + "/P3+/w==" + LS, os.toString());
  }

  public void testAB() {
    assertEquals("QUJDREVGR0hJSktMTU5PUFFSU1RVVldYWVo=" + LS, Base64OutputStream.encode("ABCDEFGHIJKLMNOPQRSTUVWXYZ".getBytes(), Base64OutputStream.DEFAULT_COLS));
  }

}
