package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public class MontgomeryPMinusOneTest extends AbstractFactorTest {

  @Override
  public void setUp() {
    mF = new MontgomeryPMinusOne(1000L, 10000L);
  }

  public void testMontgomeryPMinusOne() {
    final MontgomeryPMinusOne pm1 = new MontgomeryPMinusOne(9L, 300L);
    final Z n = new Z("323");
    final FactorSequence fs = new FactorSequence();
    fs.add(n, FactorSequence.COMPOSITE);
    pm1.factor(fs, n);
    assertEquals(2, fs.omega());
  }

  public void testMontgomeryPMinusOneHarder() {
    final MontgomeryPMinusOne pm1 = new MontgomeryPMinusOne(1000L, 200000L);
    Z n = new Z("10000004400000259");
    FactorSequence fs = new FactorSequence();
    fs.add(n, FactorSequence.COMPOSITE);
    pm1.factor(fs, n);
    assertEquals(2, fs.omega());
    assertTrue(fs.toString().contains("100000007"));
    n = new Z("100000007000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000027100001897");
    fs = new FactorSequence();
    fs.add(n, FactorSequence.COMPOSITE);
    pm1.factor(fs, n);
    assertEquals(2, fs.omega());
    assertTrue(fs.toString().contains("100000007"));
  }

  public void testMontgomeryPMinusOneHarder2() {
    final MontgomeryPMinusOne pm1 = new MontgomeryPMinusOne(200000L, 200000L);
    final Z n = new Z("10000004400000259");
    final FactorSequence fs = new FactorSequence();
    fs.add(n, FactorSequence.COMPOSITE);
    pm1.factor(fs, n);
    assertEquals(2, fs.omega());
    assertTrue(fs.toString().contains("100000007"));
  }

  /*
  public void testMontgomeryPMinusOneHarder3() {
    // use a p-1 case found by Richard Heylen
    MontgomeryPMinusOne pm1 = new MontgomeryPMinusOne(20000000, 50000000);
    final Z n = new Z("170774195619962197746845327539420344063045114147713008441710215519774388256801253758482061337681448755885213504794407112508919701258004192401");
    FactorSequence fs = new FactorSequence();
    fs.add(n, FactorSequence.COMPOSITE);
    pm1.factor(fs, n);
    assertEquals(2, fs.getNumberOfDistinctFactors());
    assertTrue(fs.toString().indexOf("34833953933150480441305582629703303") != -1);
  }
  */

}
