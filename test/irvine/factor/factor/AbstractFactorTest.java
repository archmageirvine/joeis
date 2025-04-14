package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 * @author Sean A. Irvine
 */
public abstract class AbstractFactorTest extends TestCase {

  /** The prime validator to be tested */
  protected Factorizer mF = null;

  @Override
  public void tearDown() {
    mF = null;
  }

  public void testNullInput() {
    mF.factor(null);
  }

  public void testZeroLengthInput() {
    final FactorSequence fs = new FactorSequence();
    mF.factor(fs);
    assertEquals(0, fs.omega());
  }

  public void testPrimeInput() {
    final FactorSequence fs = new FactorSequence();
    fs.add(65537, FactorSequence.PRIME);
    mF.factor(fs);
    assertEquals(1, fs.omega());
    assertEquals(65537L, fs.toZArray()[0].longValue());
  }

  public void testProbablePrimeInput() {
    final FactorSequence fs = new FactorSequence();
    fs.add(65537, FactorSequence.PRIME);
    mF.factor(fs);
    assertEquals(1, fs.omega());
    assertEquals(65537L, fs.toZArray()[0].longValue());
  }

}
