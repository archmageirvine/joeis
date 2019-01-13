package irvine.factor.factor;

import irvine.factor.util.FactorSequence;
import irvine.math.z.Z;

/**
 * Tests the PollardRho factoring algorithm
 *
 * @author Sean A. Irvine
 */
public class PollardRhoTest extends AbstractFactorTest {

  @Override
  public void setUp() {
    mF = new PollardRho();
  }

  public void testPollardRho() {
    final PollardRho pollard = new PollardRho();
    final Z n = new Z("323");
    final FactorSequence fs = new FactorSequence();
    fs.add(n, FactorSequence.COMPOSITE);
    pollard.factor(fs, n);
    assertEquals(2, fs.omega());
  }

}
