package irvine.util.time;

import java.io.Serializable;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * Utility class for performing timing tests to millisecond accuracy.
 * Timers are assigned names so that multiple timers can be accessed
 * via a central registry.
 *
 * @author <a href="mailto:len@reeltwo.com">Len Trigg</a>
 */
public class Timer implements Serializable {

  /** Stores the named timers */
  private static final TreeMap<String, Timer> TIMERS = new TreeMap<>();


  /**
   * Returns true if the named timer exists.
   *
   * @param name the name of the Timer.
   * @return true if the named timer exists.
   */
  public static boolean containsTimer(final String name) {
    return TIMERS.containsKey(name);
  }


  /**
   * Gets a named Timer, creating if necessary.
   *
   * @param name the name of the Timer.
   * @return the Timer.
   */
  public static Timer getTimer(final String name) {
    if (name == null) {
      throw new NullPointerException();
    }
    return TIMERS.computeIfAbsent(name, Timer::new);
  }


  /**
   * Removes a named timer
   *
   * @param name the name of the Timer.
   */
  public static void removeTimer(final String name) {
    if (name == null) {
      throw new NullPointerException();
    }
    if (TIMERS.containsKey(name)) {
      TIMERS.remove(name);
    }
  }


  /** Removes all named timers */
  public static void clearNamedTimers() {
    TIMERS.clear();
  }

  /**
   * Class used for each entry when printing out the sorted summary
   * of all the named timers.
   */
  private static class TEntry implements Comparable<TEntry> {

    private final String mName;

    private final boolean mRunning;

    private final long mElapsed;

    TEntry(final String name, final boolean running, final long elapsed) {
      mName = name;
      mRunning = running;
      mElapsed = elapsed;
    }

    @Override
    public boolean equals(final Object o) {
      return o instanceof TEntry && mName.equals(((TEntry) o).mName);
    }

    @Override
    public int hashCode() {
      return mName.hashCode();
    }

    @Override
    public int compareTo(final TEntry o) {
      if (o == null) {
        return 0;
      }
      final int result = (int) (o.mElapsed - mElapsed);
      if (result == 0) {
        return mName.compareTo(o.mName);
      } else {
        return result;
      }
    }
  }


  /**
   * Displays the status of all registered Timers.
   *
   * @return a String containing timer status for all registered
   * Timers.
   */
  public static String namedTimerSummary() {
    return namedTimerSummary(0);
  }


  /**
   * Displays the status of all registered Timers exceeding the time
   * threshold.
   *
   * @param threshold number of milliseconds which Timers must exceed
   * to appear in summary.
   * @return a String containing timer status for all registered
   * Timers.
   */
  public static String namedTimerSummary(final int threshold) {
    if (TIMERS.isEmpty()) {
      return "NO TIMERS";
    }

    final String title = "TIMER NAME";

    final TreeSet<TEntry> data = new TreeSet<>();
    // Find the width of the longest timer name
    final Iterator<String> it = TIMERS.keySet().iterator();
    int maxWidth = title.length();
    int totTime = 0;
    while (it.hasNext()) {
      final String name = it.next();
      if (name.length() > maxWidth) {
        maxWidth = name.length();
      }
      final Timer t = getTimer(name);
      final TEntry te = new TEntry(name, t.isRunning(), t.getElapsed());
      totTime += te.mElapsed;
      if (te.mElapsed >= threshold) {
        data.add(te);
      }
    }

    final char[] pad = new char[maxWidth];
    Arrays.fill(pad, ' ');
    final StringBuilder sb = new StringBuilder();
    sb.append(new String(pad, 0, maxWidth - title.length()));
    sb.append(title).append(" - STATE");
    sb.append(" - PERCENT");
    sb.append(" - ELAPSED\n");
    final Iterator<TEntry> i = data.iterator();
    final DecimalFormat dfe = new DecimalFormat("##0.00");
    while (i.hasNext()) {
      final TEntry te = i.next();
      final String name = te.mName;
      sb.append(name);
      sb.append(new String(pad, 0, maxWidth - name.length()));
      sb.append("   ");
      sb.append(te.mRunning ? " (on)" : "(off)");
      sb.append("   ");
      sb.append(dfe.format((double) te.mElapsed * 100 / totTime));
      sb.append("%   ");
      sb.append(te.mElapsed).append(' ');
      sb.append('\n');
    }
    return sb.toString();
  }


  /** Total elapsed milliseconds */
  private long mElapsed;

  /** When the Timer was started - 0 if stopped */
  private long mStart;

  /** The name of this timer */
  private final String mName;


  /**
   * Creates a Timer. Create via Manager if you want access from
   * multiple locations.
   *
   * @param name the name to assign to the Timer.
   * @param startNow if true, the timer will start immediately.
   */
  public Timer(final String name, final boolean startNow) {
    mName = name;
    if (startNow) {
      start();
    }
  }


  /**
   * Creates a Timer. Create via Manager if you want access from
   * multiple locations.
   *
   * @param name the name to assign to the Timer.
   */
  public Timer(final String name) {
    this(name, false);
  }


  /**
   * Creates a Timer. Create via Manager if you want access from
   * multiple locations.
   */
  public Timer() {
    this("");
  }


  /** Starts the Timer. */
  public void start() {
    mStart = System.currentTimeMillis();
  }


  /** Stops the Timer. */
  public void stop() {
    if (mStart != 0) {
      mElapsed += System.currentTimeMillis() - mStart;
      mStart = 0;
    }
  }


  /**
   * Gets the elapsed time in milliseconds.
   *
   * @return the number of elapsed milliseconds.
   */
  public long getElapsed() {
    long elapsed = mElapsed;
    if (mStart != 0) {
      elapsed += System.currentTimeMillis() - mStart;
    }
    return elapsed;
  }


  /**
   * Gets the elapsed time in seconds.
   *
   * @return the number of elapsed Seconds.
   */
  public double getElapsedSeconds() {
    return (double) getElapsed() / 1000.00;
  }


  /**
   * Gets the elapsed number of events per second
   *
   * @param countOfEvents the number of events that occurred in the
   * elapsed time
   * @return the average number of events per second.
   */
  public double getEventsPerSecond(final double countOfEvents) {
    return countOfEvents / getElapsedSeconds();
  }


  /**
   * gets a nicely formatted string of the system in units of megabytes
   *
   * @return a String
   */
  public static String getMemoryStatus() {
    final long maxM = Runtime.getRuntime().maxMemory();
    final long totalM = Runtime.getRuntime().totalMemory();
    final long freeM = Runtime.getRuntime().freeMemory();
    final DecimalFormat dfe = new DecimalFormat("##,###");
    return "Runtime memory (MB) max "
      + dfe.format(megaBytes(maxM))
      + " total "
      + dfe.format(megaBytes(totalM))
      + " free "
      + dfe.format(megaBytes(freeM));
  }


  private static double megaBytes(final long aNumber) {
    return ((double) aNumber) / (1024.00 * 1024.00);
  }


  /**
   * Resets the timer, stopping it if it is running, and resetting the
   * elapsed time count.
   */
  public void reset() {
    mStart = 0;
    mElapsed = 0;
  }


  /**
   * Indicates whether the Timer is currently started.
   *
   * @return true if the Timer is currently started.
   */
  public boolean isRunning() {
    return mStart != 0;
  }


  /**
   * Displays the status of the Time.
   *
   * @return a String containing timer status.
   */
  public String toString() {
    return mName + " " + getElapsed()
      + (isRunning() ? " (started)" : " (stopped)");
  }
}
