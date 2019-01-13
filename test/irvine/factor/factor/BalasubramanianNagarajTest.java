package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Tests the BalasubramanianNagaraj factoring algorithm
 *
 * @author Sean A. Irvine
 */
public class BalasubramanianNagarajTest extends AbstractFactorTest {

  @Override
  public void setUp() {
    mF = new BalasubramanianNagaraj();
  }

  public void test1009() {
    FactorSequence fs = new FactorSequence();
    fs.add(Z.valueOf(1009L).pow(17), FactorSequence.COMPOSITE);
    mF.factor(fs);
    assertEquals(1, fs.omega());
    assertEquals(17, fs.getExponent(Z.valueOf(1009L)));

    fs = new FactorSequence();
    fs.add(new Z("111111111111111111111111111111227").pow(7));
    mF.factor(fs);
    assertEquals(1, fs.omega());
    assertEquals(7, fs.getExponent(new Z("111111111111111111111111111111227")));

    fs = new FactorSequence();
    fs.add(Z.valueOf(3L).pow(257));
    mF.factor(fs);
    assertEquals(1, fs.omega());
    assertEquals(257, fs.getExponent(Z.THREE));
  }

  public void testMinimalism() {
    final FactorSequence fs = new FactorSequence();
    fs.add(Z.valueOf(3L).pow(35), FactorSequence.COMPOSITE);
    mF.factor(fs);
    assertEquals(1, fs.omega());
    assertEquals(35, fs.getExponent(Z.THREE));
  }

}
