package irvine.math.q;

import junit.framework.TestCase;

/**
 * @author Sean A. Irvine.
 */
public class BernoulliSequenceTest extends TestCase {

  public void test() {
    final BernoulliSequence b = new BernoulliSequence(0);
    assertEquals(Q.ONE, b.next());
    assertEquals(new Q(-1, 2), b.next());
    assertEquals(new Q(1, 6), b.next());
    assertEquals(Q.ZERO, b.next());
    assertEquals(new Q(-1, 30), b.next());
  }
}
