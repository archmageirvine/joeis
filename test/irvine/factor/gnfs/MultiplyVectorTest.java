package irvine.factor.gnfs;

import java.util.Arrays;
import java.util.Random;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class MultiplyVectorTest extends TestCase {

  private void fillRandom(final Random r, final long[] v) {
    for (int k = 0; k < v.length; ++k) {
      v[k] = r.nextLong();
    }
  }

  public void test() {
    final Random r = new Random(42);
    final long[] v = new long[10];
    fillRandom(r, v);
    final long[] m = new long[64];
    fillRandom(r, m);
    MultiplyVector.multiplyVector(v, m);
    assertEquals("[-5025562857975149833, -5843495416241995736, 5694868678511409995, 5111195811822994797, -6169532649852302182, -1782466964123969572, 6802844026563419272, 5086654115216342560, 8552898714322622292, -4004755535478349341]", Arrays.toString(v));
    assertEquals("[-7932972161263243142, 5225412161213218277, 3401954705013180109, -7882685021665525461, 7479280644280418405, 3319046561208720430, 4480915363320322627, -6319857190606852969, -2869836928343167951, -8543758667142878817, -6710783067597052960, 3469298829292464500, -6925850170928348339, 7418003196907248262, 4570921872749444077, 2239211646086049721, 873757494460322618, -4334395808006568827, -1559680376002748923, 2107833838238201081, -5774160743564731701, 5484180964675469733, -4779101528485918746, -5400980422885484434, -946611419142780960, -6379089433365199549, 5772343425471599858, -7408858681350118323, -2655219885656807891, 8761960672934039154, 3277748779688734079, -6624056298929814304, -1031450171031390543, 5259524702829643432, 4482881238130420401, -3873235749430838621, -2537102349316134084, 3478346705793868491, -865732239928562191, 2176364315651507624, -8245711687924097440, -4699703667604175291, 88300149147982563, -3167016477313581301, 5471329004555795526, -892644989812742578, -1317791382636997868, -5462188570879589747, 8428712040114093286, -8773797775320101900, -4471212298004028280, -4177448054821316245, 5176651403417411470, 7314253712654642135, 2463375043711160084, 5799377113137176397, 7018682594009148634, -1568910772398139974, -2543522582437506959, -9092327676948887835, -5455098185387787840, 7880849759451205394, -7546753805023667003, 8920360215987164466]", Arrays.toString(m));
  }

  public void testMultiplyVector() {
    final long[] m = new long[64];
    final long[] v1 = new long[100];
    for (int i = 0; i < 100; ++i) {
      v1[i] = i * i;
    }
    MultiplyVector.multiplyVector(v1, m);
    for (int k = 0; k < 50; ++k) {
      assertEquals(0x0000000000000000L, m[k]);
    }
    assertEquals(0x0000000000002249L, m[50]);
    assertEquals(0x00000000000017C5L, m[51]);
    assertEquals(0x0000000000000241L, m[52]);
    assertEquals(0x0000000000001611L, m[53]);
    assertEquals(0x0000000000003C18L, m[54]);
    assertEquals(0x00000000000010D9L, m[55]);
    assertEquals(0x00000000000011ACL, m[56]);
    assertEquals(0x0000000000003908L, m[57]);
    assertEquals(0x0000000000000080L, m[58]);
    assertEquals(0x0000000000000700L, m[59]);
    assertEquals(0x00000000000023C9L, m[60]);
    assertEquals(0x0000000000001084L, m[61]);
    assertEquals(0x0000000000000000L, m[62]);
    assertEquals(0x0000000000003D08L, m[63]);
  }

  public void testMultiplyVector2() {
    final long[] m = new long[64];
    final long[] v1 = new long[100];
    for (int i = 0; i < 100; ++i) {
      v1[i] = ~i;
    }
    MultiplyVector.multiplyVector(v1, m);
    for (int k = 0; k < 62; ++k) {
      assertEquals(0x0000000000000000L, m[k]);
    }
    assertEquals(0x0000000000000001L, m[62]);
    assertEquals(0x0000000000000002L, m[63]);
  }

  public void testMultiplyVector3() {
    final long[] m = new long[64];
    final long[] v1 = new long[100];
    for (int i = 0; i < 100; ++i) {
      v1[i] = i * i * i * i * i;
    }
    MultiplyVector.multiplyVector(v1, m);

    assertEquals(0xFFFFFFFF9028A008L, m[0]);
    assertEquals(0xFFFFFFFF9028A008L, m[1]);
    assertEquals(0xFFFFFFFF9028A008L, m[2]);
    assertEquals(0xFFFFFFFF9028A008L, m[3]);
    assertEquals(0xFFFFFFFF9028A008L, m[4]);
    assertEquals(0xFFFFFFFF9028A008L, m[5]);
    assertEquals(0xFFFFFFFF9028A008L, m[6]);
    assertEquals(0xFFFFFFFF9028A008L, m[7]);
    assertEquals(0xFFFFFFFF9028A008L, m[8]);
    assertEquals(0xFFFFFFFF9028A008L, m[9]);
    assertEquals(0xFFFFFFFF9028A008L, m[10]);
    assertEquals(0xFFFFFFFF9028A008L, m[11]);
    assertEquals(0xFFFFFFFF9028A008L, m[12]);
    assertEquals(0xFFFFFFFF9028A008L, m[13]);
    assertEquals(0xFFFFFFFF9028A008L, m[14]);
    assertEquals(0xFFFFFFFF9028A008L, m[15]);
    assertEquals(0xFFFFFFFF9028A008L, m[16]);
    assertEquals(0xFFFFFFFF9028A008L, m[17]);
    assertEquals(0xFFFFFFFF9028A008L, m[18]);
    assertEquals(0xFFFFFFFF9028A008L, m[19]);
    assertEquals(0xFFFFFFFF9028A008L, m[20]);
    assertEquals(0xFFFFFFFF9028A008L, m[21]);
    assertEquals(0xFFFFFFFF9028A008L, m[22]);
    assertEquals(0xFFFFFFFF9028A008L, m[23]);
    assertEquals(0xFFFFFFFF9028A008L, m[24]);
    assertEquals(0xFFFFFFFF9028A008L, m[25]);
    assertEquals(0xFFFFFFFF9028A008L, m[26]);
    assertEquals(0xFFFFFFFF9028A008L, m[27]);
    assertEquals(0xFFFFFFFF9028A008L, m[28]);
    assertEquals(0xFFFFFFFF9028A008L, m[29]);
    assertEquals(0xFFFFFFFF9028A008L, m[30]);
    assertEquals(0xFFFFFFFF9028A008L, m[31]);
    assertEquals(0xFFFFFFFF9028A008L, m[32]);
    assertEquals(0x0000000064C91E77L, m[33]);
    assertEquals(0x000000004BED73F1L, m[34]);
    assertEquals(0xFFFFFFFF81CDFB06L, m[35]);
    assertEquals(0x000000002C2A7885L, m[36]);
    assertEquals(0x000000004A1D4E28L, m[37]);
    assertEquals(0x0000000024B75CA1L, m[38]);
    assertEquals(0x00000000309EADB8L, m[39]);
    assertEquals(0x0000000073F8CC8EL, m[40]);
    assertEquals(0x0000000070A339CFL, m[41]);
    assertEquals(0xFFFFFFFFAAD7283BL, m[42]);
    assertEquals(0x0000000007BC7B87L, m[43]);
    assertEquals(0xFFFFFFFFFD923F1BL, m[44]);
    assertEquals(0x00000000373728B4L, m[45]);
    assertEquals(0x000000000B6E2C1DL, m[46]);
    assertEquals(0x0000000076655F1CL, m[47]);
    assertEquals(0xFFFFFFFF9180B2AAL, m[48]);
    assertEquals(0x000000003E911327L, m[49]);
    assertEquals(0xFFFFFFFFB97E8F1EL, m[50]);
    assertEquals(0x000000007A59D2AEL, m[51]);
    assertEquals(0x000000005FFF2F59L, m[52]);
    assertEquals(0x00000000478B2C58L, m[53]);
    assertEquals(0x000000007419F809L, m[54]);
    assertEquals(0x00000000315968D0L, m[55]);
    assertEquals(0x000000002BD49176L, m[56]);
    assertEquals(0x0000000060400DA4L, m[57]);
    assertEquals(0x000000006724D0C1L, m[58]);
    assertEquals(0x00000000612F2D93L, m[59]);
    assertEquals(0xFFFFFFFF85EBBE00L, m[60]);
    assertEquals(0x0000000058D770C0L, m[61]);
    assertEquals(0x0000000050F8F093L, m[62]);
    assertEquals(0x000000006A7A4A32L, m[63]);

  }

}
