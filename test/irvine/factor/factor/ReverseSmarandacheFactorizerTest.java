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
public class ReverseSmarandacheFactorizerTest extends AbstractFactorTest {

  @Override
  public void setUp() throws Exception {
    super.setUp();
    mF = new ReverseSmarandacheFactorizer();
  }

  public void testReverseSmarandache() {
    for (int i = 1; i < 205; ++i) {
      final FactorSequence fs = new FactorSequence();
      final Z f = Smarandache.reverseSmarandacheZ(i);
      fs.add(f);
      mF.factor(fs);
      final Z[] x = fs.toZArray();
      Z prod = Z.ONE;
      for (final Z aX : x) {
        prod = prod.multiply(aX.pow(fs.getExponent(aX)));
      }
      assertTrue("Failed on rSm(" + i + ") expected " + f + " but was " + prod + " from " + fs, f.equals(prod));
      if (i == 201) {
        assertEquals(FactorSequence.COMPOSITE, fs.getStatus(x[0]));
      }
    }
  }

  public void test11() {
    final FactorSequence fs = new FactorSequence();
    final Z f = Smarandache.reverseSmarandacheZ(11);
    fs.add(f);
    mF.factor(fs);
    final Z[] x = fs.toZArray();
    assertEquals(2, x.length);
    Arrays.sort(x);
    assertEquals(Z.THREE, x[0]);
    assertEquals(new Z("370329218107"), x[1]);
    for (final Z aX : x) {
      assertEquals(FactorSequence.PRIME, fs.getStatus(aX));
    }
  }

  public void test36() {
    final FactorSequence fs = new FactorSequence();
    final Z f = Smarandache.reverseSmarandacheZ(36);
    fs.add(f);
    mF.factor(fs);
    final Z[] x = fs.toZArray();
    assertEquals(6, x.length);
    Arrays.sort(x);
    assertEquals(Z.THREE, x[0]);
    assertEquals(Z.valueOf(11), x[1]);
    assertEquals(Z.valueOf(971), x[2]);
    assertEquals(new Z("1114060688051"), x[3]);
    assertEquals(new Z("1110675649582997517457"), x[4]);
    assertEquals(new Z("277844768201513190628337"), x[5]);
    assertEquals(2, fs.getExponent(Z.THREE));
    assertEquals(2, fs.getExponent(Z.valueOf(11)));
    for (final Z aX : x) {
      assertEquals(FactorSequence.PRIME, fs.getStatus(aX));
    }
  }

  public void test36sq() {
    final FactorSequence fs = new FactorSequence();
    final Z f = Smarandache.reverseSmarandacheZ(36);
    fs.add(f, FactorSequence.COMPOSITE, 2);
    mF.factor(fs);
    final Z[] x = fs.toZArray();
    assertEquals(6, x.length);
    Arrays.sort(x);
    assertEquals(Z.THREE, x[0]);
    assertEquals(Z.valueOf(11), x[1]);
    assertEquals(Z.valueOf(971), x[2]);
    assertEquals(new Z("1114060688051"), x[3]);
    assertEquals(new Z("1110675649582997517457"), x[4]);
    assertEquals(new Z("277844768201513190628337"), x[5]);
    for (int i = 0; i < x.length; ++i) {
      assertEquals(FactorSequence.PRIME, fs.getStatus(x[i]));
      assertEquals(i < 2 ? 4 : 2, fs.getExponent(x[i]));
    }
  }
}
