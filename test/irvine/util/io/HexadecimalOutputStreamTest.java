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
public class HexadecimalOutputStreamTest extends AbstractFilterOutputStreamTest {

  /** Local new line convention */
  private static final String LS = System.lineSeparator();


  @Override
  public OutputStream getOutputStream(final OutputStream s) {
    return new HexadecimalOutputStream(s);
  }


  @Override
  public byte[] getTestStream() {
    return new byte[0];
  }

  public void testBadCons() {
    try {
      new HexadecimalOutputStream(new ByteArrayOutputStream(), 0);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Bad cols.", e.getMessage());
    }
    try {
      new HexadecimalOutputStream(new ByteArrayOutputStream(), -1);
      fail();
    } catch (final IllegalArgumentException e) {
      assertEquals("Bad cols.", e.getMessage());
    }
  }

  public void encode(final byte[] source, final int w, final String expect) {
    final String actual = HexadecimalOutputStream.encode(source, w);
    assertEquals(expect, expect, actual);
  }

  public void test() {
    encode(new byte[0], 1, LS);
    encode(new byte[0], 100, LS);
    for (int i = 0; i < 256; ++i) {
      if (i < 16) {
        encode(new byte[] {(byte) i}, 100, "0" + Integer.toHexString(i) + LS);
      } else {
        encode(new byte[] {(byte) i}, 100, Integer.toHexString(i) + LS);
      }
    }
    encode(new byte[30], 100, "000000000000000000000000000000000000000000000000000000000000" + LS);
    final byte[] s = new byte[29];
    Arrays.fill(s, (byte) 17);
    encode(s, 17, "11111111111111111" + LS + "11111111111111111" + LS + "11111111111111111" + LS + "1111111" + LS);
    assertEquals(80, HexadecimalOutputStream.DEFAULT_COLS);
  }

  public void testDefault() throws IOException {
    final ByteArrayOutputStream os = new ByteArrayOutputStream();
    try {
      final byte[] s = new byte[100];
      try (final HexadecimalOutputStream bos = new HexadecimalOutputStream(os)) {
        bos.write(s);
      }
    } finally {
      os.close();
    }
    assertEquals("00000000000000000000000000000000000000000000000000000000000000000000000000000000" + LS + "00000000000000000000000000000000000000000000000000000000000000000000000000000000" + LS + "0000000000000000000000000000000000000000" + LS, os.toString());
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
    assertEquals("fffefdfcfbfaf9f8f7f6f5f4f3f2f1f0efeeedecebeae9e8e7e6e5e4e3e2e1e0dfdedddcdbdad9d8" + LS + "d7d6d5d4d3d2d1d0cfcecdcccbcac9c8c7c6c5c4c3c2c1c0bfbebdbcbbbab9b8b7b6b5b4b3b2b1b0" + LS + "afaeadacabaaa9a8a7a6a5a4a3a2a1a09f9e9d9c9b9a999897969594939291908f8e8d8c8b8a8988" + LS + "87868584838281807f7e7d7c7b7a797877767574737271706f6e6d6c6b6a69686766656463626160" + LS + "5f5e5d5c5b5a595857565554535251504f4e4d4c4b4a494847464544434241403f3e3d3c3b3a3938" + LS + "37363534333231302f2e2d2c2b2a292827262524232221201f1e1d1c1b1a19181716151413121110" + LS + "0f0e0d0c0b0a09080706050403020100" + LS, os.toString());
  }

  public void testOffset() throws IOException {
    final ByteArrayOutputStream os = new ByteArrayOutputStream();
    try {
      final byte[] s = new byte[100];
      for (int i = 0; i < s.length; ++i) {
        s[i] = (byte) i;
      }
      try (final HexadecimalOutputStream bos = new HexadecimalOutputStream(os)) {
        bos.write(s, 3, 93);
      }
    } finally {
      os.close();
    }
    assertEquals("030405060708090a0b0c0d0e0f101112131415161718191a1b1c1d1e1f202122232425262728292a" + LS + "2b2c2d2e2f303132333435363738393a3b3c3d3e3f404142434445464748494a4b4c4d4e4f505152" + LS + "535455565758595a5b5c5d5e5f" + LS, os.toString());
  }

}
