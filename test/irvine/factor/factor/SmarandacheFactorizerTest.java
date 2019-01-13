package irvine.factor.factor;

import java.util.Arrays;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;
import irvine.nt.smarandache.Smarandache;

/**
 * Tests the corresponding class.
 *
 * @author Sean A. Irvine
 */
public class SmarandacheFactorizerTest extends AbstractFactorTest {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    mF = new SmarandacheFactorizer();
  }

  public void testSmarandache() {
    for (int i = 1; i < 205; ++i) {
      final FactorSequence fs = new FactorSequence();
      final Z f = Smarandache.smarandacheZ(i);
      fs.add(f);
      mF.factor(fs);
      final Z[] x = fs.toZArray();
      Z prod = Z.ONE;
      for (final Z aX : x) {
        prod = prod.multiply(aX.pow(fs.getExponent(aX)));
      }
      assertTrue("Failed on Sm(" + i + ") expected " + f + " but was " + prod + " from " + fs, f.equals(prod));
      if (i == 202) {
        assertEquals(FactorSequence.COMPOSITE, fs.getStatus(x[5]));
      }
    }
  }

  public void test50() {
    final FactorSequence fs = new FactorSequence();
    final Z f = Smarandache.smarandacheZ(50);
    fs.add(f);
    mF.factor(fs);
    final Z[] x = fs.toZArray();
    assertEquals(9, x.length);
    Arrays.sort(x);
    assertEquals(Z.TWO, x[0]);
    assertEquals(Z.THREE, x[1]);
    assertEquals(Z.FIVE, x[2]);
    assertEquals(Z.valueOf(13), x[3]);
    assertEquals(Z.valueOf(211), x[4]);
    assertEquals(Z.valueOf(20479), x[5]);
    assertEquals(new Z("160189818494829241"), x[6]);
    assertEquals(new Z("46218039785302111919"), x[7]);
    assertEquals(new Z("19789860528346995527543912534464764790909391"), x[8]);
    assertEquals(2, fs.getExponent(Z.FIVE));
    for (final Z v : x) {
      assertEquals(FactorSequence.PRIME, fs.getStatus(v));
    }
  }

  public void test50sq() {
    final FactorSequence fs = new FactorSequence();
    final Z f = Smarandache.smarandacheZ(50);
    fs.add(f, FactorSequence.COMPOSITE, 2);
    mF.factor(fs);
    final Z[] x = fs.toZArray();
    assertEquals(9, x.length);
    Arrays.sort(x);
    assertEquals(Z.TWO, x[0]);
    assertEquals(Z.THREE, x[1]);
    assertEquals(Z.FIVE, x[2]);
    assertEquals(Z.valueOf(13), x[3]);
    assertEquals(Z.valueOf(211), x[4]);
    assertEquals(Z.valueOf(20479), x[5]);
    assertEquals(new Z("160189818494829241"), x[6]);
    assertEquals(new Z("46218039785302111919"), x[7]);
    assertEquals(new Z("19789860528346995527543912534464764790909391"), x[8]);
    assertEquals(4, fs.getExponent(Z.FIVE));
    for (int i = 0; i < x.length; ++i) {
      assertEquals(FactorSequence.PRIME, fs.getStatus(x[i]));
      assertEquals(i == 2 ? 4 : 2, fs.getExponent(x[i]));
    }
  }
}
