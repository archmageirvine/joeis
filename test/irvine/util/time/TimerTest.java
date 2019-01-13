package irvine.util.time;

import junit.framework.TestCase;

/**
 * Tests the corresponding class.
 *
 * @author <a href="mailto:len@reeltwo.com">len</a>
 */
public class TimerTest extends TestCase {

  protected Timer mTimer;

  /** Sets up test fixture.  */
  @Override
  public void setUp() {
    mTimer = Timer.getTimer("TimerTest");
  }

  /** Removes test fixture.  */
  @Override
  public void tearDown() {
    Timer.removeTimer("TimerTest");
    mTimer = null;
  }

  public void testAutoStart() {
    Timer t = new Timer("bob");
    assertTrue(!t.isRunning());
    t = new Timer("bob", false);
    assertTrue(!t.isRunning());
    t = new Timer("bob", true);
    assertTrue(t.isRunning());
  }

  public void testNameTimers() {
    final String name = "foogle";
    assertTrue(!Timer.containsTimer(name));
    assertNotNull(Timer.getTimer(name));
    assertTrue(Timer.containsTimer(name));
    Timer.removeTimer(name);
    assertTrue(!Timer.containsTimer(name));
  }

  public void testTimer() throws InterruptedException {
    assertEquals(0, mTimer.getElapsed());
    assertTrue(!mTimer.isRunning());
    assertNotNull(mTimer.toString());

    mTimer.stop();
    assertEquals(0, mTimer.getElapsed());
    assertTrue(!mTimer.isRunning());

    mTimer.start();
    assertTrue(mTimer.isRunning());

    Thread.sleep(200);
    final long elapsed = mTimer.getElapsed();
    assertTrue("Expected more than 200ms elapsed. Actual=" + elapsed, elapsed >= 180); // Add a little margin of error for weird OS's
    assertNotNull(mTimer.toString());

    mTimer.stop();
    assertTrue(!mTimer.isRunning());
    assertNotNull(mTimer.toString());

    mTimer.reset();
    assertEquals(0, mTimer.getElapsed());
  }

  public void testTimers() throws InterruptedException {
    assertEquals(mTimer, Timer.getTimer("TimerTest"));

    mTimer.start();
    Thread.sleep(500);

    final Timer t2 = Timer.getTimer("Another Timer");
    t2.start();
    Thread.sleep(50);

    final Timer t3 = Timer.getTimer("Yet Another Timer");
    t3.start();
    Thread.sleep(50);

    t3.stop();

    assertNotNull(Timer.namedTimerSummary());
    Timer.removeTimer("TimerTest");
    Timer.removeTimer("Another Timer");
    Timer.removeTimer("Yet Another Timer");
  }
}
