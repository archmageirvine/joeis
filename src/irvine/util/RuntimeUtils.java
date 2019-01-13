package irvine.util;

/**
 * Utility functions relating to the runtime environment.
 *
 * @author Sean A. Irvine
 */
public final class RuntimeUtils {

  private RuntimeUtils() { }

  /**
   * Test if we are currently in a testing environment.
   * @return true if running inside a test
   */
  public static boolean isTest() {
    final StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
    for (final StackTraceElement element : stackTrace) {
      if (element.getClassName().contains("junit")) {
        return true;
      }
    }
    return false;
  }
}
