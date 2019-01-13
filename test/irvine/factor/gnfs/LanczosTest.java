package irvine.factor.gnfs;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.Arrays;

import irvine.util.io.IOUtils;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class LanczosTest extends TestCase {

  public void testMultiplyVectorMat() {
    final Lanczos lm = new Lanczos(100, 100, System.out, false);
    final long[] m = new long[64];
    final long[] v1 = new long[100];
    final long[] v2 = new long[100];
    for (int i = 0; i < 64; ++i) {
      m[i] = (long) i << i;
    }
    for (int i = 0; i < 100; ++i) {
      v1[i] = i * i * i * i * i * i;
    }
    lm.multiplyVectorMatrix(v1, m, v2);
    assertEquals(0x0000000000000000L, v2[0]);
    assertEquals(0x8000000000000000L, v2[1]);
    assertEquals(0x7200000000000000L, v2[2]);
    assertEquals(0xDF80000000000000L, v2[3]);
    assertEquals(0x0198000000000000L, v2[4]);
    assertEquals(0x5F30000000000000L, v2[5]);
    assertEquals(0x7840000000000000L, v2[6]);
    assertEquals(0x7505800000000000L, v2[7]);
    assertEquals(0x0005A00000000000L, v2[8]);
    assertEquals(0xEEDAC00000000000L, v2[9]);
    assertEquals(0x7FF9600000000000L, v2[10]);
    assertEquals(0xAB5F980000000000L, v2[11]);
    assertEquals(0x01B8480000000000L, v2[12]);
    assertEquals(0x43CD120000000000L, v2[13]);
    assertEquals(0x7430220000000000L, v2[14]);
    assertEquals(0x5822600000000000L, v2[15]);
    assertEquals(0x0000138000000000L, v2[16]);
    assertEquals(0x0983B18000000000L, v2[17]);
    assertEquals(0x76EC298000000000L, v2[18]);
    assertEquals(0x3E3A938000000000L, v2[19]);
    assertEquals(0x01A9380000000000L, v2[20]);
    assertEquals(0xF11E2F2000000000L, v2[21]);
    assertEquals(0x7CCBF72000000000L, v2[22]);
    assertEquals(0xA900A04000000000L, v2[23]);
    assertEquals(0x0005424000000000L, v2[24]);
    assertEquals(0x24B2C76000000000L, v2[25]);
    assertEquals(0x7A8DB29800000000L, v2[26]);
    assertEquals(0x2830E7B800000000L, v2[27]);
    assertEquals(0x018C9FF800000000L, v2[28]);
    assertEquals(0xA326188800000000L, v2[29]);
    assertEquals(0x71A5BAC800000000L, v2[30]);
    assertEquals(0xE61EF73000000000L, v2[31]);
    assertEquals(0x0000004200000000L, v2[32]);
    assertEquals(0xCEB8CCA200000000L, v2[33]);
    assertEquals(0x70975FBA00000000L, v2[34]);
    assertEquals(0x8456E5AA00000000L, v2[35]);
    assertEquals(0x0182ABAAF70708F2L, v2[36]);
    assertEquals(0x0A8A3172F70708F2L, v2[37]);
    assertEquals(0x7B2819BAF70708F2L, v2[38]);
    assertEquals(0x14ED0AF0F70708F2L, v2[39]);
    assertEquals(0x00050D58F70708F2L, v2[40]);
    assertEquals(0x82EAB15800000000L, v2[41]);
    assertEquals(0x7DDC76E200000000L, v2[42]);
    assertEquals(0xD8B8B99200000000L, v2[43]);
    assertEquals(0x01A3A9BAF70708F2L, v2[44]);
    assertEquals(0x01FC0580F70708F2L, v2[45]);
    assertEquals(0x778DFD3000000000L, v2[46]);
    assertEquals(0x3F634BAAF70708F2L, v2[47]);
    assertEquals(0x000010B0F70708F2L, v2[48]);
    assertEquals(0x6B35905000000000L, v2[49]);
    assertEquals(0x750290A2F70708F2L, v2[50]);
    assertEquals(0x654AA15800000000L, v2[51]);
    assertEquals(0x01B630F2F70708F2L, v2[52]);
    assertEquals(0x8396094800000000L, v2[53]);
    assertEquals(0x7E7F6548F70708F2L, v2[54]);
    assertEquals(0xCA72E05200000000L, v2[55]);
    assertEquals(0x0005FDE800000000L, v2[56]);
    assertEquals(0x43EAB718F70708F2L, v2[57]);
    assertEquals(0x79E2CC10F70708F2L, v2[58]);
    assertEquals(0x67B300F0F70708F2L, v2[59]);
    assertEquals(0x01919590F70708F2L, v2[60]);
    assertEquals(0xE1186C98F70708F2L, v2[61]);
    assertEquals(0x73C6D85000000000L, v2[62]);
    assertEquals(0xB0FBD74AF70708F2L, v2[63]);
  }

  private static final String LS = System.lineSeparator();
  private static final byte[] EXPECTED = {100, 0, 0, 0, 64, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -128, 0, 0, 0, 0, 0, 0, 0, 64, 0, 0, 0, 0, 0, 0, 0, -32, 0, 0, 0, 0, 0, 0, 0, -48, 0, 0, 0, 0, 0, 0, 0, 88, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 70, 0, 0, 0, 0, 0, 0, 0, 7, 0, 0, 0, 0, 0, 0, -128, 34, 0, 0, 0, 0, 0, 0, 64, -95, 0, 0, 0, 0, 0, 0, 96, -58, 0, 0, 0, 0, 0, 0, -48, -83, 0, 0, 0, 0, 0, 0, 8, 29, 0, 0, 0, 0, 0, 0, -124, -109, 0, 0, 0, 0, 0, 0, 118, 103, 0, 0, 0, 0, 0, 0, 49, -2, 0, 0, 0, 0, 0, -128, 71, 81, 0, 0, 0, 0, 0, 64, 21, -58, 0, 0, 0, 0, 0, -32, -112, 84, 0, 0, 0, 0, 0, -112, -58, -9, 0, 0, 0, 0, 0, -120, -65, 30, 0, 0, 0, 0, 0, -44, -75, 31, 0, 0, 0, 0, 0, 50, -99, -47, 0, 0, 0, 0, 0, 93, -100, 122, 0, 0, 0, 0, -128, -39, 120, 49, 0, 0, 0, 0, -64, -36, 8, -76, 0, 0, 0, 0, 32, 49, -107, 64, 0, 0, 0, 0, -16, 62, 109, -105, 0, 0, 0, 0, 120, -37, 127, 49, 0, 0, 0, 0, 100, -53, -19, -125, 0, 0, 0, 0, 110, -34, 101, -124, 0, 0, 0, 0, -11, 40, -45, 29, 0, 0, 0, -128, -34, 65, 54, -111, 0, 0, 0, -64, -104, -103, 111, -58, 0, 0, 0, 96, -108, 90, -127, -127, 0, 0, 0, -80, -13, 106, 99, -22, 0, 0, 0, 56, -18, 124, 47, -19, 0, 0, 0, 116, -26, -22, 105, 81, 0, 0, 0, 54, 36, -103, -125, -7, 0, 0, 0, -3, -32, 61, -76, -19, 0, 0, -128, -105, -74, -24, -26, 37, 0, 0, 64, 93, -109, -50, -64, -39, 0, 0, 96, -27, 6, 31, 9, -94, 0, 0, 16, -84, -75, -84, -38, -72, 0, 0, 104, -83, 27, -68, 92, -53, 0, 0, 92, 62, 10, 27, 66, 1, 0, 0, -22, 22, 121, 48, 34, 112, 0, 0, -9, 10, 53, 63, 94, 119, 0, -128, 12, -20, 71, -113, 18, -69, 0, 64, 15, 6, -95, -66, -57, 6, 0, -96, 37, -26, 8, 10, 111, -5, 0, -80, 86, -8, -104, -60, -69, -31, 0, 8, -111, 107, 116, -9, 102, -59, 0, 116, 21, 116, -121, -21, 127, -44, 0, -34, 32, -97, -43, 16, 7, 33, 0, 37, -20, -128, -19, 79, -83, 8, -128, -115, -17, -103, 85, 103, -4, -113, 64, -110, 67, -106, -26, 7, -71, -45, 32, 5, 121, 124, -46, 13, 67, 61, -16, 44, -64, 119, -126, -26, 46, 118, 8, -87, -84, 57, -127, -56, -29, 67, -68, 11, -108, -96, 98, 67, 14, -126, 32, -39, -128, 67, -23, 64, -69, 64, -42, -76, -79, -84, -102, -2, -11, -115, 100, 93, 75, -37, 74, -69, 82, 47, -14, -31, 106, 71, -77, -9, -51, -5, 78, -4, -13, 103, 6, 37, -89, 67, -20, 91, -128, -30, -61, 103, -54, 10, 60, 58, -17, -21, -9, -3, -47, -111, -1, -128, 67, 81, -82, -73, 3, -88, -114, 73, -8, -31, 91, 61, 111, -125, -93, -92, -57, 89, 10, -17, 55, 50, 127, 38, -49, -92, -57, -21, -41, 52, -124, -102, 7, -119, -118, -27, 35, 90, -109, 101, 5, -52, 96, -124, 103, -25, 70, -75, -116, -10, 14, 91, 82, 59, 101, -115, 18, 118, -53, 78, -106, 49, -22, 57, -49, 30, 78, 23, 38, 59, -31, 80, -88, -30, 125, -113, -73, 118, 82, -108, -107, -74, -95, -48, -100, -92, 72, 10, 89, -9, 4, -115, -71, -5, -10, -88, 126, -29, 112, 15, -32, 45, 20, 33, 31, 75, 96, 119, 92, -42, 66, -126, -34, -51, 90, 20, 114, -96, -37, 83, -126, -65, -70, -85, 0, 50, -66, -54, -124, 7, 87, 83, 43, 40, 62, 97, -13, 101, 86, 122, -48, -11, 95, -27, -3, 78, 40, -85, 122, -83, -29, -30, -14, -97, -110, 60, -71, -2, -125, 98, -2, 8, -14, -119, 1, 104, 31, -56, -16, -122, -21, -112, -32, 87, 124, -13, -115, 41, -17, 94, 36, -57, -4, 84, -10, -93, 22, -3, -95, -91, 87, -34, -118, -98, 8, 8, -50, -95, -10, -78, -80, 121, 71, -116, 76, -116, -39, 93, 65, 5, -111, 15, 53, 90, -57, 32, 30, 79, -17, 7, 60, -103, -41, 44, -32, 19, 5, 106, 40, -114, -56, 57, 93, -93, 127, 80, 44, -61, 66, -51, -57, -55, -48, -87, 25, 110};

  public void testLanczos() throws IOException {
    final ByteArrayOutputStream bos = new ByteArrayOutputStream();
    try (final PrintStream out = new PrintStream(bos)) {
      final Lanczos lm = new Lanczos(100, 100, out, false);
      lm.init();
      lm.lanczos();
      final File result = new File("result.ker");
      assertTrue(result.exists());
      try (final BufferedInputStream is = new BufferedInputStream(new FileInputStream(result))) {
        final byte[] res = IOUtils.readData(is);
        assertTrue(Arrays.equals(EXPECTED, res));
      } finally {
        assertTrue(result.delete());
      }
    }
    assertEquals("128 64  64 solutions" + LS, bos.toString());
  }
}
