package irvine.math.q;

import junit.framework.TestCase;

/**
 * @author Sean A. Irvine.
 */
public class BernoulliSequenceTest extends TestCase {

  public void test() {
    final BernoulliSequence b = new BernoulliSequence(0);
    assertEquals(Q.ONE, b.nextQ());
    assertEquals(new Q(-1, 2), b.nextQ());
    assertEquals(new Q(1, 6), b.nextQ());
    assertEquals(Q.ZERO, b.nextQ());
    assertEquals(new Q(-1, 30), b.nextQ());
  }
}
