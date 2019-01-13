package irvine.util.time;

/**
 * Provides a delay mechanism with a targeted delay value.
 * @author Sean A. Irvine.
 */
public class Delay {

  /**
   * Number of frames with a 0 ms delay before the thread actively yields to other threads.
   */
  private static final int NO_DELAYS_PER_YIELD = 16;

  private final long mPeriod;
  // Number of times we have done the loop without any sleep.  This can
  // increase for high frame-rate or heavy CPU loads.  If it gets too high
  // the animator forces a yield.
  private long mNoDelayCount = 0;
  // A record is kept of how different a sleep was from what was requested
  // and on the next iteration this adjustment is applied to try and get
  // closer to the desired frame rate.
  private long mSleepAdjustment = 0;

  /**
   * Construct a new delay mechanism for given time period.
   * @param period period in nanoseconds
   */
  public Delay(final long period) {
    mPeriod = period;
  }

  /**
   * Delay for the targeted time starting from the specified time.
   * @param beforeTime time to start delay from (in the past)
   * @return true iff the sleep was interrupted
   */
  public boolean delay(final long beforeTime) {
    final long afterTime = System.nanoTime();
    final long delta = afterTime - beforeTime;
    final long sleepTime = mPeriod - delta - mSleepAdjustment;
    if (sleepTime > 0) {
      try {
        Thread.sleep(sleepTime / 1000000);
        mSleepAdjustment = System.nanoTime() - afterTime - sleepTime;
        mNoDelayCount = 0;
      } catch (final InterruptedException e) {
        // If interrupted, it means someone has requested the animation stop
        return true;
      }
    } else {
      mSleepAdjustment = 0;
      if (++mNoDelayCount >= NO_DELAYS_PER_YIELD) {
        // System is having trouble keeping up, even so it is best if the
        // animator relinquishes control of the CPU every so often.
        Thread.yield();
        mNoDelayCount = 0;
      }
    }
    return false;
  }
}
