package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class PPlusOneTest extends AbstractFactorTest {

  @Override
  public void setUp() {
    mF = new PPlusOne(1000L, 10000L, 4L);
  }

  public void testPPlusOne1() {
    // Lucas 254 factor found by H.C. Williams 1981
    final PPlusOne pp1 = new PPlusOne(1000000L, 100000L, 4L);
    final Z n = new Z("26487408254541486132499495083633739300801481688547");
    final FactorSequence fs = new FactorSequence();
    fs.add(n, FactorSequence.COMPOSITE);
    pp1.factor(fs, n);
    assertEquals(2, fs.omega());
    assertTrue(fs.toString().contains("347366417511089201"));
  }

  public void testPPlusOne2() {
    // 2^43-1 factor by R. Brent 1981
    final PPlusOne pp1 = new PPlusOne(1000000L, 100000L, 5L);
    final Z n = new Z("13635564370399427294705409433269934312835730393853318773631639140041572417270416250636852937811797255066088511156587808353041");
    final FactorSequence fs = new FactorSequence();
    fs.add(n, FactorSequence.COMPOSITE);
    pp1.factor(fs, n);
    assertEquals(2, fs.omega());
    assertTrue(fs.toString().contains("122551752733003055543"));
  }

}
